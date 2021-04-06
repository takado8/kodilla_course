package com.kodilla.good.patterns;

import com.kodilla.good.patterns.challenges.MovieStore;

public class PatternsMain {
    public static void main(String[] args){
        MovieStore movieStore = new MovieStore();
        movieStore.printTitles(movieStore.getMovies());
    }
}
