package com.example.pulsecinemaandroidapp.ui.movies;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
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

        List<Movie> movies = generateDummyData(); // Define this method to generate movie data
        MovieAdapter movieAdapter = new MovieAdapter(requireContext(), movies, new MovieAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Movie movie) {
                // Handle item click, e.g., start a new activity with the movie ID
                Intent intent = new Intent(requireContext(), MovieDetailActivity.class);
                intent.putExtra("movieId", movie.getId());
                startActivity(intent);
            }
        });

        // Create a GridLayoutManager with span count 2
        GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext(), 2);

        // Set the layoutManager for the RecyclerView
        recyclerView.setLayoutManager(gridLayoutManager);

        // Set a SpanSizeLookup to specify the span size for each item
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                // Return the span size for each item
                return 2;
            }
        });

        // Set your adapter
        recyclerView.setAdapter(movieAdapter);

        return view;
    }

    // Method to generate dummy movie data
    private List<Movie> generateDummyData() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(1, "Movie 1", R.drawable.movie1));
        movies.add(new Movie(2, "Movie 2", R.drawable.movie2));
        movies.add(new Movie(3, "Movie 3", R.drawable.movie3));
        movies.add(new Movie(4, "Movie 4", R.drawable.movie4));
        // Add more movies as needed
        return movies;
    }
}
