package com.kkndesasendang.sendangsmartlearning.model;

import android.os.Parcel;
import android.os.Parcelable;

public class AudioVisualContentModel implements Parcelable {
    private String imageResourceName;
    private int audioResourceName;

    public AudioVisualContentModel(String imageResourceName, int audioResourceName) {
        this.imageResourceName = imageResourceName;
        this.audioResourceName = audioResourceName;
    }

    public String getImageResourceName() {
        return imageResourceName;
    }

    public int getAudioResourceName() {
        return audioResourceName;
    }

    public static Creator<AudioVisualContentModel> getCREATOR() {
        return CREATOR;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.imageResourceName);
        dest.writeInt(this.audioResourceName);
    }

    protected AudioVisualContentModel(Parcel in) {
        this.imageResourceName = in.readString();
        this.audioResourceName = in.readInt();
    }

    public static final Parcelable.Creator<AudioVisualContentModel> CREATOR = new Parcelable.Creator<AudioVisualContentModel>() {
        @Override
        public AudioVisualContentModel createFromParcel(Parcel source) {
            return new AudioVisualContentModel(source);
        }

        @Override
        public AudioVisualContentModel[] newArray(int size) {
            return new AudioVisualContentModel[size];
        }
    };
}
