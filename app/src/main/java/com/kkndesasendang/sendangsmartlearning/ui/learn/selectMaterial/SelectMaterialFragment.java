package com.kkndesasendang.sendangsmartlearning.ui.learn.selectMaterial;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.kkndesasendang.sendangsmartlearning.R;
import com.kkndesasendang.sendangsmartlearning.model.AudioVisualContentModel;
import com.kkndesasendang.sendangsmartlearning.model.AudioVisualMaterialModel;
import com.kkndesasendang.sendangsmartlearning.model.MaterialModel;

import java.util.ArrayList;

public class SelectMaterialFragment extends Fragment implements MaterialListAdapter.OnItemClickCallback {
    private RecyclerView mRVMaterialList;
    private TextView mTVEmptyPrompt;

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

        SelectMaterialViewModel mSelectMaterialViewModel = new ViewModelProvider(this).get(SelectMaterialViewModel.class);
        mSelectMaterialViewModel.setMaterialList();

        LayoutAnimationController animController = AnimationUtils.loadLayoutAnimation(requireContext(), R.anim.layout_animation_fall_down);

        mRVMaterialList.setLayoutManager(new LinearLayoutManager(requireContext()));
        mRVMaterialList.setHasFixedSize(true);
        mRVMaterialList.setLayoutAnimation(animController);
        final MaterialListAdapter adapter = new MaterialListAdapter();
        adapter.setOnItemClickCallback(this);
        mRVMaterialList.setAdapter(adapter);

        mSelectMaterialViewModel.getMaterialList().observe(getViewLifecycleOwner(), new Observer<ArrayList<MaterialModel>>() {
            @Override
            public void onChanged(ArrayList<MaterialModel> materialModels) {
                adapter.updateDataset(materialModels);
            }
        });
    }

    @Override
    public void onItemClick(MaterialModel data, View view) {
        if (data.getClass() == AudioVisualMaterialModel.class) {
            AudioVisualContentModel avContents[] = ((AudioVisualMaterialModel) data).getContents().toArray(new AudioVisualContentModel[0]);
            Navigation.findNavController(view).navigate(SelectMaterialFragmentDirections.actionNavSelectMaterialToNavAudioVisual(avContents, data.getMaterialName()));
        }
    }
}