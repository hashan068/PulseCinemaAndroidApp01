package com.example.pulsecinemaandroidapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pulsecinemaandroidapp.Adapters.SeatAdapter;
import com.example.pulsecinemaandroidapp.model.Seat;

import java.util.ArrayList;
import java.util.List;

public class SelectSeatActivity extends AppCompatActivity {

    private GridView gridView;
    private Button confirmButton;
    private List<Seat> seatList;
    private SeatAdapter seatAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selectseats);

        gridView = findViewById(R.id.gridView);
        confirmButton = findViewById(R.id.confirmButton);

        seatList = generateSeatList();
        seatAdapter = new SeatAdapter(this, seatList);
        gridView.setAdapter(seatAdapter);

        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle confirmation logic here
                // For example, display selected seats
                displaySelectedSeats();
            }
        });
    }

    private List<Seat> generateSeatList() {
        List<Seat> seats = new ArrayList<>();
        for (int i = 1; i <= 25; i++) {
            seats.add(new Seat(i));
        }
        return seats;
    }

    private void displaySelectedSeats() {
        StringBuilder selectedSeats = new StringBuilder("Selected Seats: ");
        for (Seat seat : seatList) {
            if (seat.isSelected()) {
                selectedSeats.append(seat.getSeatNumber()).append(", ");
            }
        }
        // Remove the trailing comma and space
        if (selectedSeats.length() > 2) {
            selectedSeats.delete(selectedSeats.length() - 2, selectedSeats.length());
        }

        // Replace this with your desired action (e.g., show a toast, navigate to another activity)
        // For now, we'll just print the selected seats to the log
        System.out.println(selectedSeats.toString());
    }
}
