package ie.atu.userservice.client;

import ie.atu.userservice.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public interface UserClient {
    @PostMapping("/login")
    ResponseEntity<String> login(@RequestParam String username, @RequestParam String password);
    @PostMapping("/signup")
    ResponseEntity<String> signUp(@RequestBody User user);
    @PostMapping("/test")
    String test();
}
