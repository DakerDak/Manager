package ru.netology;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ManagerTest {
    @Test
    public void shoulMovies() {
        Manager manager = new Manager();
        manager.addMovies("movie1");
        manager.addMovies("movie2");
        manager.addMovies("movie3");
        manager.addMovies("movie4");

        String[] actual = manager.findAll();
        String[] expected = {"movie1", "movie2", "movie3", "movie4"};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shoulMovies2() {
        Manager manager = new Manager();
        manager.addMovies("movie1");

        String[] actual = manager.findAll();
        String[] expected = {"movie1"};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shoulMovies3() {
        Manager manager = new Manager();


        String[] actual = manager.findAll();
        String[] expected = {};

        assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldLastMovies() {
        Manager manager = new Manager(10);
        manager.addMovies("movie1");
        manager.addMovies("movie2");
        manager.addMovies("movie3");
        manager.addMovies("movie4");
        manager.addMovies("movie5");
        manager.addMovies("movie6");
        manager.addMovies("movie7");
        manager.addMovies("movie8");
        manager.addMovies("movie9");
        manager.addMovies("movie10");
        manager.addMovies("movie11");
        manager.addMovies("movie12");
        manager.addMovies("movie13");
        manager.addMovies("movie14");
        manager.addMovies("movie15");
        manager.addMovies("movie16");

        String[] actual = manager.findLast();
        String[] expected = {
                "movie16",
                "movie15",
                "movie14",
                "movie13",
                "movie12",
                "movie11",
                "movie10",
                "movie9",
                "movie8",
                "movie7",

        };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLastMovies2() {
        Manager manager = new Manager(5);
        manager.addMovies("movie1");
        manager.addMovies("movie2");
        manager.addMovies("movie3");
        manager.addMovies("movie4");
        manager.addMovies("movie5");
        manager.addMovies("movie6");
        manager.addMovies("movie7");
        manager.addMovies("movie8");
        manager.addMovies("movie9");
        manager.addMovies("movie10");
        manager.addMovies("movie11");
        manager.addMovies("movie12");
        manager.addMovies("movie13");
        manager.addMovies("movie14");
        manager.addMovies("movie15");
        manager.addMovies("movie16");

        String[] actual = manager.findLast();
        String[] expected = {
                "movie16",
                "movie15",
                "movie14",
                "movie13",
                "movie12",


        };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLastMovies3() {
        Manager manager = new Manager();
        manager.addMovies("movie1");
        manager.addMovies("movie2");
        manager.addMovies("movie3");
        manager.addMovies("movie4");


        String[] actual = manager.findLast();
        String[] expected = {
                "movie4",
                "movie3",
                "movie2",
                "movie1",

        };
        assertArrayEquals(expected, actual);
    }


}
