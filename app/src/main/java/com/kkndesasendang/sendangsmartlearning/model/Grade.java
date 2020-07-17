package com.kkndesasendang.sendangsmartlearning.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class Grade implements Parcelable {
    private String gradeName;
    private ArrayList<Material> gradeMaterials;

    public Grade(String gradeName, ArrayList<Material> gradeMaterials) {
        this.gradeName = gradeName;
        this.gradeMaterials = gradeMaterials;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public ArrayList<Material> getGradeMaterials() {
        return gradeMaterials;
    }

    public void setGradeMaterials(ArrayList<Material> gradeMaterials) {
        this.gradeMaterials = gradeMaterials;
    }

    public static Creator<Grade> getCREATOR() {
        return CREATOR;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.gradeName);
        dest.writeList(this.gradeMaterials);
    }

    public Grade() {
    }

    protected Grade(Parcel in) {
        this.gradeName = in.readString();
        this.gradeMaterials = new ArrayList<Material>();
        in.readList(this.gradeMaterials, Material.class.getClassLoader());
    }

    public static final Parcelable.Creator<Grade> CREATOR = new Parcelable.Creator<Grade>() {
        @Override
        public Grade createFromParcel(Parcel source) {
            return new Grade(source);
        }

        @Override
        public Grade[] newArray(int size) {
            return new Grade[size];
        }
    };
}
