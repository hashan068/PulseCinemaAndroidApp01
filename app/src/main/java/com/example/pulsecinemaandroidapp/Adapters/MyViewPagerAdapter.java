package com.example.pulsecinemaandroidapp.Adapters;
// IM/2020/068-HASHAN
//
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.pulsecinemaandroidapp.ui.movies.ComingSoonFragment;
import com.example.pulsecinemaandroidapp.ui.movies.NowPlayingFragment;

public class MyViewPagerAdapter extends FragmentStateAdapter {

    public MyViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new NowPlayingFragment();
            case 1:
                return new ComingSoonFragment();
            default:
                return new NowPlayingFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
