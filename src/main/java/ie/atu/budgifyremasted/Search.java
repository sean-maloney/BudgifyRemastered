package ie.atu.budgifyremasted;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class Search {

    @Autowired
    private SongRepository songRepository;

    // Simple search method that uses the repository to find songs by title
    //public List<Song> Search(String searchTerm) {
      //  return songRepository.findByTitleContainingIgnoreCase(searchTerm);
    //}
}