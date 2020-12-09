package com.kkndesasendang.sendangsmartlearning.ui.fragments;

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

import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.TextView;

import com.kkndesasendang.sendangsmartlearning.R;
import com.kkndesasendang.sendangsmartlearning.model.MatchQuestionModel;
import com.kkndesasendang.sendangsmartlearning.model.RankingModel;
import com.kkndesasendang.sendangsmartlearning.ui.rvAdapters.OptionListAdapter;
import com.kkndesasendang.sendangsmartlearning.viewModels.MatchViewModel;
import com.kkndesasendang.sendangsmartlearning.wsutil.SocketEventEnum;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collections;

import static com.kkndesasendang.sendangsmartlearning.helper.Helper.logMessage;

public class AnswerQuestionFragment extends Fragment implements OptionListAdapter.OnItemClickCallback {
    private MatchViewModel mMatchViewModel;
    private AlertDialog mWaitingDialog;
    private ViewPager2 mParentViewPager;

    private TextView mTVTimer, mTVQuestionText;
    private OptionListAdapter mOptionListAdapter;
    private CountDownTimer mCountDownTimer;

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
                .setCancelable(false)
                .create();
        mTVTimer = view.findViewById(R.id.answerQuestionFragTimer);
        mTVQuestionText = view.findViewById(R.id.answerQuestionFragQuestionText);
        final RecyclerView mOptionRV = view.findViewById(R.id.answerQuestionFragOptionsRV);

        mCountDownTimer = new CountDownTimer(10000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                mTVTimer.setText(getString(R.string.answer_question_timer, millisUntilFinished / 1000));
            }

            @Override
            public void onFinish() {
                mWaitingDialog.setMessage("Anda tidak menjawab pertanyaan ini. Mohon menunggu peserta lain.");
                submitAnswer(false);
            }
        };

        mOptionListAdapter = new OptionListAdapter();
        mOptionListAdapter.setOnItemClickCallback(this);
        mOptionRV.setLayoutManager(new LinearLayoutManager(requireContext()));
        mOptionRV.setHasFixedSize(true);
        mOptionRV.setAdapter(mOptionListAdapter);

        mMatchViewModel.getMatchQuestions().observe(getViewLifecycleOwner(), new Observer<ArrayList<MatchQuestionModel>>() {
            @Override
            public void onChanged(ArrayList<MatchQuestionModel> matchQuestionModels) {
                MatchQuestionModel currentQuestion = matchQuestionModels.get(mQuizIndex);
                mTVQuestionText.setText(currentQuestion.getQuestionText());
                mOptionListAdapter.updateDataset(currentQuestion.getOptions());
            }
        });

    }

    @Override
    public void onItemClick(String option, View view) {
        mCountDownTimer.cancel();
        String currentAnswer = mMatchViewModel.getMatchQuestions().getValue().get(mQuizIndex).getAnswer();
        boolean isAnswerCorrect = option.equalsIgnoreCase(currentAnswer);
        logMessage("User choose " + option + ", " + isAnswerCorrect, this.getClass().getName());
        submitAnswer(isAnswerCorrect);
    }

    @Override
    public void onResume() {
        super.onResume();
        mCountDownTimer.start();

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
        mWaitingDialog.show();

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