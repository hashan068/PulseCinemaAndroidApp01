package com.example.pulsecinemaandroidapp.ui.movies;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pulsecinemaandroidapp.Models.Movie;
import com.example.pulsecinemaandroidapp.R;

public class MovieDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail); // Use your layout file

        // Get the movie ID from the intent
        int movieId = getIntent().getIntExtra("movieId", 0);

        // Retrieve detailed information about the selected movie (you can use a database, API, etc.)
        Movie selectedMovie = getMovieDetails(movieId);

        // Display movie details in the activity
        if (selectedMovie != null) {
            TextView titleTextView = findViewById(R.id.titleTextView); // Replace with your TextView ID
            titleTextView.setText(selectedMovie.getTitle());
        }
    }

    // Method to retrieve detailed information about the selected movie (replace with your logic)
    private Movie getMovieDetails(int movieId) {
        // Implement your logic to fetch movie details from a database, API, etc.
        // For now, let's return a dummy Movie object
        return new Movie(movieId, "Dummy Movie", R.drawable.placeholder_image);
    }
}
