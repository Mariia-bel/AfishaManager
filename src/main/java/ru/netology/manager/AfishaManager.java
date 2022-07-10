package ru.netology.manager;

import ru.netology.domain.FilmItem;

import static java.lang.System.arraycopy;


public class AfishaManager {

    private int limit;
    private FilmItem[] movies = new FilmItem[limit];

    public AfishaManager() {
        this.limit = 10;
    }

    public AfishaManager(int limit) {
        this.limit = limit;
    }


    public void addFilm(FilmItem movie) {
        int length = movies.length + 1;
        FilmItem[] tmp = new FilmItem[length];
        arraycopy(movies, 0, tmp, 0, length - 1);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public FilmItem[] getMovies() {

        FilmItem[] newResult = new FilmItem[limit];
        int count = 0;
        for (int i = 0; i < limit; i++) {
            int index = movies.length - i - 1;
            newResult[count] = movies[index];
            count += 1;

        }
        FilmItem[] result = new FilmItem[count];
        arraycopy(newResult, 0, result, 0, count);

        return result;
    }
}

