package com.kkndesasendang.sendangsmartlearning.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.kkndesasendang.sendangsmartlearning.R;
import com.mukesh.MarkdownView;

public class DisplayMaterialFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_display_material, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        if (getArguments() != null) {
            String materialName = DisplayMaterialFragmentArgs.fromBundle(getArguments()).getMaterial().getMaterialName();
            String materialText = DisplayMaterialFragmentArgs.fromBundle(getArguments()).getMaterial().getMaterialText();

            TextView tvMaterialName = view.findViewById(R.id.displayMaterialTitle);
            MarkdownView tvMaterialTextContent = view.findViewById(R.id.displayMaterialText);

            tvMaterialName.setText(materialName);
            tvMaterialTextContent.setMarkDownText(materialText);
        }
    }
}