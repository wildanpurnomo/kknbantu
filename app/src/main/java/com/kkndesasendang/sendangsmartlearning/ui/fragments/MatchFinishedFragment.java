package com.kkndesasendang.sendangsmartlearning.ui.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.Button;

import com.kkndesasendang.sendangsmartlearning.R;
import com.kkndesasendang.sendangsmartlearning.model.RankingModel;
import com.kkndesasendang.sendangsmartlearning.ui.rvAdapters.RankingListAdapter;
import com.kkndesasendang.sendangsmartlearning.viewModels.MatchViewModel;

import java.util.ArrayList;

public class MatchFinishedFragment extends Fragment {
    private MatchViewModel mMatchViewModel;
    private RecyclerView mRankingListRV;
    private RankingListAdapter mListAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_match_finished, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mMatchViewModel = new ViewModelProvider(requireActivity()).get(MatchViewModel.class);
        mRankingListRV = view.findViewById(R.id.matchFInishedRank);
        mListAdapter = new RankingListAdapter();
        LayoutAnimationController animController = AnimationUtils.loadLayoutAnimation(requireContext(), R.anim.layout_animation_fall_down);

        mRankingListRV.setLayoutAnimation(animController);
        mRankingListRV.setLayoutManager(new LinearLayoutManager(requireContext()));
        mRankingListRV.setHasFixedSize(true);
        mRankingListRV.setAdapter(mListAdapter);

        final Button mFinishButton = view.findViewById(R.id.matchFinishedToMainMenu);
        mFinishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                requireActivity().onBackPressed();
            }
        });

        mMatchViewModel.getCurrentRanking().observe(getViewLifecycleOwner(), new Observer<ArrayList<RankingModel>>() {
            @Override
            public void onChanged(ArrayList<RankingModel> rankingModels) {
                mListAdapter.updateDataset(rankingModels);
            }
        });
    }
}