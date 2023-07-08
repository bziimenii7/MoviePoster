package ru.netology.javaqa.MoviesManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.Domain.MoviePoster;

public class MoviePosterManagerTest {

    MoviePoster poster1 = new MoviePoster(1, "http://", "Бладшот", "Боевик");
    MoviePoster poster2 = new MoviePoster(2, "http://", "Вперёд", "Мультфильм");
    MoviePoster poster3 = new MoviePoster(3, "http://", "Отель \"Белград\"", "Комедия");
    MoviePoster poster4 = new MoviePoster(4, "http://", "Джентельмены", "Боевик");
    MoviePoster poster5 = new MoviePoster(5, "http://", "Человек-Невидимка", "Ужасы");
    MoviePoster poster6 = new MoviePoster(6, "http://", "Тролли. Мровой тур", "Мультфильм");

    @Test
    public void shouldFindAllFivePosters() {
        MoviePosterManager manager = new MoviePosterManager();

        manager.add(poster1);
        manager.add(poster2);
        manager.add(poster3);
        manager.add(poster4);
        manager.add(poster5);

        MoviePoster[] expected = {poster1, poster2, poster3, poster4, poster5};
        MoviePoster[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllSixPosters() {
        MoviePosterManager manager = new MoviePosterManager();

        manager.add(poster1);
        manager.add(poster2);
        manager.add(poster3);
        manager.add(poster4);
        manager.add(poster5);
        manager.add(poster6);

        MoviePoster[] expected = {poster1, poster2, poster3, poster4, poster5, poster6};
        MoviePoster[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllOnePosters() {
        MoviePosterManager manager = new MoviePosterManager();

        manager.add(poster1);

        MoviePoster[] expected = {poster1};
        MoviePoster[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllZeroPosters() {
        MoviePosterManager manager = new MoviePosterManager();

        MoviePoster[] expected = {};
        MoviePoster[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFivePostersDefaultLimit() {
        MoviePosterManager manager = new MoviePosterManager();

        manager.add(poster1);
        manager.add(poster2);
        manager.add(poster3);
        manager.add(poster4);
        manager.add(poster5);

        MoviePoster[] expected = {poster5, poster4, poster3, poster2, poster1};
        MoviePoster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastSixPostersDefaultLimit() {
        MoviePosterManager manager = new MoviePosterManager();

        manager.add(poster1);
        manager.add(poster2);
        manager.add(poster3);
        manager.add(poster4);
        manager.add(poster5);
        manager.add(poster6);

        MoviePoster[] expected = {poster6, poster5, poster4, poster3, poster2};
        MoviePoster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastSixPostersCustomLimitSix() {
        MoviePosterManager manager = new MoviePosterManager(6);

        manager.add(poster1);
        manager.add(poster2);
        manager.add(poster3);
        manager.add(poster4);
        manager.add(poster5);
        manager.add(poster6);

        MoviePoster[] expected = {poster6, poster5, poster4, poster3, poster2, poster1};
        MoviePoster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastSixPostersCustomLimitFour() {
        MoviePosterManager manager = new MoviePosterManager(4);

        manager.add(poster1);
        manager.add(poster2);
        manager.add(poster3);
        manager.add(poster4);
        manager.add(poster5);
        manager.add(poster6);

        MoviePoster[] expected = {poster6, poster5, poster4, poster3};
        MoviePoster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastOnePoster() {
        MoviePosterManager manager = new MoviePosterManager();

        manager.add(poster1);

        MoviePoster[] expected = {poster1};
        MoviePoster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastZeroPosters() {
        MoviePosterManager manager = new MoviePosterManager();

        MoviePoster[] expected = {};
        MoviePoster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
