package com.kkndesasendang.sendangsmartlearning.ui.match;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.github.nkzawa.emitter.Emitter;
import com.github.nkzawa.socketio.client.IO;
import com.github.nkzawa.socketio.client.Socket;
import com.kkndesasendang.sendangsmartlearning.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.net.URISyntaxException;

import static com.kkndesasendang.sendangsmartlearning.helper.Helper.logMessage;

public class FindMatchFragment extends Fragment {
    private Socket mSocket;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_find_match, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button testBtn = view.findViewById(R.id.testBtn);
        testBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSocket.emit("requestMatch", "Android");
            }
        });
        nkzawaSocketConnect();
    }

    private void nkzawaSocketConnect() {
        try {
            mSocket = IO.socket("http://192.168.100.72:4000");
        } catch (URISyntaxException e) {
            e.printStackTrace();
            return;
        }
        mSocket.on("matchUpdated", new Emitter.Listener() {
            @Override
            public void call(final Object... args) {
                if (getActivity() != null) {
                    getActivity().runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            JSONObject data = (JSONObject) args[0];
                            try {
                                logMessage("matchUpdated event returns:  " + data.get("participants").toString(), this.getClass().getName());
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                    });
                }
            }
        });
        mSocket.connect();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mSocket.close();
    }
}