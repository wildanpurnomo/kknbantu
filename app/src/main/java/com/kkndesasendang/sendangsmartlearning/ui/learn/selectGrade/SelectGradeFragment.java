package com.kkndesasendang.sendangsmartlearning.ui.learn.selectGrade;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.kkndesasendang.sendangsmartlearning.R;
import com.kkndesasendang.sendangsmartlearning.model.Grade;
import com.kkndesasendang.sendangsmartlearning.ui.MainActivity;
import com.kkndesasendang.sendangsmartlearning.ui.SplashScreenActivity;

import java.util.ArrayList;

public class SelectGradeFragment extends Fragment implements GradeListAdapter.OnItemClickCallback {
    private RecyclerView mRecyclerViewGradeList;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_select_grade, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        LayoutAnimationController animController = AnimationUtils.loadLayoutAnimation(requireContext(), R.anim.layout_animation_fall_down);

        SelectGradeViewModel mSelectGradeViewModel = new ViewModelProvider(this).get(SelectGradeViewModel.class);
        mRecyclerViewGradeList = view.findViewById(R.id.selectClassList);
        mRecyclerViewGradeList.setLayoutManager(new LinearLayoutManager(requireContext()));
        mRecyclerViewGradeList.setHasFixedSize(true);
        mRecyclerViewGradeList.setLayoutAnimation(animController);

        final GradeListAdapter adapter = new GradeListAdapter();
        adapter.setOnItemClickCallback(this);
        mRecyclerViewGradeList.setAdapter(adapter);

        mSelectGradeViewModel.setGradeList();
        mSelectGradeViewModel.getGradeList().observe(getViewLifecycleOwner(), new Observer<ArrayList<Grade>>() {
            @Override
            public void onChanged(ArrayList<Grade> grades) {
                adapter.updateDataset(grades);
            }
        });
    }

    @Override
    public void onItemClick(Grade data, View view) {
        Navigation.findNavController(view).navigate(SelectGradeFragmentDirections.actionNavLearnToNavLearningMode(data));
    }
}