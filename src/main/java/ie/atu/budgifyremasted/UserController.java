package ie.atu.budgifyremasted;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://127.0.0.1:8081")  // Allow frontend on port 8081
public class UserController {

    @Autowired
    private UserService userService;  // Inject the UserService properly

    // Login endpoint
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam String username, @RequestParam String password) {
        if (userService.authenticate(username, password)) {
            return ResponseEntity.ok("http://127.0.0.1:8081/Webpage/BudgifyMainPage.html");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }
    }

    // Signup endpoint
    @PostMapping("/signup")
    public ResponseEntity<String> signUp(@RequestBody User user) {
        // Call the userService to register the user and handle any error messages
        String result = userService.registerUser(user);
        if (result.equals("success")) {
            return ResponseEntity.status(HttpStatus.CREATED).body("User registered successfully.");
        } else {
            return ResponseEntity.badRequest().body(result);  // Return the error message from UserService
        }
    }
}
