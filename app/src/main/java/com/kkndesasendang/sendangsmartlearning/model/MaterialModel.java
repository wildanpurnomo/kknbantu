package com.kkndesasendang.sendangsmartlearning.model;

import android.os.Parcel;
import android.os.Parcelable;

public class MaterialModel implements Parcelable {
    private String materialName;

    public MaterialModel(String materialName) {
        this.materialName = materialName;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public static Creator<MaterialModel> getCREATOR() {
        return CREATOR;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.materialName);
    }

    protected MaterialModel(Parcel in) {
        this.materialName = in.readString();
    }

    public static final Parcelable.Creator<MaterialModel> CREATOR = new Parcelable.Creator<MaterialModel>() {
        @Override
        public MaterialModel createFromParcel(Parcel source) {
            return new MaterialModel(source);
        }

        @Override
        public MaterialModel[] newArray(int size) {
            return new MaterialModel[size];
        }
    };
}
