package ie.atu.searchservice;

import jakarta.persistence.*;

@Entity
@Table(name="songs")
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "song_id", nullable = false)
    private Long song_id;

    @Column(name = "song_name")
    private String song_name;

    @Column(name = "artist_id")
    private String artist_id;

    public String get_name() {
        return song_name;
    }

    public Song() {

    }
}