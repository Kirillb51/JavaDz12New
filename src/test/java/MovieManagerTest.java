import org.example.MovieManager;
import org.example.MovieRepo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MovieManagerTest {

    MovieRepo movieOne = new MovieRepo(1, "One");
    MovieRepo movieTwo = new MovieRepo(2, "Two");
    MovieRepo movieThree = new MovieRepo(3, "Three");
    MovieRepo movieFour = new MovieRepo(4, "Four");
    MovieRepo movieFive = new MovieRepo(5, "Five");
    MovieRepo movieSix = new MovieRepo(6, "Six");
    MovieRepo movieSeven = new MovieRepo(7, "Seven");
    MovieRepo movieEight = new MovieRepo(8, "Eight");
    MovieRepo movieNine = new MovieRepo(9, "Nine");
    MovieRepo movieTen = new MovieRepo(10, "Ten");
    MovieRepo movieEleven = new MovieRepo(11, "Eleven");
    MovieRepo movieTwelve = new MovieRepo(12, "Twelve");
    MovieRepo movieThirteen = new MovieRepo(13, "Thirteen");
    MovieRepo movieFourteen = new MovieRepo(14, "Fourteen");
    MovieRepo movieFifteen = new MovieRepo(15, "Fifteen");
    MovieRepo movieSixteen = new MovieRepo(16, "Sixteen");

    MovieRepo[] moviesTestList0 = new MovieRepo[0];
    MovieRepo[] moviesTestList1 = {
            movieOne};
    MovieRepo[] moviesTestList5 = {
            movieOne,
            movieTwo,
            movieThree,
            movieFour,
            movieFive};
    MovieRepo[] moviesTestList15 = {
            movieOne,
            movieTwo,
            movieThree,
            movieFour,
            movieFive,
            movieSix,
            movieSeven,
            movieEight,
            movieNine,
            movieTen,
            movieEleven,
            movieTwelve,
            movieThirteen,
            movieFourteen,
            movieFifteen};

    MovieRepo[] moviesExpectedAdd0 = {
            movieOne};
    MovieRepo[] moviesExpectedAdd1 = {
            movieOne,
            movieTwo};
    MovieRepo[] moviesExpectedAdd5 = {
            movieOne,
            movieTwo,
            movieThree,
            movieFour,
            movieFive,
            movieSix};
    MovieRepo[] moviesExpectedAdd15 = {
            movieOne,
            movieTwo,
            movieThree,
            movieFour,
            movieFive,
            movieSix,
            movieSeven,
            movieEight,
            movieNine,
            movieTen,
            movieEleven,
            movieTwelve,
            movieThirteen,
            movieFourteen,
            movieFifteen,
            movieSixteen};

    MovieRepo[] moviesExpectedFindAll0 = new MovieRepo[0];
    MovieRepo[] moviesExpectedFindAll1 = {
            movieOne};
    MovieRepo[] moviesExpectedFindAll5 = {
            movieOne,
            movieTwo,
            movieThree,
            movieFour,
            movieFive};
    MovieRepo[] moviesExpectedFindAll15 = {
            movieOne,
            movieTwo,
            movieThree,
            movieFour,
            movieFive,
            movieSix,
            movieSeven,
            movieEight,
            movieNine,
            movieTen,
            movieEleven,
            movieTwelve,
            movieThirteen,
            movieFourteen,
            movieFifteen};

    MovieRepo[] moviesExpectedFindLast0DefaultCount = new MovieRepo[0];
    MovieRepo[] moviesExpectedFindLast1DefaultCount = {
            movieOne};
    MovieRepo[] moviesExpectedFindLast5DefaultCount = {
            movieFive,
            movieFour,
            movieThree,
            movieTwo,
            movieOne};
    MovieRepo[] moviesExpectedFindLast15DefaultCount = {
            movieFifteen,
            movieFourteen,
            movieThirteen,
            movieTwelve,
            movieEleven,
            movieTen,
            movieNine,
            movieEight,
            movieSeven,
            movieSix};

    MovieRepo[] moviesExpectedFindLast15Count0 = new MovieRepo[0];
    MovieRepo[] moviesExpectedFindLast5Count7 = {
            movieFive,
            movieFour,
            movieThree,
            movieTwo,
            movieOne};
    MovieRepo[] moviesExpectedFindLast15Count7 = {
            movieFifteen,
            movieFourteen,
            movieThirteen,
            movieTwelve,
            movieEleven,
            movieTen,
            movieNine};

    MovieManager manager = new MovieManager();
    MovieManager managerCountNull = new MovieManager(0);
    MovieManager managerCountSeven = new MovieManager(7);

    @Test
    void shouldAddNullMovies() {
        MovieRepo[] expected = moviesExpectedAdd0;
        manager.setMovies(moviesTestList0);
        manager.add(movieOne);
        assertArrayEquals(expected, manager.getMovies());
    }

    @Test
    void shouldAddOneMovies() {
        MovieRepo[] expected = moviesExpectedAdd1;
        manager.setMovies(moviesTestList1);
        manager.add(movieTwo);
        assertArrayEquals(expected, manager.getMovies());
    }

    @Test
    void shouldAddFiveMovies() {
        MovieRepo[] expected = moviesExpectedAdd5;
        manager.setMovies(moviesTestList5);
        manager.add(movieSix);
        assertArrayEquals(expected, manager.getMovies());
    }

    @Test
    void shouldAddFifteenMovies() {
        MovieRepo[] expected = moviesExpectedAdd15;
        manager.setMovies(moviesTestList15);
        manager.add(movieSixteen);
        assertArrayEquals(expected, manager.getMovies());
    }

    @Test
    void shouldFindAllNullMovies() {
        MovieRepo[] expected = moviesExpectedFindAll0;
        manager.setMovies(moviesTestList0);
        manager.findAll();
        assertArrayEquals(expected, manager.getMovies());
    }

    @Test
    void shouldFindAllOneMovies() {
        MovieRepo[] expected = moviesExpectedFindAll1;
        manager.setMovies(moviesTestList1);
        manager.findAll();
        assertArrayEquals(expected, manager.getMovies());
    }

    @Test
    void shouldFindAllFiveMovies() {
        MovieRepo[] expected = moviesExpectedFindAll5;
        manager.setMovies(moviesTestList5);
        manager.findAll();
        assertArrayEquals(expected, manager.getMovies());
    }

    @Test
    void shouldFindAllFifteenMovies() {
        MovieRepo[] expected = moviesExpectedFindAll15;
        manager.setMovies(moviesTestList15);
        manager.findAll();
        assertArrayEquals(expected, manager.getMovies());
    }

    @Test
    void shouldFindLastNullMoviesDefaultCount() {
        MovieRepo[] expected = moviesExpectedFindLast0DefaultCount;
        manager.setMovies(moviesTestList0);
        manager.findLast();
        assertArrayEquals(expected, manager.getMoviesReverse());
    }

    @Test
    void shouldFindLastOneMoviesDefaultCount() {
        MovieRepo[] expected = moviesExpectedFindLast1DefaultCount;
        manager.setMovies(moviesTestList1);
        manager.findLast();
        assertArrayEquals(expected, manager.getMoviesReverse());
    }

    @Test
    void shouldFindLastFiveMoviesDefaultCount() {
        MovieRepo[] expected = moviesExpectedFindLast5DefaultCount;
        manager.setMovies(moviesTestList5);
        manager.findLast();
        assertArrayEquals(expected, manager.getMoviesReverse());
    }

    @Test
    void shouldFindLastFifteenMoviesDefaultCount() {
        MovieRepo[] expected = moviesExpectedFindLast15DefaultCount;
        manager.setMovies(moviesTestList15);
        manager.findLast();
        assertArrayEquals(expected, manager.getMoviesReverse());
    }

    @Test
    void shouldFindLastFifteenMoviesCountNull() {
        MovieRepo[] expected = moviesExpectedFindLast15Count0;
        managerCountNull.setMovies(moviesTestList15);
        managerCountNull.findLast();
        assertArrayEquals(expected, managerCountNull.getMoviesReverse());
    }

    @Test
    void shouldFindLastFiveMoviesCountSeven() {
        MovieRepo[] expected = moviesExpectedFindLast5Count7;
        managerCountSeven.setMovies(moviesTestList5);
        managerCountSeven.findLast();
        assertArrayEquals(expected, managerCountSeven.getMoviesReverse());
    }

    @Test
    void shouldFindLastFifteenMoviesCountSeven() {
        MovieRepo[] expected = moviesExpectedFindLast15Count7;
        managerCountSeven.setMovies(moviesTestList15);
        managerCountSeven.findLast();
        assertArrayEquals(expected, managerCountSeven.getMoviesReverse());
    }
}
