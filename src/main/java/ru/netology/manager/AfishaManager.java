package ru.netology.manager;

import static java.lang.System.arraycopy;


public class AfishaManager {

    private int limit;
    private String[] movies = new String[0]; // пустой

    public AfishaManager() { // выставляем лимит
        this.limit = 10;
    }

    public AfishaManager(int limit) { // берет лимит из параметра
        this.limit = limit;
    }

    // добавление
    public void addFilm(String movie) { // создаем массив на 1 больше
        int length = movies.length + 1;// вычисляем длину +1
        String[] tmp = new String[length];//новый массив
        arraycopy(movies, 0, tmp, 0, length - 1); // добавляем последний элемент
        int lastIndex = tmp.length - 1;// вычисляем номер не заполн ячейки, для доб посл элемента
        tmp[lastIndex] = movie;
        movies = tmp;// копируем новый массив в старый
    }

    // что запомнил
    public String[] findAll() {
        if (movies.length == 0) {
            System.out.println("Мы уже работаем над добавлением фильмов. Спасибо за понимание");
        } else {
            return movies;
        }
        return movies;
    }


    public String[] findLast() {
        String[] result; //создаем результирующий массив
        if (limit < movies.length) {
            result = new String[limit]; //если длина результирующего массива больше лимита, то она = лимиту
        }else {
            result = new String[movies.length]; //если меньше, то разна длине массива
        }
        //в обратном порядке
        for (int i = 0; i < result.length; i++) {
            result[i] = movies[movies.length -i -1];
        }
        return result;
    }

}

