import org.example.MovieManager;
import org.example.MovieRepo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MovieManagerTest {
    MovieManager movie = new MovieManager();

    private MovieRepo movie1 = new MovieRepo(1, "film1", "боевик", false);
    private MovieRepo movie2 = new MovieRepo(2, "film2", "мультфильм", false);
    private MovieRepo movie3 = new MovieRepo(3, "film3", "комедия", false);
    private MovieRepo movie4 = new MovieRepo(4, "film4", "боевик", false);
    private MovieRepo movie5 = new MovieRepo(5, "film5", "ужасы", false);
    private MovieRepo movie6 = new MovieRepo(6, "film6", "мультфильм", true);
    private MovieRepo movie7 = new MovieRepo(7, "film7", "комедия", true);
    private MovieRepo movie8 = new MovieRepo(8, "film8", "ужасы", false);
    private MovieRepo movie9 = new MovieRepo(9, "film9", "мультфильм", true);
    private MovieRepo movie10 = new MovieRepo(10, "film10", "комедия", true);
    private MovieRepo movie11 = new MovieRepo(11, "film11", "комедия", true);

    @Test
    public void shouldAddMovie() {
        movie.add(movie1);
        movie.add(movie2);

        MovieRepo[] expected = {movie1, movie2};
        MovieRepo[] actual = movie.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNullMovie() {
        MovieRepo[] expected = {};
        MovieRepo[] actual = movie.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllLimit() {
        movie.add(movie1);
        movie.add(movie2);
        movie.add(movie3);
        movie.add(movie4);
        movie.add(movie5);
        movie.add(movie6);
        movie.add(movie7);
        movie.add(movie8);
        movie.add(movie9);
        movie.add(movie10);
        movie.add(movie11);

        MovieRepo[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10, movie11};
        MovieRepo[] actual = movie.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllOverLimit() {
        movie.add(movie1);
        movie.add(movie2);
        movie.add(movie3);
        movie.add(movie4);
        movie.add(movie5);
        movie.add(movie6);
        movie.add(movie7);
        movie.add(movie8);
        movie.add(movie9);
        movie.add(movie10);


        MovieRepo[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10};
        MovieRepo[] actual = movie.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllLimit5() {

        movie.add(movie1);
        movie.add(movie2);
        movie.add(movie3);
        movie.add(movie4);
        movie.add(movie5);


        MovieRepo[] expected = {movie1, movie2, movie3, movie4, movie5};
        MovieRepo[] actual = movie.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLastSevenMovie() {
        movie.add(movie1);
        movie.add(movie2);
        movie.add(movie3);
        movie.add(movie4);
        movie.add(movie5);
        movie.add(movie6);
        movie.add(movie7);

        MovieRepo[] expected = {movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        MovieRepo[] actual = movie.findLastTen();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLastTenLimit() {
        movie.add(movie1);
        movie.add(movie2);
        movie.add(movie3);
        movie.add(movie4);
        movie.add(movie5);
        movie.add(movie6);
        movie.add(movie7);
        movie.add(movie8);
        movie.add(movie9);
        movie.add(movie10);

        MovieRepo[] expected = {movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        MovieRepo[] actual = movie.findLastTen();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLastTenLimit5() {
        MovieManager movie = new MovieManager(5);

        movie.add(movie1);
        movie.add(movie2);
        movie.add(movie3);
        movie.add(movie4);
        movie.add(movie5);
        movie.add(movie6);
        movie.add(movie7);
        movie.add(movie8);
        movie.add(movie9);
        movie.add(movie10);

        MovieRepo[] expected = {movie10, movie9, movie8, movie7, movie6};
        MovieRepo[] actual = movie.findLastTen();

        assertArrayEquals(expected, actual);
    }
}
