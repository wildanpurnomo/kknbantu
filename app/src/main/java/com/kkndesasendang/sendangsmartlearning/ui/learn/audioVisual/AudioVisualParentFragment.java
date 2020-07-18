package com.kkndesasendang.sendangsmartlearning.ui.learn.audioVisual;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kkndesasendang.sendangsmartlearning.R;
import com.kkndesasendang.sendangsmartlearning.model.AudioVisualContent;

import java.util.ArrayList;
import java.util.List;

import static android.content.ContentValues.TAG;

public class AudioVisualParentFragment extends Fragment {
    private ViewPager2 mViewPager;
    private ViewPagerAdapter mAdapter;

    private AudioVisualContent[] avContents;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_audio_visual_parent, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        if (getArguments() != null) {
            avContents = AudioVisualParentFragmentArgs.fromBundle(getArguments()).getMaterial();
        }

        mViewPager = view.findViewById(R.id.audioVisParentViewPager);
        List<Fragment> fragments = new ArrayList<>();

        for (AudioVisualContent avContent : avContents) {
            Bundle bundle = new Bundle();
            Log.d(TAG, "onViewCreated: " + avContent.getImageResourceName() + " " + avContent.getAudioResourceName());
            bundle.putString(AudioVisualChildFragment.EXTRA_IMAGE, avContent.getImageResourceName());
            bundle.putString(AudioVisualChildFragment.EXTRA_AUDIO, avContent.getAudioResourceName());
            AudioVisualChildFragment newFragment = new AudioVisualChildFragment();
            newFragment.setArguments(bundle);
            fragments.add(newFragment);
        }

        mAdapter = new ViewPagerAdapter(this);
        mAdapter.setFragments(fragments);
        mViewPager.setAdapter(mAdapter);
    }
}