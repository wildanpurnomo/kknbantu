package com.kkndesasendang.sendangsmartlearning.model;

import android.os.Parcel;

import java.util.ArrayList;

public class AudioVisualMaterialModel extends MaterialModel {
    private ArrayList<AudioVisualContentModel> contents;

    public AudioVisualMaterialModel(String materialName, ArrayList<AudioVisualContentModel> contents) {
        super(materialName);
        this.contents = contents;
    }

    public ArrayList<AudioVisualContentModel> getContents() {
        return contents;
    }

    public AudioVisualMaterialModel(Parcel in, ArrayList<AudioVisualContentModel> contents) {
        super(in);
        this.contents = contents;
    }

    public AudioVisualMaterialModel(String materialName) {
        super(materialName);
    }

    protected AudioVisualMaterialModel(Parcel in) {
        super(in);
    }
}
