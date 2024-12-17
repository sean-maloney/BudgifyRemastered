package ie.atu.budgifyremasted;

import jakarta.persistence.*;
import org.hibernate.mapping.List;
import org.hibernate.mapping.Set;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashSet;

@Entity
@Table(name= "Songs")
public class Song {
    private Long songId;
    private String title;
    private String artist;

    @ManyToMany(mappedBy = "likedSongs")
    @JoinTable(
            name = "user_liked_songs",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "song_id")
    )
    private Set<Song> likedSongs = new HashSet<Song>(); // This will hold the liked songs
    private Song userService;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public Set<Song> getLikedSongs() {
        return likedSongs;
    }

    public void setLikedSongs(Set<Song> LikedSongs) {
        this.likedSongs = likedSongs;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Song{title='" + title + "', artist='" + artist + "'}";
    }
    @GetMapping("/{username}/liked-songs")
    public ResponseEntity<Set<Song>> getLikedSongs(@PathVariable String username) {
        Set<Song> likedSongs = userService.getLikedSongs(username);
        if (likedSongs != null && !likedSongs.isMap()) {
            return ResponseEntity.ok(likedSongs); // Return liked songs if found
        }
        return ResponseEntity.notFound().build(); // Return 404 if no liked songs are found
    }
}
