package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.FilmItem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AfishaManagerTest {
    AfishaManager manager1 = new AfishaManager();
    AfishaManager manager = new AfishaManager(7);

    private FilmItem first = new FilmItem(
            1, "first");
    private FilmItem second = new FilmItem(
            2, "second");
    private FilmItem third = new FilmItem(
            3, "third");
    private FilmItem fourth = new FilmItem(
            4, "fourth");
    private FilmItem fifth = new FilmItem(
            5, "fifth");
    private FilmItem sixth = new FilmItem(
            6, "sixth");
    private FilmItem seventh = new FilmItem(
            7, "seventh");
    private FilmItem eighth = new FilmItem(
            8, "eighth");
    private FilmItem ninth = new FilmItem(
            9, "ninth");
    private FilmItem tenth = new FilmItem(
            10, "tenth");
    private FilmItem eleventh = new FilmItem(
            11, "eleventh");
    private FilmItem twelfth = new FilmItem(
            12, "twelfth");
    private FilmItem thirteenth = new FilmItem(
            13, "thirteenth");


    @BeforeEach
    void addFilms() {
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);
        manager.addFilm(fifth);
        manager.addFilm(sixth);
        manager.addFilm(seventh);
        manager.addFilm(eighth);
        manager.addFilm(ninth);
        manager.addFilm(tenth);
        manager.addFilm(eleventh);
        manager.addFilm(twelfth);
        manager.addFilm(thirteenth);
    }

    @Test
    public void shouldSave() {
        manager.addFilm(first);
        FilmItem[] expected = new FilmItem[]{
                first,
                thirteenth,
                twelfth,
                eleventh,
                tenth,
                ninth,
                eighth
        };
        FilmItem[] actual = manager.getMovies();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetAll() {
        FilmItem[] actual = manager.getMovies();
        FilmItem[] expected = {
                thirteenth,
                twelfth,
                eleventh,
                tenth,
                ninth,
                eighth,
                seventh
        };
        assertArrayEquals(expected, actual);
    }

}
