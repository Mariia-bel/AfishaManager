package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.FilmItem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AfishaManagerTest {
    AfishaManager manager = new AfishaManager();

    private FilmItem first = new FilmItem(1, "first");
    private FilmItem second = new FilmItem(2, "second");
    private FilmItem third = new FilmItem(3, "third");
    private FilmItem fourth = new FilmItem(4, "fourth");
    private FilmItem fifth = new FilmItem(5, "fifth");
    private FilmItem sixth = new FilmItem(6, "sixth");
    private FilmItem seventh = new FilmItem(7, "seventh");
    private FilmItem eighth = new FilmItem(8, "eighth");
    private FilmItem ninth = new FilmItem(9, "ninth");
    private FilmItem tenth = new FilmItem(10, "tenth");
    private FilmItem eleventh = new FilmItem(11, "eleventh");
    private FilmItem twelfth = new FilmItem(12, "twelfth");
    private FilmItem thirteenth = new FilmItem(13, "thirteenth");

    //сохранение
    @Test
    void addFilms() {
        AfishaManager manager = new AfishaManager();
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

        FilmItem[] actual = manager.findAll();
        FilmItem[] expected = new FilmItem[]{first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth, thirteenth};

        assertArrayEquals(expected, actual);

    }


    //в обратном порядке
    @Test
    public void shouldGetAll() {
        AfishaManager manager = new AfishaManager();
        manager.addFilm(seventh);
        manager.addFilm(eighth);
        manager.addFilm(ninth);
        manager.addFilm(tenth);
        manager.addFilm(eleventh);
        manager.addFilm(twelfth);
        manager.addFilm(thirteenth);
        FilmItem[] actual = manager.getAll();
        FilmItem[] expected = {thirteenth, twelfth, eleventh, tenth, ninth, eighth, seventh};
        assertArrayEquals(expected, actual);
    }

    // Вывод лимита
    @Test
    void shouldSowLimit() {
        AfishaManager manager = new AfishaManager();
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
        FilmItem[] actual = manager.findAll();
        FilmItem[] expected = new FilmItem[]{first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth};

    }

    //Вывод больше лимита
    @Test
    void shouldSowAll() {
        AfishaManager manager = new AfishaManager(15);
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

        FilmItem[] actual = manager.findAll();
        FilmItem[] expected = new FilmItem[]{first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth, thirteenth};

        assertArrayEquals(expected, actual);
    }


    //Вывод меньше лимита
    @Test
    void shouldSowLimit9() {
        AfishaManager manager = new AfishaManager(9);
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
        FilmItem[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        FilmItem[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

}
