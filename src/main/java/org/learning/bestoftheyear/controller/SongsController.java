package org.learning.bestoftheyear.controller;

import org.learning.bestoftheyear.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/songs")
public class SongsController {

    @GetMapping
    public String songsList(Model model) {

    // Recupero la lista di canzoni
        List<Song> songs = getSong();

        model.addAttribute("songs", songs);
        return "songs";
    }

    // METODI

    // Metodo getSongs() che recupera una lista di canzoni
    private List<Song> getSong() {
        List<Song> songs = new ArrayList<>();

        songs.add(new Song(1, "Alive", "Pearl Jam"));
        songs.add(new Song(3, "Man In The Box", "Alice In Chains"));
        songs.add(new Song(4, "Breed", "Nirvana"));
        songs.add(new Song(5, "Blackened", "Metallica"));
        songs.add(new Song(6, "Love Is A Long Road", "Tom Petty"));
        songs.add(new Song(2, "Jeremy", "Pearl Jam"));

        return songs;
    }
}
