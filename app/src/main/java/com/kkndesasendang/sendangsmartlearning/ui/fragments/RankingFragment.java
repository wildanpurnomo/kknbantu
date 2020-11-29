package com.kkndesasendang.sendangsmartlearning.ui.fragments;

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
import com.kkndesasendang.sendangsmartlearning.ui.fragments.PlayMatchParentFragment;
import com.kkndesasendang.sendangsmartlearning.ui.rvAdapters.RankingListAdapter;
import com.kkndesasendang.sendangsmartlearning.viewModels.MatchViewModel;

import java.util.ArrayList;

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

        LayoutAnimationController animController = AnimationUtils.loadLayoutAnimation(requireContext(), R.anim.layout_animation_fall_down);
        mRankingRV = view.findViewById(R.id.rankingListRV);
        mRankingAdapter = new RankingListAdapter();

        mRankingRV.setLayoutManager(new LinearLayoutManager(requireContext()));
        mRankingRV.setHasFixedSize(true);
        mRankingRV.setLayoutAnimation(animController);
        mRankingRV.setAdapter(mRankingAdapter);

        mMatchViewModel = new ViewModelProvider(requireActivity()).get(MatchViewModel.class);

        mMatchViewModel.getCurrentRanking().observe(getViewLifecycleOwner(), new Observer<ArrayList<RankingModel>>() {
            @Override
            public void onChanged(ArrayList<RankingModel> rankingModels) {
                mRankingAdapter.updateDataset(rankingModels);
            }
        });

        mMatchViewModel.getMatchQuestions().observe(getViewLifecycleOwner(), new Observer<ArrayList<MatchQuestionModel>>() {
            @Override
            public void onChanged(ArrayList<MatchQuestionModel> matchQuestionModels) {
                MatchQuestionModel currentQuestion = matchQuestionModels.get(mQuizIndex);
                mTVQuestion.setText(currentQuestion.getQuestionText());
                mTVAnswer.setText(currentQuestion.getAnswerFullText());
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        mTimer.start();
    }
}