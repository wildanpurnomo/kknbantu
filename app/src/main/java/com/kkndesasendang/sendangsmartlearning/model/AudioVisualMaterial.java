package com.kkndesasendang.sendangsmartlearning.model;

import android.os.Parcel;

import java.util.ArrayList;

public class AudioVisualMaterial extends Material {
    private ArrayList<AudioVisualContent> contents;

    public AudioVisualMaterial(String materialName, ArrayList<AudioVisualContent> contents) {
        super(materialName);
        this.contents = contents;
    }

    public ArrayList<AudioVisualContent> getContents() {
        return contents;
    }

    public AudioVisualMaterial(Parcel in, ArrayList<AudioVisualContent> contents) {
        super(in);
        this.contents = contents;
    }

    public AudioVisualMaterial(String materialName) {
        super(materialName);
    }

    protected AudioVisualMaterial(Parcel in) {
        super(in);
    }
}
