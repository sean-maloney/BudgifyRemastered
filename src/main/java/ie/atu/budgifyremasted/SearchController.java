package ie.atu.budgifyremasted;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/songs")
public class SearchController {

    @Autowired
    private Search search;

    // Endpoint to search songs by title
   // @GetMapping("/search/songs")
   // public List<Song> searchSongs(@RequestParam String title) {
   //     return search.Search(title);

    }
}