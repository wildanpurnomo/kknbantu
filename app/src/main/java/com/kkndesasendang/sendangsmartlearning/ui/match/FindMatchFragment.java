package com.kkndesasendang.sendangsmartlearning.ui.match;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.afollestad.materialdialogs.MaterialDialog;
import com.kkndesasendang.sendangsmartlearning.R;
import com.kkndesasendang.sendangsmartlearning.wsutil.SocketEventEnum;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import static com.kkndesasendang.sendangsmartlearning.helper.Helper.logMessage;
import static com.kkndesasendang.sendangsmartlearning.helper.Helper.popToast;

public class FindMatchFragment extends Fragment {
    private MaterialDialog mFindingMatchDialog;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_find_match, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mFindingMatchDialog = new MaterialDialog.Builder(requireContext())
                .title("Lomba sedang disiapkan")
                .content("Mencoba menghubungi server...")
                .build();
        final MatchViewModel mMatchViewModel = new ViewModelProvider(requireActivity()).get(MatchViewModel.class);
        final EditText mUsernameEditText = view.findViewById(R.id.fragFindMatchET);
        mMatchViewModel.initViewModel();
        Button mFindMatchButton = view.findViewById(R.id.fragFindMatchBtn);

        mFindMatchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setEnabled(false);
                mFindingMatchDialog.show();
                String username = mUsernameEditText.getText().toString().trim();
                if (!username.isEmpty()) {
                    mMatchViewModel.connectSocket();
                }
            }
        });

        mMatchViewModel.getMatchUpdatedEventData().observe(getViewLifecycleOwner(), new Observer<JSONObject>() {
            @Override
            public void onChanged(JSONObject jsonObject) {
                try {
                    JSONArray participants = jsonObject.getJSONArray("participants");
                    mFindingMatchDialog.setContent("Peserta bergabung: " + participants.length() + "/5");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });

        mMatchViewModel.getMatchReadyEventData().observe(getViewLifecycleOwner(), new Observer<JSONObject>() {
            @Override
            public void onChanged(JSONObject jsonObject) {
                proceedToPlayMatch();
            }
        });

        mMatchViewModel.getConnectionEventData().observe(getViewLifecycleOwner(), new Observer<JSONObject>() {
            @Override
            public void onChanged(JSONObject jsonObject) {
                logMessage("onConnection", this.getClass().getName());
                JSONObject payload = new JSONObject();
                String username = mUsernameEditText.getText().toString().trim();
                try {
                    payload.put("username", username);
                    mMatchViewModel.sendEvent(SocketEventEnum.REQUEST_MATCH.label, payload);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

    }

    private void proceedToPlayMatch() {
        mFindingMatchDialog.dismiss();
        Navigation.findNavController(requireView()).navigate(R.id.action_nav_match_to_nav_play_match);
        popToast(requireContext(), "Lomba berhasil dibuat");
    }
}