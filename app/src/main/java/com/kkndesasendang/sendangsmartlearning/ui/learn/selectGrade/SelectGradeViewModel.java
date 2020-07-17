package com.kkndesasendang.sendangsmartlearning.ui.learn.selectGrade;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.kkndesasendang.sendangsmartlearning.model.Grade;
import com.kkndesasendang.sendangsmartlearning.model.Material;

import java.util.ArrayList;

public class SelectGradeViewModel extends ViewModel {
    private MutableLiveData<ArrayList<Grade>> gradeList = new MutableLiveData<>();

    public void setGradeList() {
        ArrayList<Grade> gradeList = new ArrayList<>();
        gradeList.add(new Grade("Kelas 1 SD", new ArrayList<Material>()));
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
