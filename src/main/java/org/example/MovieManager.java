package org.example;

public class MovieManager {
    private MovieRepo[] movies = new MovieRepo[0];
    private MovieRepo[] moviesReverse = new MovieRepo[0];
    private int countMovies = 10;

    public MovieManager() {
    }

    public MovieManager(int countMovies) {
        this.countMovies = countMovies;
    }

    public MovieRepo[] getMovies() {
        return movies;
    }

    public void setMovies(MovieRepo[] movies) {
        this.movies = movies;
    }

    public MovieRepo[] getMoviesReverse() {
        return moviesReverse;
    }

    public void setMoviesReverse(MovieRepo[] moviesReverse) {
        this.moviesReverse = moviesReverse;
    }

    public int getCountMovies() {
        return countMovies;
    }

    public void setCountMovies(int countMovies) {
        this.countMovies = countMovies;
    }


    public void add(MovieRepo movie) {
        MovieRepo[] tmp = new MovieRepo[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[movies.length] = movie;
        movies = tmp;
    }


    public void findAll() {
        getMovies();
    }


    public void findLast() {
        if (countMovies > movies.length) {
        }
        MovieRepo[] tmp = new MovieRepo[countMovies];
        for (int i = 0, j = movies.length - 1; i < countMovies; i++, j--) {
            tmp[i] = movies[j];
        }
        moviesReverse = tmp;
    }
}