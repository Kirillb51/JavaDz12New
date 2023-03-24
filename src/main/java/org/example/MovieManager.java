package org.example;




public class MovieManager {

    private int countMovie = 10;
    private MovieRepo[] movies = new MovieRepo[0];

    public MovieManager(int countMovie) {
        this.countMovie = countMovie;
    }

    public MovieManager() {
    }

    public void add(MovieRepo movie) {
        int length = movies.length + 1;
        MovieRepo[] tmp = new MovieRepo[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public MovieRepo[] findLastTen() {

        int resultLength = movies.length;
        if (resultLength >= countMovie) {
            resultLength = countMovie;
        } else {
            resultLength = movies.length;
        }
        MovieRepo[] result = new MovieRepo[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }

    public MovieRepo[] findAll() {
        return movies;
    }
}
