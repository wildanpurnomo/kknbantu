package com.kkndesasendang.sendangsmartlearning.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Chapter implements Parcelable {
    private String chapterName;

    public Chapter(String chapterName) {
        this.chapterName = chapterName;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.chapterName);
    }

    protected Chapter(Parcel in) {
        this.chapterName = in.readString();
    }

    public static final Parcelable.Creator<Chapter> CREATOR = new Parcelable.Creator<Chapter>() {
        @Override
        public Chapter createFromParcel(Parcel source) {
            return new Chapter(source);
        }

        @Override
        public Chapter[] newArray(int size) {
            return new Chapter[size];
        }
    };
}
