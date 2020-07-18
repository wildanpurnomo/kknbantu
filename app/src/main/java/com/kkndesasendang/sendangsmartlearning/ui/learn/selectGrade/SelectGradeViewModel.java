package com.kkndesasendang.sendangsmartlearning.ui.learn.selectGrade;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.kkndesasendang.sendangsmartlearning.R;
import com.kkndesasendang.sendangsmartlearning.model.AudioVisualContent;
import com.kkndesasendang.sendangsmartlearning.model.AudioVisualMaterial;
import com.kkndesasendang.sendangsmartlearning.model.Grade;
import com.kkndesasendang.sendangsmartlearning.model.Material;

import java.util.ArrayList;
import java.util.Arrays;

public class SelectGradeViewModel extends ViewModel {
    private MutableLiveData<ArrayList<Grade>> gradeList = new MutableLiveData<>();

    public void setGradeList() {
        ArrayList<Grade> gradeList = new ArrayList<>();
        gradeList.add(new Grade("Kelas 1 SD", new ArrayList<>(Arrays.asList(
                new AudioVisualMaterial("Bab 1: Pengenalan Buah-Buahan", new ArrayList<>(Arrays.asList(
                        new AudioVisualContent("grimm", R.raw.tes),
                        new AudioVisualContent("nightmarionne", R.raw.clinking_glasses)))),
                new Material("Bab 2: Pengenalan Sayur-Sayuran"),
                new Material("Bab 3: Pengenalan Cabe-Cabean"),
                new Material("Bab 4: Pengenalan Tubuh Manusia"),
                new Material("Bab 5: Pengenalan Hewan")
        ))));
        gradeList.add(new Grade("Kelas 2 SD", new ArrayList<Material>()));
        gradeList.add(new Grade("Kelas 3 SD", new ArrayList<Material>()));
        gradeList.add(new Grade("Kelas 4 SD", new ArrayList<Material>()));
        gradeList.add(new Grade("Kelas 5 SD", new ArrayList<Material>()));
        gradeList.add(new Grade("Kelas 6 SD", new ArrayList<Material>()));

        this.gradeList.setValue(gradeList);
    }

    public LiveData<ArrayList<Grade>> getGradeList() {
        return gradeList;
    }
}
