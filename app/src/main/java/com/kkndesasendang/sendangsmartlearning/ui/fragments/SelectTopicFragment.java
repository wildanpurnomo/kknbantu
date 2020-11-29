package com.kkndesasendang.sendangsmartlearning.ui.fragments;

import android.os.Bundle;
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
import com.kkndesasendang.sendangsmartlearning.model.GamaselaMaterialModel;
import com.kkndesasendang.sendangsmartlearning.model.GamaselaTopicModel;
import com.kkndesasendang.sendangsmartlearning.ui.rvAdapters.TopicListAdapter;
import com.kkndesasendang.sendangsmartlearning.viewModels.SelectTopicViewModel;

import java.util.ArrayList;
import java.util.Objects;

public class SelectTopicFragment extends Fragment implements TopicListAdapter.OnItemClickCallback {
    private RecyclerView mRVMaterialList;
    private SelectTopicViewModel mViewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_select_topic, container, false);
        mRVMaterialList = view.findViewById(R.id.selectTopicList);
        mViewModel = new ViewModelProvider(this).get(SelectTopicViewModel.class);
        mViewModel.setTopics();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        LayoutAnimationController animController = AnimationUtils.loadLayoutAnimation(requireContext(), R.anim.layout_animation_fall_down);

        mRVMaterialList.setLayoutManager(new LinearLayoutManager(requireContext()));
        mRVMaterialList.setHasFixedSize(true);
        mRVMaterialList.setLayoutAnimation(animController);
        final TopicListAdapter adapter = new TopicListAdapter();
        adapter.setOnItemClickCallback(this);
        mRVMaterialList.setAdapter(adapter);

        mViewModel.getTopics().observe(getViewLifecycleOwner(), new Observer<ArrayList<GamaselaTopicModel>>() {
            @Override
            public void onChanged(ArrayList<GamaselaTopicModel> gamaselaTopicModels) {
                adapter.updateDataset(gamaselaTopicModels);
            }
        });
    }
    @Override
    public void onItemClick(GamaselaTopicModel data, View view) {
        GamaselaMaterialModel materials[] = Objects.requireNonNull(data.getMaterialContents()).toArray(new GamaselaMaterialModel[0]);
        Navigation.findNavController(view).navigate(SelectTopicFragmentDirections.actionNavSelectMaterialToNavAudioVisual(materials, data.getTopicName()));
    }
}