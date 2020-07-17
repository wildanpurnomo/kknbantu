package com.kkndesasendang.sendangsmartlearning.ui.learn.selectGrade;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.kkndesasendang.sendangsmartlearning.R;
import com.kkndesasendang.sendangsmartlearning.model.Grade;

import java.util.ArrayList;

public class SelectGradeFragment extends Fragment {
    private RecyclerView mRecyclerViewGradeList;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_select_grade, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        SelectGradeViewModel mSelectGradeViewModel = new ViewModelProvider(this).get(SelectGradeViewModel.class);
        mRecyclerViewGradeList = view.findViewById(R.id.selectClassList);
        mRecyclerViewGradeList.setLayoutManager(new LinearLayoutManager(requireContext()));
        mRecyclerViewGradeList.setHasFixedSize(true);

        mSelectGradeViewModel.setGradeList();
        mSelectGradeViewModel.getGradeList().observe(getViewLifecycleOwner(), new Observer<ArrayList<Grade>>() {
            @Override
            public void onChanged(ArrayList<Grade> grades) {
                mRecyclerViewGradeList.setAdapter(new GradeListAdapter(grades));
            }
        });
    }
}