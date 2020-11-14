package com.kkndesasendang.sendangsmartlearning.ui.match;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kkndesasendang.sendangsmartlearning.R;
import com.kkndesasendang.sendangsmartlearning.model.MatchQuestionModel;
import com.kkndesasendang.sendangsmartlearning.ui.learn.audioVisual.AudioVisualChildFragment;
import com.kkndesasendang.sendangsmartlearning.ui.learn.audioVisual.ViewPagerAdapter;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

public class PlayMatchParentFragment extends Fragment {
    public static final String EXTRA_INDEX = "extra_quiz_index";
    public static final String EXTRA_VP_ID = "extra_view_pager_id";
    private MatchViewModel mMatchViewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_play_match, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mMatchViewModel = new ViewModelProvider(requireActivity()).get(MatchViewModel.class);
        final ViewPager2 mViewPager = view.findViewById(R.id.playMatchParentViewPager);
        final MatchViewPagerAdapter mAdapter = new MatchViewPagerAdapter(this);
        final List<Fragment> fragments = new ArrayList<>();
        final TextView mTVQuestionTitle = view.findViewById(R.id.playMatchParentTitle);

        mMatchViewModel.getMatchQuestions().observe(getViewLifecycleOwner(), new Observer<ArrayList<MatchQuestionModel>>() {
            @Override
            public void onChanged(ArrayList<MatchQuestionModel> matchQuestionModels) {
                for (int i = 0 ; i < matchQuestionModels.size(); i++) {
                    Bundle bundle = new Bundle();
                    bundle.putInt(PlayMatchParentFragment.EXTRA_INDEX, i);
                    bundle.putInt(PlayMatchParentFragment.EXTRA_VP_ID, R.id.playMatchParentViewPager);
                    AnswerQuestionFragment answerQuestionFragment = new AnswerQuestionFragment();
                    answerQuestionFragment.setArguments(bundle);
                    RankingFragment rankingFragment = new RankingFragment();
                    rankingFragment.setArguments(bundle);
                    fragments.add(answerQuestionFragment);
                    fragments.add(rankingFragment);
                }
                MatchFinishedFragment matchFinishedFragment = new MatchFinishedFragment();
                fragments.add(matchFinishedFragment);

                mAdapter.setFragments(fragments);
                mViewPager.setAdapter(mAdapter);
            }
        });

        mViewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);

                if (position == 0) {
                    mTVQuestionTitle.setText(getString(R.string.play_match_question_num, position + 1));
                } else if (position % 2 == 0) {
                    mTVQuestionTitle.setText(getString(R.string.play_match_question_num, position / 2 + 1));
                }

                if (position == mAdapter.getItemCount() - 1){
                    mTVQuestionTitle.setText(getString(R.string.match_finished));
                }
            }
        });
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mMatchViewModel.disconnectSocket();
    }
}