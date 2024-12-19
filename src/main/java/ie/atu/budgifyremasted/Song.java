package ie.atu.budgifyremasted;

import jakarta.persistence.*;

@Entity
@Table(name= "Songs")
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long songId;

    @Column(name= "song_name")
    private String song_name;

    @Column(name= "artist_id")
    private String artist_id;

    @Column(name= "liked_songs")
    private String liked_songs;

    public Song(){}

    public Long getSongId() {
        return songId;
    }

    public void setSongId(Long song_id) {
        this.songId = song_id;
    }

    public String getSong_name() {
        return song_name;
    }

    public String getArtist_id() {
        return artist_id;
    }

    public String getLiked_songs() {
        return liked_songs;
    }

    public void setLiked_songs(String liked_songs) {
        this.liked_songs = liked_songs;
    }

    public Song(Long songId, String song_name, String artist_id, String liked_songs) {
        this.songId = songId;
        this.song_name = song_name;
        this.artist_id = artist_id;
        this.liked_songs = liked_songs;
    }
// private Set<Song> likedSongs = new HashSet<Song>(); // This will hold the liked songs


   // public Set<Song> getLikedSongs() {
   //     return likedSongs;
   // }

    //public void setLikedSongs(Set<Song> LikedSongs) {
   //     this.likedSongs = likedSongs;
   // }
    public void setSong_name(String songName) {
        this.song_name = songName;
    }

    public void setArtist_id(String artist) {
        this.artist_id = artist;
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
