package ie.atu.songservice;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name= "songs")
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "song_id", nullable = false)
    private Long song_id;

    @Column(name = "song_name")
    private String song_name;

    @Column(name = "artist_id")
    private String artist_id;

    @Column(name = "liked_songs")
    private String liked_songs;

    @Column(name = "disliked_songs")
    private String disliked_songs;

    public Song() {
    }

    public Long getSong_id() {
        return song_id;
    }

    public void setSong_id(Long song_id) {
        this.song_id = song_id;
    }

    public String getSong_name() {
        return song_name;
    }

    public void setSong_name(String song_name) {
        this.song_name = song_name;
    }

    public String getArtist_id() {
        return artist_id;
    }

    public void setArtist_id(String artist) {
        this.artist_id = artist;
    }

    public String getLiked_songs() {
        return liked_songs;
    }

    public void setLiked_songs(String liked_songs) {
        this.liked_songs = liked_songs;
    }

    public String getDisliked_songs() {
        return disliked_songs;
    }

    public void setDisliked_songs(String disliked_songs) {
        this.disliked_songs = disliked_songs;
    }

    public Song(Long song_id, String song_name, String artist_id, String liked_songs) {
        this.song_id = song_id;
        this.song_name = song_name;
        this.artist_id = artist_id;
        this.liked_songs = liked_songs;
    }

  // private Set<Song> liked_songs = new HashSet<Song>(); // This will hold the liked songs

    public void setLikedSongs(Set<Song> LikedSongs) {
        this.liked_songs = liked_songs;
    }

    public void setDislikedSongs(Set<Song> DislikedSongs){
        this.disliked_songs = disliked_songs;
    }

    public Long setSong_id(){
        return null;
    }


//@GetMapping("/{username}/liked-songs")
//public ResponseEntity<Set<Song>> getLikedSongs(@PathVariable String username) {
//    Set<Song> likedSongs = userService.getLikedSongs(username);
//    if (likedSongs != null && !likedSongs.isMap()) {
//        return ResponseEntity.ok(likedSongs); // Return liked songs if found
//    }
//    return ResponseEntity.notFound().build(); // Return 404 if no liked songs are found
//  }
}