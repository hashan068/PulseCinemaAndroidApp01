package com.example.pulsecinemaandroidapp;

import static com.example.pulsecinemaandroidapp.R.layout.*;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SelectDateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(selectdate);

        // Back Button
        ImageView backButton = findViewById(R.id.left_icon02);
        if (backButton != null) {
            backButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    finish(); // Close the current activity and go back to the previous one
                }
            });
        }

        // Buy Ticket Button
        Button buyTicketButton = findViewById(R.id.date1);
        if (buyTicketButton != null) {
            buyTicketButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Handle buy ticket button click
                    // For example, you can open a new activity for ticket booking
                    Intent intent = new Intent(SelectDateActivity.this, SelectSeatActivity.class);
                    startActivity(intent);
                }
            });
        }
    }
}
