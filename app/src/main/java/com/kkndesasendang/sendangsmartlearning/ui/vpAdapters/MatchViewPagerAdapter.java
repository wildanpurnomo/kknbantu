package com.kkndesasendang.sendangsmartlearning.ui.vpAdapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;
import java.util.List;

public class MatchViewPagerAdapter extends FragmentStateAdapter {
    private List<Fragment> fragments = new ArrayList<>();

    public void setFragments(List<Fragment> fragments) {
        this.fragments = fragments;
    }

    public MatchViewPagerAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return fragments.get(position);
    }

    @Override
    public int getItemCount() {
        return fragments.size();
    }
}
