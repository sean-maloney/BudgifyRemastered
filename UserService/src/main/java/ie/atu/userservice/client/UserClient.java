package ie.atu.userservice.client;

import ie.atu.userservice.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public interface UserClient {
    @PostMapping("/login")
    ResponseEntity<String> login(@RequestParam String username, @RequestParam String password);
    @PostMapping("/signup")
    ResponseEntity<String> signUp(@RequestBody User user);
    @PostMapping("/test")
    String test();
   @DeleteMapping("/delete")
    ResponseEntity<String> delete(@RequestParam Long id);
   @PutMapping("/update")
    ResponseEntity<String> update(@RequestParam String password, @RequestAttribute User user );
}
