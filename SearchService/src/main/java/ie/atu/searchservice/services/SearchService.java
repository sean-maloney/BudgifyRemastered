package ie.atu.searchservice.services;

import ie.atu.searchservice.Song;
import ie.atu.searchservice.SongRepository;
import ie.atu.searchservice.client.SearchClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/search")
public class SearchService {
    private final SongRepository songRepository;
    private final SearchClient searchClient;

    @Autowired
    public SearchService(@Lazy SearchClient client, SongRepository songRepository) {
        this.searchClient = client;
        this.songRepository = songRepository;
    }

    public List<Song> search(String text) {
        List<Song> songs = songRepository.findAll();
        songs.removeIf(song -> song.get_name().toLowerCase().contains(text.toLowerCase()));
        return songs;
    }
}
