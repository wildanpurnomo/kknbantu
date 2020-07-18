package com.kkndesasendang.sendangsmartlearning.ui.learn.selectMaterial;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.TextView;

import com.kkndesasendang.sendangsmartlearning.R;
import com.kkndesasendang.sendangsmartlearning.model.AudioVisualContent;
import com.kkndesasendang.sendangsmartlearning.model.AudioVisualMaterial;
import com.kkndesasendang.sendangsmartlearning.model.Material;
import com.kkndesasendang.sendangsmartlearning.ui.learn.selectLearningMode.SelectLearningModeFragmentArgs;

import java.util.ArrayList;
import java.util.Arrays;

import static android.content.ContentValues.TAG;

public class SelectMaterialFragment extends Fragment implements MaterialListAdapter.OnItemClickCallback {
    private RecyclerView mRVMaterialList;
    private TextView mTVEmptyPrompt;

    private Material[] materials;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_select_material, container, false);
        mRVMaterialList = view.findViewById(R.id.selectMaterialList);
        mTVEmptyPrompt = view.findViewById(R.id.selectMaterialEmptyListPrompt);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        if (getArguments() != null) {
            materials = SelectMaterialFragmentArgs.fromBundle(getArguments()).getMaterials();
            if (materials.length == 0) mTVEmptyPrompt.setVisibility(View.VISIBLE);
        }

        LayoutAnimationController animController = AnimationUtils.loadLayoutAnimation(requireContext(), R.anim.layout_animation_fall_down);

        mRVMaterialList.setLayoutManager(new LinearLayoutManager(requireContext()));
        mRVMaterialList.setHasFixedSize(true);
        mRVMaterialList.setLayoutAnimation(animController);
        MaterialListAdapter adapter = new MaterialListAdapter();
        adapter.setOnItemClickCallback(this);
        adapter.updateDataset(new ArrayList<>(Arrays.asList(materials)));
        mRVMaterialList.setAdapter(adapter);
    }

    @Override
    public void onItemClick(Material data, View view) {
        if (data.getClass() == AudioVisualMaterial.class) {
            AudioVisualContent avContents[] = ((AudioVisualMaterial) data).getContents().toArray(new AudioVisualContent[0]);
            Navigation.findNavController(view).navigate(SelectMaterialFragmentDirections.actionNavSelectMaterialToNavAudioVisual(avContents));
        }
    }
}