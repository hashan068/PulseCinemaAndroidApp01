package com.example.pulsecinemaandroidapp.ui.movies;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pulsecinemaandroidapp.R;

public class ComingSoonFragment extends Fragment {
// IM/2020/014 - Senanayeka

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_coming_soon, container, false);
    }
}