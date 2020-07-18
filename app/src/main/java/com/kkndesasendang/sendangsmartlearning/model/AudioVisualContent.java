package com.kkndesasendang.sendangsmartlearning.model;

import android.os.Parcel;
import android.os.Parcelable;

public class AudioVisualContent implements Parcelable {
    private String imageResourceName;
    private int audioResourceName;

    public AudioVisualContent(String imageResourceName, int audioResourceName) {
        this.imageResourceName = imageResourceName;
        this.audioResourceName = audioResourceName;
    }

    public String getImageResourceName() {
        return imageResourceName;
    }

    public int getAudioResourceName() {
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
        dest.writeInt(this.audioResourceName);
    }

    protected AudioVisualContent(Parcel in) {
        this.imageResourceName = in.readString();
        this.audioResourceName = in.readInt();
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
