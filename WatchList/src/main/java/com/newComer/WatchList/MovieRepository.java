package com.newComer.WatchList;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

@Repository
public class MovieRepository {
     HashMap<String,Movie> movies= new HashMap<>();
     HashMap<String,Director> directors= new HashMap<>();
     HashMap<String, List<String>> directorMovieMap= new HashMap<>();

     public void addMovie(Movie movie)
     {
         movies.put(movie.getMovieName(),movie);
     }
     public void addDirector(Director director)
     {
         directors.put(director.getDirectorname(),director);
     }
     public void addMovieDirectorPair(String directorName, String movieName ){
         List<String> moviesList = directorMovieMap.get(directorName);
         if (moviesList == null) {
             moviesList = new ArrayList<>();
             directorMovieMap.put(directorName, moviesList);
         }
         moviesList.add(movieName);
     }
     public Movie findMovieByName(String name){
         return movies.get(name);
     }
    public Director findDirectorByName(String name){
        return directors.get(name);
    }
    public List<String> findMoviesByDirectorName(String director) {
        return directorMovieMap.getOrDefault(director, new ArrayList<>());
    }
    public void deleteDirector(String directorName) {
        directors.remove(directorName);
        directorMovieMap.remove(directorName);
    }
    public List<String> findAllMovies() {
        return new ArrayList<>(movies.keySet());
    }

    public void deleteMovie(String movieName) {
        movies.remove(movieName);
        directorMovieMap.remove(movieName);
    }
    public void deleteAllDirectors() {
        directors.clear();
        directorMovieMap.clear();
    }
    public void deleteAllMovies() {
        movies.clear();
    }
}
