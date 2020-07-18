package com.kkndesasendang.sendangsmartlearning.ui.learn.audioVisual;

import android.media.SoundPool;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.kkndesasendang.sendangsmartlearning.R;

public class AudioVisualChildFragment extends Fragment {
    public static final String EXTRA_IMAGE = "extra_image";
    public static final String EXTRA_AUDIO = "extra_audio";

    private SoundPool mSoundPool;
    private int mSoundId;
    private boolean isSpLoaded = false;

    private String imageResourceName, audioResourceName;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_audio_visual_child, container, false);
        if (getArguments() != null) {
            imageResourceName = getArguments().getString(EXTRA_IMAGE);
            audioResourceName = getArguments().getString(EXTRA_AUDIO);
        }
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageView img = view.findViewById(R.id.audioVisChildImage);
        ImageView playButton = view.findViewById(R.id.audioVisChildPlay);
        ImageView pauseButton = view.findViewById(R.id.audioVisChildPause);
        mSoundPool = new SoundPool.Builder()
                .setMaxStreams(10)
                .build();

        Glide.with(this).load(getResources().getIdentifier(imageResourceName, "drawable", requireActivity().getPackageName())).into(img);

        mSoundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
            @Override
            public void onLoadComplete(SoundPool soundPool, int sampleId, int status) {
                if (status == 0) {
                    isSpLoaded = true;
                } else {
                    Toast.makeText(requireContext(), "Gagal Load", Toast.LENGTH_SHORT).show();
                }
            }
        });

        mSoundId = mSoundPool.load(requireContext(), getResources().getIdentifier(audioResourceName, "raw", requireActivity().getPackageName()), 1);

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isSpLoaded) {
                    mSoundPool.play(mSoundId, 1, 1, 0, 0, 1);
                }
            }
        });
    }
}