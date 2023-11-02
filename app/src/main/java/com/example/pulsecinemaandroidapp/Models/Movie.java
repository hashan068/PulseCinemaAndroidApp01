package com.example.pulsecinemaandroidapp.Models;

public class Movie {
    private String title;
    private int posterResourceId;

    public Movie(String title, int posterResourceId) {
        this.title = title;
        this.posterResourceId = posterResourceId;
    }

    public String getTitle() {
        return title;
    }

    public int getPosterResourceId() {
        return posterResourceId;
    }
}

