package com.kkndesasendang.sendangsmartlearning.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class Material implements Parcelable {
    private ArrayList<Chapter> materialChapters;

    public Material(ArrayList<Chapter> materialChapters) {
        this.materialChapters = materialChapters;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.materialChapters);
    }

    protected Material(Parcel in) {
        this.materialChapters = new ArrayList<Chapter>();
        in.readList(this.materialChapters, Chapter.class.getClassLoader());
    }

    public static final Parcelable.Creator<Material> CREATOR = new Parcelable.Creator<Material>() {
        @Override
        public Material createFromParcel(Parcel source) {
            return new Material(source);
        }

        @Override
        public Material[] newArray(int size) {
            return new Material[size];
        }
    };
}
