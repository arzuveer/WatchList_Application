package com.newComer.WatchList;

public class Movie {
    private String movieName;
    private int duration;
    private double imdbrating;

    public Movie() {
    }

    public Movie(String movieNme, int duration, double imdbrating) {
        this.movieName = movieName;
        this.duration = duration;
        this.imdbrating = imdbrating;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieNme(String movieNme) {
        this.movieName = movieNme;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getImdbrating() {
        return imdbrating;
    }

    public void setImdbrating(double imdbrating) {
        this.imdbrating = imdbrating;
    }
}
