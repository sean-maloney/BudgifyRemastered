package ie.atu.userservice.controller;

import ie.atu.userservice.User;
import ie.atu.userservice.client.UserClient;
import ie.atu.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://127.0.0.1:8080")
public class UserController implements UserClient {
    @Autowired
    private UserService userService;

    @Override
    public ResponseEntity<String> login(@RequestParam String username, @RequestParam String password) {
        if (userService.authenticate(username, password)) {
            return ResponseEntity.ok("http://127.0.0.1:8081/website/BudgifyMainPage.html");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }
    }

    // Signup endpoint
    @Override
    public ResponseEntity<String> signUp(@RequestBody User user) {
        // Call the userService to register the user and handle any error messages
        String result = userService.registerUser(user);
        if (result.equals("success")) {
            return ResponseEntity.status(HttpStatus.CREATED).body("User registered successfully.");
        } else {
            return ResponseEntity.badRequest().body(result);  // Return the error message from UserService
        }
    }

    @Override
    public String test() {
        return "";
    }
}
