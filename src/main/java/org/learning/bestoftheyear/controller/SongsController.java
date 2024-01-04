package org.learning.bestoftheyear.controller;

import org.learning.bestoftheyear.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/songs")
public class SongsController {

    // METODI ANNOTATI

    @GetMapping
    public String songsList(Model model) {

    // Recupero la lista di canzoni
        List<Song> songs = getSong();

        model.addAttribute("songs", songs);
        return "songs";
    }

    @GetMapping("/details")
    public String songDetails(@RequestParam int songId, Model model) {
        // Cerco la canzone con l'ID come parametro
        Song song = getSongById(songId);
        model.addAttribute("song", song);
        return "song_details";
    }

    // METODI

    // Metodo getSongs() che recupera una lista di canzoni
    private List<Song> getSong() {
        List<Song> songs = new ArrayList<>();

        songs.add(new Song(1, "Alive", "Pearl Jam"));
        songs.add(new Song(2, "Man In The Box", "Alice In Chains"));
        songs.add(new Song(3, "Breed", "Nirvana"));
        songs.add(new Song(4, "Blackened", "Metallica"));
        songs.add(new Song(5, "Love Is A Long Road", "Tom Petty"));
        songs.add(new Song(6, "Jeremy", "Pearl Jam"));

        return songs;
    }

    private Song getSongById(int songId) {
        // Cerco la canzone tramite l'ID
        Song song = null;
        for (Song s : getSong()) {
            if (s.getId() == songId) {
                song = s;
                break;
            }
        }
        return song;
    }
}
