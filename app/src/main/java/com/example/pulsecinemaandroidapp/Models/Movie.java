package com.example.pulsecinemaandroidapp.Models;

public class Movie {
    private int id;
    private String title;
    private int posterResourceId;

    public Movie(int id, String title, int posterResourceId) {
        this.id = id;
        this.title = title;
        this.posterResourceId = posterResourceId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getPosterResourceId() {
        return posterResourceId;
    }
}
