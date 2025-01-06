package ie.atu.songservice.service;

import ie.atu.songservice.Song;
import ie.atu.songservice.client.SongClient;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class SongService {
    // List<Song> findByArtistContainingIgnoreCase(String artist);
    //List<Song> findByTitleContainingIgnoreCase(String title);
    // List<Song> findByTitleContainingIgnoreCase(String LikedSongs);

    private final List<Song> songDatabase = new ArrayList<>();
    private final List<Song> likedSongs = new ArrayList<>();

    public List<Song> getAllSongs() {
        return new ArrayList<>(songDatabase);
    }

    public Song getSongById(String id) {
        return songDatabase.stream()
                .filter(song -> song.getSong_id().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Song addSong(Song song) {
        songDatabase.add(song);
        return song;
    }

    public Song updateSong(String id, Song updatedSong) {
        Optional<Song> existingSong = songDatabase.stream()
                .filter(song -> song.getSong_id().equals(id))
                .findFirst();

        if (existingSong.isPresent()) {
            Song song = existingSong.get();
            song.setSong_name(updatedSong.getSong_name());
            song.setArtist_id(updatedSong.getArtist_id());
            song.setSong_id(updatedSong.setSong_id());
            return song;
        }

        return null;
    }

    public boolean deleteSong(String id) {
        return songDatabase.removeIf(song -> song.getSong_id().equals(id));
    }

    public List<Song> getLikedSongs() {
        return new ArrayList<>(likedSongs);
    }

    public boolean LikeSong(String id) {
        Song song = getSongById(id);
        if (song != null && !likedSongs.contains(song)) {
            likedSongs.add(song);
            return true;
        }
        return false;
    }

    public boolean DislikeSong(String id) {
        return likedSongs.removeIf(song -> song.getLiked_songs().equals(id));
    }
}
