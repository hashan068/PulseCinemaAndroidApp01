package com.example.pulsecinemaandroidapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MovieDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);

        // Back Button
        ImageView backButton = findViewById(R.id.left_icon);
        if (backButton != null) {
            backButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    finish(); // Close the current activity and go back to the previous one
                }
            });
        }

        // Buy Ticket Button
        Button buyTicketButton = findViewById(R.id.buttonBuyTicket);
        if (buyTicketButton != null) {
            buyTicketButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Handle buy ticket button click
                    // For example, you can open a new activity for ticket booking
                    Intent intent = new Intent(MovieDetailsActivity.this, SelectDateActivity.class);
                    startActivity(intent);
                }
            });
        }
    }
}
