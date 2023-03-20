import org.example.MovieManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MovieManagerTest {
    @Test
    public void test() {

        MovieManager manager = new MovieManager();

        manager.addMovie("film 1");
        manager.addMovie("film 2");
        manager.addMovie("film 3");

        String[] expected = {"film 1", "film 2", "film 3"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFor1() {

        MovieManager manager = new MovieManager();

        manager.addMovie("film 1");


        String[] expected = {"film 1"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFor0() {

        MovieManager manager = new MovieManager();


        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void findLast() {


        MovieManager manager = new MovieManager();


        manager.addMovie("film 1");
        manager.addMovie("film 2");
        manager.addMovie("film 3");
        manager.addMovie("film 4");
        manager.addMovie("film 5");
        String[] expected = {"film 1"};
        String[] actual = {"film 1"};


        Assertions.assertArrayEquals(expected, actual);


    }
}


