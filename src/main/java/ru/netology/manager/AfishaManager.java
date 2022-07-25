package ru.netology.manager;

import ru.netology.domain.FilmItem;

import static java.lang.System.arraycopy;


public class AfishaManager {

    private int limit;
    private FilmItem[] movies = new FilmItem[0]; // пустой

    public AfishaManager() { // выставляем лимит
        this.limit = 10;
    }

    public AfishaManager(int limit) { // берет лимит из параметра
        this.limit = limit;
    }

    // добавление
    public void addFilm(FilmItem movie) { // создаем массив на 1 больше
        int length = movies.length + 1;// вычисляем длину +1
        FilmItem[] tmp = new FilmItem[length];//новый массив
        arraycopy(movies, 0, tmp, 0, length - 1); // добавляем последний элемент
        int lastIndex = tmp.length - 1;// вычисляем номер не заполн ячейки, для доб посл элемента
        tmp[lastIndex] = movie;
        movies = tmp;// копируем новый массив в старый
    }

    // что запомнил
    public FilmItem[] findAll(){ return movies;}


    // что запомнил в обратном порядке
    public FilmItem[] getAll() {

        FilmItem[] movies = findAll();//что запомнил
        FilmItem[] newResult = new FilmItem[movies.length]; // новый массив
        for (int i = 0; i < newResult.length; i++) {//перебирает массив
            int index = movies.length - i - 1;// берем ячейку, куда хотим копировать -1, вычисляем последнюю ячейку, чтоб скопировать первую
            newResult[i] = movies[index]; // из старого массива размера индекс положить в массив резалт
        }

        return newResult;
    }


    public FilmItem[] findLast() {
        int resultLength;
        if (limit > movies.length) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }

        FilmItem [] result = new FilmItem[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index]; //копируем массив
        }
        return result;
    }

}

