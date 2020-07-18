package com.kkndesasendang.sendangsmartlearning.ui.learn.selectLearningMode;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kkndesasendang.sendangsmartlearning.R;
import com.kkndesasendang.sendangsmartlearning.model.Grade;
import com.kkndesasendang.sendangsmartlearning.model.Material;

import java.util.Objects;

import static android.content.ContentValues.TAG;

public class SelectLearningModeFragment extends Fragment {
    private CardView mCardMaterial, mCardQuiz;
    private Grade gradeChosen = new Grade();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_select_learning_mode, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        if (getArguments() != null) {
            gradeChosen = SelectLearningModeFragmentArgs.fromBundle(getArguments()).getGradeChosen();
            ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(gradeChosen.getGradeName());
        }

        mCardMaterial = view.findViewById(R.id.selectLearningModeMaterial);
        mCardQuiz = view.findViewById(R.id.selectLearningModeQuiz);

        mCardMaterial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Material[] materials = gradeChosen.getGradeMaterials().toArray(new Material[0]);
                Navigation.findNavController(view).navigate(SelectLearningModeFragmentDirections.actionNavLearningModeToNavSelectMaterial(materials));
            }
        });
    }
}