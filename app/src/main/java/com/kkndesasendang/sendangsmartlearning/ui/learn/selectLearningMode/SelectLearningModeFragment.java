package com.kkndesasendang.sendangsmartlearning.ui.learn.selectLearningMode;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kkndesasendang.sendangsmartlearning.R;

public class SelectLearningModeFragment extends Fragment {
    private CardView mCardMaterial, mCardQuiz;

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

        mCardMaterial = view.findViewById(R.id.selectLearningModeMaterial);
        mCardQuiz = view.findViewById(R.id.selectLearningModeQuiz);

        mCardMaterial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_learning_mode_to_nav_select_material);
            }
        });
    }
}