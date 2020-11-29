package com.kkndesasendang.sendangsmartlearning.ui.fragments;

import android.content.res.AssetFileDescriptor;
import android.graphics.drawable.Drawable;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.swiperefreshlayout.widget.CircularProgressDrawable;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;
import com.kkndesasendang.sendangsmartlearning.R;

import java.io.IOException;

public class AudioVisualChildFragment extends Fragment {
    public static final String EXTRA_IMAGE = "extra_image";
    public static final String EXTRA_AUDIO = "extra_audio";

    private MediaPlayer mMediaPlayer = null;
    private boolean isReady;

    private String imageResourceName;
    private int audioResourceName;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_audio_visual_child, container, false);
        if (getArguments() != null) {
            imageResourceName = getArguments().getString(EXTRA_IMAGE);
            audioResourceName = getArguments().getInt(EXTRA_AUDIO);
        }
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageView img = view.findViewById(R.id.audioVisChildImage);
        final ImageView playButton = view.findViewById(R.id.audioVisChildPlay);
        final ImageView pauseButton = view.findViewById(R.id.audioVisChildPause);
        mMediaPlayer = new MediaPlayer();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AudioAttributes attribute = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_MEDIA)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();
            mMediaPlayer.setAudioAttributes(attribute);
        } else {
            mMediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        }

        CircularProgressDrawable mCircularProgressDrawable = new CircularProgressDrawable(requireContext());
        mCircularProgressDrawable.setStrokeWidth(5f);
        mCircularProgressDrawable.setCenterRadius(30f);
        mCircularProgressDrawable.start();

        RequestOptions requestOptions = new RequestOptions();
        requestOptions.placeholder(mCircularProgressDrawable);
        requestOptions.error(R.drawable.ic_baseline_error_128);
        requestOptions.timeout(60000);
        Glide.with(this)
                .load("http://sicenikapi-dot-sendang-digital-map.et.r.appspot.com/api/material/upload/" + imageResourceName)
                .listener(new RequestListener<Drawable>() {
                    @Override
                    public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                        Toast.makeText(requireContext(), "Mohon cek kembali koneksi internet.", Toast.LENGTH_SHORT).show();
                        return false;
                    }

                    @Override
                    public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                        return false;
                    }
                })
                .apply(requestOptions)
                .into(img);

        AssetFileDescriptor afd = requireActivity().getApplicationContext().getResources().openRawResourceFd(audioResourceName);
        try {
            mMediaPlayer.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
        } catch (IOException e) {
            e.printStackTrace();
        }

        mMediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                isReady = true;
                mMediaPlayer.start();
            }
        });

        mMediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() {
            @Override
            public boolean onError(MediaPlayer mediaPlayer, int i, int i1) {
                return false;
            }
        });

        mMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                pauseButton.setVisibility(View.GONE);
                playButton.setVisibility(View.VISIBLE);
            }
        });

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isReady) {
                    mMediaPlayer.prepareAsync();
                } else {
                    mMediaPlayer.start();
                }
                playButton.setVisibility(View.GONE);
                pauseButton.setVisibility(View.VISIBLE);

            }
        });

        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mMediaPlayer.isPlaying()) {
                    mMediaPlayer.pause();
                    playButton.setVisibility(View.VISIBLE);
                    pauseButton.setVisibility(View.GONE);
                }
            }
        });
    }

    @Override
    public void onStop() {
        super.onStop();
        if (mMediaPlayer != null) {
            mMediaPlayer.release();
            mMediaPlayer = null;
        }
    }
}