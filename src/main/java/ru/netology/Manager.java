package ru.netology;

public class Manager {
    public String[] movies = new String[0];
    protected int limit;

    public Manager() {
     this.limit = 10;
    }
    public Manager(int limit) {
          this.limit = limit;
    }

    public void addMovies (String movie) {
        String[] tmp = new String[movies.length +1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }
    public String[] findLast() {
        int resultlength;
        if (movies.length >=limit) {
            resultlength = limit;
        } else {
            resultlength = movies.length;
        }
        String[] result = new String[resultlength];
        for (int i = 0; i < result.length; i++) {
            result[i] =  movies[movies.length - 1 - i];
        }
            return result;
    }
}
