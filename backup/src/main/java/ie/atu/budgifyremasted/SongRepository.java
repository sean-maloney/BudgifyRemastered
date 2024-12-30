package ie.atu.budgifyremasted;

import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends JpaRepository<Song, Long> {
   // List<Song> findByArtistContainingIgnoreCase(String artist);
    //List<Song> findByTitleContainingIgnoreCase(String title);
   // List<Song> findByTitleContainingIgnoreCase(String LikedSongs);
}
