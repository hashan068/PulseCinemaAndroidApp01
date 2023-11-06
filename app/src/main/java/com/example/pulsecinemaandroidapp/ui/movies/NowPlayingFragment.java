package com.example.pulsecinemaandroidapp.ui.movies;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.pulsecinemaandroidapp.MovieDetailsActivity;
import com.example.pulsecinemaandroidapp.R;

public class NowPlayingFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_now_playing, container, false);

        Button buyTicketButton = rootView.findViewById(R.id.buttonBuyTicket01);
        buyTicketButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle button click here
                // You can navigate to MovieDetailsActivity here
                startActivity(new Intent(getActivity(), MovieDetailsActivity.class));
            }
        });

        return rootView;
    }
}
