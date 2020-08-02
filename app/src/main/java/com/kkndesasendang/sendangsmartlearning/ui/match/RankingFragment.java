package com.kkndesasendang.sendangsmartlearning.ui.match;

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
import com.kkndesasendang.sendangsmartlearning.model.RankingModel;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import static com.kkndesasendang.sendangsmartlearning.helper.Helper.logMessage;

public class RankingFragment extends Fragment {
    private MatchViewModel mMatchViewModel;
    private int mQuizIndex;

    private RecyclerView mRankingRV;
    private RankingListAdapter mRankingAdapter;
    private ViewPager2 mParentViewPager;

    private TextView mTVQuestion, mTVAnswer, mTVNextQuestionPrompt;

    private CountDownTimer mTimer;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ranking, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        if (getArguments() != null) {
            mQuizIndex = getArguments().getInt(PlayMatchParentFragment.EXTRA_INDEX);
            int parentVPId = getArguments().getInt(PlayMatchParentFragment.EXTRA_VP_ID);
            mParentViewPager = getActivity().findViewById(parentVPId);
        }
        mTVQuestion = view.findViewById(R.id.rankingCurrentQuestion);
        mTVAnswer = view.findViewById(R.id.rankingCorrectAnswer);
        mTVNextQuestionPrompt = view.findViewById(R.id.rankingNextQuestionIn);


        LayoutAnimationController animController = AnimationUtils.loadLayoutAnimation(requireContext(), R.anim.layout_animation_fall_down);
        mRankingRV = view.findViewById(R.id.rankingListRV);
        mRankingAdapter = new RankingListAdapter();

        mRankingRV.setLayoutManager(new LinearLayoutManager(requireContext()));
        mRankingRV.setHasFixedSize(true);
        mRankingRV.setLayoutAnimation(animController);
        mRankingRV.setAdapter(mRankingAdapter);

        mMatchViewModel = new ViewModelProvider(requireActivity()).get(MatchViewModel.class);
    }

    @Override
    public void onResume() {
        super.onResume();
        mTimer = new CountDownTimer(5000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                mTVNextQuestionPrompt.setText(getString(R.string.next_question_countdown, millisUntilFinished / 1000));
            }

            @Override
            public void onFinish() {
                mParentViewPager.setCurrentItem(mParentViewPager.getCurrentItem() + 1);
            }
        };
        mTimer.start();

        mMatchViewModel.getQuizzes().observe(getViewLifecycleOwner(), new Observer<JSONArray>() {
            @Override
            public void onChanged(JSONArray jsonArray) {
                try {
                    JSONObject item = jsonArray.getJSONObject(mQuizIndex);

                    String questionTest = item.getString("question");
                    mTVQuestion.setText(questionTest);

                    JSONArray optionJsonArr = item.getJSONArray("options");
                    String correctAnswer = mMatchViewModel.mAnswer.getValue();

                    if (correctAnswer != null) {
                        if (correctAnswer.equalsIgnoreCase("A")) {
                            mTVAnswer.setText(getString(R.string.correct_answer_placeholder, optionJsonArr.getString(0)));
                        } else if (correctAnswer.equalsIgnoreCase("B")) {
                            mTVAnswer.setText(getString(R.string.correct_answer_placeholder, optionJsonArr.getString(1)));
                        } else if (correctAnswer.equalsIgnoreCase("C")) {
                            mTVAnswer.setText(getString(R.string.correct_answer_placeholder, optionJsonArr.getString(2)));
                        } else {
                            mTVAnswer.setText(getString(R.string.correct_answer_placeholder, optionJsonArr.getString(3)));
                        }
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });

        mMatchViewModel.getCurrentRanking().observe(getViewLifecycleOwner(), new Observer<ArrayList<RankingModel>>() {
            @Override
            public void onChanged(ArrayList<RankingModel> rankingModels) {
                mRankingAdapter.updateDataset(rankingModels);
            }
        });
    }
}