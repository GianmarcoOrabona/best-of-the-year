package org.learning.bestoftheyear.model;

public class Movie {
    // ATTRIBUTI

    private int id;
    private String title;
    private String director;

    // COSTRUTTORI

    public Movie(int id, String title, String director) {
        this.id = id;
        this.title = title;
        this.director = director;
    }

    // GETTER E SETTER

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    // METODI
}
