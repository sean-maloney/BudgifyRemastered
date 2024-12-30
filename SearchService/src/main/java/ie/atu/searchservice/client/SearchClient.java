package ie.atu.searchservice.client;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface SearchClient {
    @PostMapping("/search")
    ResponseEntity<String> search(@RequestBody String query);
}
