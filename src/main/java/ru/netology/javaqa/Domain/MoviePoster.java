package ru.netology.javaqa.Domain;

public class MoviePoster {

    private int id;
    private String imgUrl;
    private String movieName;
    private String genre;

    public MoviePoster(int id, String imgUrl, String movieName, String genre) {
        this.id = id;
        this.imgUrl = imgUrl;
        this.movieName = movieName;
        this.genre = genre;
    }


}
