package com.newComer.WatchList;

public class Director {
    private String directorname;
    private int noOfMovies;
    private double imdbrating;

    public Director() {
    }

    public Director(String directorname, int noOfMovies, double imdbrating) {
        this.directorname = directorname;
        this.noOfMovies = noOfMovies;
        this.imdbrating = imdbrating;
    }

    public String getDirectorname() {
        return directorname;
    }

    public void setDirectorname(String directorname) {
        this.directorname = directorname;
    }

    public int getNoOfMovies() {
        return noOfMovies;
    }

    public void setNoOfMovies(int noOfMovies) {
        this.noOfMovies = noOfMovies;
    }

    public double getImdbrating() {
        return imdbrating;
    }

    public void setImdbrating(double imdbrating) {
        this.imdbrating = imdbrating;
    }
}
