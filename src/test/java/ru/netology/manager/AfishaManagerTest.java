package ru.netology.manager;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AfishaManagerTest {


    //сохранение
    @Test
    void addFilms() {
        AfishaManager manager = new AfishaManager();
        manager.addFilm("first");
        manager.addFilm("second");
        manager.addFilm("third");
        manager.addFilm("fourth");
        manager.addFilm("fifth");
        manager.addFilm("sixth");
        manager.addFilm("seventh");
        manager.addFilm("eighth");
        manager.addFilm("ninth");
        manager.addFilm("tenth");
        manager.addFilm("eleventh");
        manager.addFilm("twelfth");
        manager.addFilm("thirteenth");

        String[] actual = manager.findAll();
        String[] expected = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth", "thirteenth"};

        assertArrayEquals(expected, actual);

    }

    // показать, что запомнил
    @Test
    public void shouldFindAll() {
        AfishaManager manager = new AfishaManager();
        manager.addFilm("first");
        manager.addFilm("second");
        manager.addFilm("third");
        manager.addFilm("fourth");
        String[] actual = manager.findAll();
        String[] expected = {"first", "second", "third", "fourth"};
    }

    //в обратном порядке
    @Test
    public void shouldGetAll() {
        AfishaManager manager = new AfishaManager();
        manager.addFilm("seventh");
        manager.addFilm("eighth");
        manager.addFilm("ninth");
        manager.addFilm("tenth");
        manager.addFilm("eleventh");
        manager.addFilm("twelfth");
        manager.addFilm("thirteenth");
        String[] actual = manager.findLast();
        String[] expected = {"thirteenth", "twelfth", "eleventh", "tenth", "ninth", "eighth", "seventh"};
        assertArrayEquals(expected, actual);
    }

    // Вывод лимита
    @Test
    void shouldSowLimit() {
        AfishaManager manager = new AfishaManager(10);
        manager.addFilm("first");
        manager.addFilm("second");
        manager.addFilm("third");
        manager.addFilm("fourth");
        manager.addFilm("fifth");
        manager.addFilm("sixth");
        manager.addFilm("seventh");
        manager.addFilm("eighth");
        manager.addFilm("ninth");
        manager.addFilm("tenth");
        String[] actual = manager.findLast();
        String[] expected = {"tenth", "ninth", "eighth", "seventh", "sixth", "fifth", "fourth", "third", "second", "first"};

    }

    //Вывод меньше лимита
    @Test
    void shouldSowAll() {
        AfishaManager manager = new AfishaManager(15);
        manager.addFilm("first");
        manager.addFilm("second");
        manager.addFilm("third");
        manager.addFilm("fourth");
        manager.addFilm("fifth");
        manager.addFilm("sixth");
        manager.addFilm("seventh");
        manager.addFilm("eighth");
        manager.addFilm("ninth");
        manager.addFilm("tenth");
        manager.addFilm("eleventh");
        manager.addFilm("twelfth");
        manager.addFilm("thirteenth");

        String[] actual = manager.findLast();
        String[] expected = {"thirteenth", "twelfth", "eleventh", "tenth", "ninth", "eighth", "seventh", "sixth", "fifth", "fourth", "third", "second", "first"};

        assertArrayEquals(expected, actual);
    }


    //Вывод больше лимита
    @Test
    void shouldSowLimit8() {
        AfishaManager manager = new AfishaManager(8);
        manager.addFilm("first");
        manager.addFilm("second");
        manager.addFilm("third");
        manager.addFilm("fourth");
        manager.addFilm("fifth");
        manager.addFilm("sixth");
        manager.addFilm("seventh");
        manager.addFilm("eighth");
        manager.addFilm("ninth");
        manager.addFilm("tenth");
        String[] expected = {"tenth", "ninth", "eighth", "seventh", "sixth", "fifth", "fourth", "third"};
        String[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

    // когда нет ни одного добавленного Фильма
    @Test
    void shouldPrintText() {
        AfishaManager manager = new AfishaManager(5);
        String[] actual = manager.findAll();
        String[] expected = new String[0];
        assertArrayEquals(expected, actual);

    }


}
