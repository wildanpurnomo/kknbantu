package com.kkndesasendang.sendangsmartlearning.ui.match;

import android.app.AlertDialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.TextView;

import com.kkndesasendang.sendangsmartlearning.R;
import com.kkndesasendang.sendangsmartlearning.model.RankingModel;
import com.kkndesasendang.sendangsmartlearning.wsutil.SocketEventEnum;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.kkndesasendang.sendangsmartlearning.helper.Helper.logMessage;

public class AnswerQuestionFragment extends Fragment implements OptionListAdapter.OnItemClickCallback {
    private MatchViewModel mMatchViewModel;
    private AlertDialog mWaitingDialog;
    private ViewPager2 mParentViewPager;

    private TextView mTVTimer, mTVQuestionText;
    private OptionListAdapter mOptionListAdapter;

    private int mQuizIndex, mParentViewPagerId;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_answer_question, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (getArguments() != null) {
            mQuizIndex = getArguments().getInt(PlayMatchParentFragment.EXTRA_INDEX);
            mParentViewPagerId = getArguments().getInt(PlayMatchParentFragment.EXTRA_VP_ID);
        }
        mParentViewPager = getActivity().findViewById(mParentViewPagerId);
        mMatchViewModel = new ViewModelProvider(requireActivity()).get(MatchViewModel.class);
        mWaitingDialog = new AlertDialog.Builder(requireActivity())
                .setTitle("Menunggu jawaban peserta lain")
                .setMessage("Anda telah menjawab pertanyaan ini. Mohon menunggu peserta lain.")
                .create();
        mTVTimer = view.findViewById(R.id.answerQuestionFragTimer);
        mTVQuestionText = view.findViewById(R.id.answerQuestionFragQuestionText);
        final RecyclerView mOptionRV = view.findViewById(R.id.answerQuestionFragOptionsRV);

        LayoutAnimationController animController = AnimationUtils.loadLayoutAnimation(requireContext(), R.anim.layout_animation_fall_down);
        mOptionListAdapter = new OptionListAdapter();
        mOptionListAdapter.setOnItemClickCallback(this);
        mOptionRV.setLayoutManager(new LinearLayoutManager(requireContext()));
        mOptionRV.setHasFixedSize(true);
        mOptionRV.setLayoutAnimation(animController);
        mOptionRV.setAdapter(mOptionListAdapter);
    }

    @Override
    public void onItemClick(String option, View view) {
        mWaitingDialog.show();
        boolean isAnswerCorrect = option.equalsIgnoreCase(mMatchViewModel.mAnswer.getValue());
        logMessage("User choose " + option + ", " + isAnswerCorrect, this.getClass().getName());
        submitAnswer(isAnswerCorrect);
    }

    @Override
    public void onResume() {
        super.onResume();
        mMatchViewModel.getQuizzes().observe(getViewLifecycleOwner(), new Observer<JSONArray>() {
            @Override
            public void onChanged(JSONArray jsonArray) {
                try {
                    JSONObject item = jsonArray.getJSONObject(mQuizIndex);
                    String answer = item.getString("answer");
                    mMatchViewModel.mAnswer.setValue(answer);

                    String questionText = item.getString("question");
                    mTVQuestionText.setText(questionText);

                    JSONArray optionJsonArr = item.getJSONArray("options");
                    ArrayList<String> options = new ArrayList<>();
                    for (int i = 0; i < optionJsonArr.length(); i++) {
                        options.add(optionJsonArr.getString(i));
                    }
                    mOptionListAdapter.updateDataset(options);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });

        mMatchViewModel.getOneQuestionFinishedEventData().observe(getViewLifecycleOwner(), new Observer<JSONObject>() {
            @Override
            public void onChanged(JSONObject jsonObject) {
                try {
                    JSONArray scores = jsonObject.getJSONArray("participantScores");

                    ArrayList<String> participants = mMatchViewModel.mParticipants.getValue();
                    ArrayList<RankingModel> rankings = new ArrayList<>();
                    for (int i = 0; i < scores.length(); i++) {
                        RankingModel ranking = new RankingModel(participants.get(i), scores.getInt(i));
                        rankings.add(ranking);
                    }

                    Collections.sort(rankings);

                    mMatchViewModel.mCurrentRanking.setValue(rankings);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                mWaitingDialog.dismiss();
                mParentViewPager.setCurrentItem(mParentViewPager.getCurrentItem() + 1);
            }
        });
    }

    private void submitAnswer(boolean isAnswerCorrect) {
        JSONObject payload = new JSONObject();
        try {
            payload.put("matchId", mMatchViewModel.mMatchId.getValue());
            payload.put("participantIndex", mMatchViewModel.mParticipantIndex.getValue());
            payload.put("isAnswerCorrect", isAnswerCorrect);
            mMatchViewModel.sendEvent(SocketEventEnum.SUBMIT_ANSWER.label, payload);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}