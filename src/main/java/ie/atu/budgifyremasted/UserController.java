package ie.atu.budgifyremasted;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")  // Ensure that the base path is included
@CrossOrigin(origins = "http://127.0.0.1:8081")  // Allow frontend on port 8081
public class UserController {

    @Autowired
    private UserService userService;

    // POST method for signup
    @PostMapping("/signup")  // Make sure this maps to /api/users/signup
    public ResponseEntity<String> signUp(@RequestBody User user) {
        // Check if the username already exists
        if (userService.usernameExists(user.getUsername())) {
            return ResponseEntity.badRequest().body("Username already exists.");
        }

        // Save the user to the database
        userService.addUser(user);

        return ResponseEntity.status(HttpStatus.CREATED).body("User registered successfully.");
    }

    // POST method for login
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam String username, @RequestParam String password) {
        if (userService.authenticate(username, password)) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }
    }
}
