package ru.netology.javaqa.MoviesManager;

import ru.netology.javaqa.Domain.MoviePoster;

public class MoviePosterManager {
    private MoviePoster[] posters = new MoviePoster[0];
    private int limit;

    public MoviePosterManager() {
        this.limit = 5;
    }

    public MoviePosterManager(int limit) {
        this.limit = limit;
    }

    public void add(MoviePoster poster) {
        MoviePoster[] tmp = new MoviePoster[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = poster;
        this.posters = tmp;
    }

    public MoviePoster[] findAll() {
        return posters;
    }

    public MoviePoster[] findLast() {
        int resultLength;
        if (posters.length < limit) {
            resultLength = posters.length;
        } else {
            resultLength = limit;
        }
        MoviePoster[] tmp = new MoviePoster[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = posters[posters.length - 1 - i];
        }
        return tmp;
    }
}
