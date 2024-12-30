package ie.atu.searchservice.controllers;

import ie.atu.searchservice.Song;
import ie.atu.searchservice.client.SearchClient;
import ie.atu.searchservice.feing.TestBindings;
import ie.atu.searchservice.services.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
@CrossOrigin(origins = "http://127.0.0.1:8082")
public class SearchController implements SearchClient {
    @Autowired
    private TestBindings testBindings;
    @Autowired
    private SearchService searchService;

    @PostMapping("/test1")
    public ResponseEntity<String> test1() {
        return ResponseEntity.ok(testBindings.test());
    }

    @Override
    public ResponseEntity<String> search(@RequestBody String query) {
        List<Song> songs = searchService.search(query);
        StringBuilder response = new StringBuilder();

        query = query.replace("query=", "");
        query = query.replace("+", " ");

        for (Song song : songs) {
            String name = song.get_name().toLowerCase();
            if (!song.get_name().toLowerCase().contains(query.toLowerCase()) && !query.equals("+")) {
                continue;
            }
            response.append(song.get_name());
        }
        return ResponseEntity.ok(response.toString());
    }
}
