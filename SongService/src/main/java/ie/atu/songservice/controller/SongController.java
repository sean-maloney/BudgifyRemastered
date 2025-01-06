package ie.atu.songservice.controller;

import ie.atu.songservice.Song;
import ie.atu.songservice.service.SongService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/songs")
@CrossOrigin(origins = "http://127.0.0.1:8082")
public class SongController {

    private final SongService songService;

    public SongController(SongService songService) {
        this.songService = songService;
    }

    // Get all songs
    @GetMapping
    public ResponseEntity<List<Song>> getAllSongs() {
        List<Song> songs = songService.getAllSongs();
        return ResponseEntity.ok(songs);
    }

    // Get a song by ID
    @GetMapping("/{id}")
    public ResponseEntity<Song> getSongById(@PathVariable String id) {
        Song song = songService.getSongById(id);
        if (song == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(song);
    }

    // Add a new song
    @PostMapping
    public ResponseEntity<Song> addSong(@RequestBody Song song) {
        Song createdSong = songService.addSong(song);
        return ResponseEntity.status(201).body(createdSong);
    }

    // Update an existing song
    @PutMapping("/{id}")
    public ResponseEntity<Song> updateSong(@PathVariable String id, @RequestBody Song song) {
        Song updatedSong = songService.updateSong(id, song);
        if (updatedSong == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updatedSong);
    }

    // Delete a song
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSong(@PathVariable String id) {
        boolean deleted = songService.deleteSong(id);
        if (!deleted) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.noContent().build();
    }

    // Get liked songs
    @GetMapping("/liked")
    public ResponseEntity<List<Song>> getLikedSongs() {
        List<Song> likedSongs = songService.getLikedSongs();
        return ResponseEntity.ok(likedSongs);
    }

    // Add a song to liked songs
    @PostMapping("/liked/{id}")
    public ResponseEntity<Void> likeSong(@PathVariable String id) {
        boolean liked = songService.LikeSong(id);
        if (!liked) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().build();
    }

    // Remove a song from liked songs
    @DeleteMapping("/liked/{id}")
    public ResponseEntity<Void> DislkeSong(@PathVariable String id) {
        boolean unliked = songService.DislikeSong(id);
        if (!unliked) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.noContent().build();
    }
}