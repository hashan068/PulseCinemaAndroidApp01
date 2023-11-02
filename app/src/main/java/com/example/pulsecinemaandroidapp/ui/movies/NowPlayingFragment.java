package com.example.pulsecinemaandroidapp.ui.movies;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pulsecinemaandroidapp.Adapters.MovieAdapter;
import com.example.pulsecinemaandroidapp.Models.Movie;
import com.example.pulsecinemaandroidapp.R;
import java.util.ArrayList;
import java.util.List;

public class NowPlayingFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_now_playing, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);

        List<Movie> movies = generateDummyData(); // Define this method to generate your movie data
        MovieAdapter movieAdapter = new MovieAdapter(requireContext(), movies);

        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(movieAdapter);

        return view;
    }

    private List<Movie> generateDummyData() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Movie 1", R.drawable.movie1));
        movies.add(new Movie("Movie 2", R.drawable.movie2));
        movies.add(new Movie("Movie 3", R.drawable.movie3));
        // Add more movies as needed
        return movies;
    }
}
