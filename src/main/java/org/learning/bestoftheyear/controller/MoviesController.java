package org.learning.bestoftheyear.controller;

import org.learning.bestoftheyear.model.Movie;
import org.learning.bestoftheyear.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/movies")
public class MoviesController {
    // METODI ANNOTATI

    @GetMapping
    public String movieList(Model model) {

        // Recupero la lista di film
        List<Movie> movies = getMovie();

        model.addAttribute("movies", movies);
        return "movies";
    }

    @GetMapping("/details")
    public String movieDetails(@RequestParam int movieId, Model model) {
        // Cerco il film con l'ID come parametro
        Movie movie = getMovieById(movieId);
        model.addAttribute("movie", movie);
        return "movie_details";
    }

    // METODI

    // Metodo getMovies() che recupera una lista di film
    private List<Movie> getMovie() {
        List<Movie> songs = new ArrayList<>();

        songs.add(new Movie(1, "Jurassic Park", "Steven Spielberg"));
        songs.add(new Movie(2, "Inception", "Christopher Nolan"));
        songs.add(new Movie(3, "Pulp Fiction", "Quentin Tarantino"));
        songs.add(new Movie(4, "Il Grande Lebowski", "Coen Brothers"));
        songs.add(new Movie(5, "Interstellar", "Christopher Nolan"));
        songs.add(new Movie(6, "Il Padrino", "Francis Ford Coppola"));

        return songs;
    }

    private Movie getMovieById(int movieId) {
        // Cerco il film tramite l'ID
        Movie movie = null;
        for (Movie m : getMovie()) {
            if (m.getId() == movieId) {
                movie = m;
                break;
            }
        }
        return movie;
    }
}
