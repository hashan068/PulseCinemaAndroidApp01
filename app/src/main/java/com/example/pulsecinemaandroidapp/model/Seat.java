package com.example.pulsecinemaandroidapp.model;
// IM/2020/048-Sudeera

public class Seat {
    private int seatNumber;
    private boolean isSelected;

    public Seat(int seatNumber) {
        this.seatNumber = seatNumber;
        this.isSelected = false;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}

