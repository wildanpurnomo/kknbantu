package com.kkndesasendang.sendangsmartlearning.model;

import android.os.Parcel;
import android.os.Parcelable;

public class AudioVisualContent implements Parcelable {
    private String imageResourceName;
    private String audioResourceName;

    public AudioVisualContent(String imageResourceName, String audioResourceName) {
        this.imageResourceName = imageResourceName;
        this.audioResourceName = audioResourceName;
    }

    public String getImageResourceName() {
        return imageResourceName;
    }

    public String getAudioResourceName() {
        return audioResourceName;
    }

    public static Creator<AudioVisualContent> getCREATOR() {
        return CREATOR;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.imageResourceName);
        dest.writeString(this.audioResourceName);
    }

    protected AudioVisualContent(Parcel in) {
        this.imageResourceName = in.readString();
        this.audioResourceName = in.readString();
    }

    public static final Parcelable.Creator<AudioVisualContent> CREATOR = new Parcelable.Creator<AudioVisualContent>() {
        @Override
        public AudioVisualContent createFromParcel(Parcel source) {
            return new AudioVisualContent(source);
        }

        @Override
        public AudioVisualContent[] newArray(int size) {
            return new AudioVisualContent[size];
        }
    };
}
