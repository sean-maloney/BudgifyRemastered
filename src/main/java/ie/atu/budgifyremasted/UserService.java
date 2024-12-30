package ie.atu.budgifyremasted;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final List<User> myList = new ArrayList<>();

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Add a user to the list
    public List<User> addUser(User user) {
        myList.add(user);
        return myList;
    }

    // Update a user by ID
    public List<User> updateUser(int id, User user) {
        myList.removeIf(u -> u.getId() == id); // Streamlined removal logic
        myList.add(user);
        return myList;
    }

    // Delete a user by ID
    public List<User> delUser(int id) {
        myList.removeIf(u -> u.getId() == id);
        return myList;
    }

    // Authenticate user credentials
    public boolean authenticate(String username, String password) {
        User user = userRepository.findByUsername(username);
        return user != null && user.getPassword().equals(password);
    }


    // Login endpoint
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User loginRequest) {
        String username = loginRequest.getUsername();
        String password = loginRequest.getPassword();

        if (authenticate(username, password)) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Username or password incorrect");
        }
    }

    // Signup endpoint
    @PostMapping("/signup")
    public ResponseEntity<String> signUp(@RequestBody @Valid User user) {
        // Custom validation
        if (user.getName() == null || user.getName().isEmpty()) {
            return ResponseEntity.badRequest().body("Name is required.");
        }
        if (user.getUsername() == null || user.getUsername().isEmpty()) {
            return ResponseEntity.badRequest().body("Username is required.");
        }
        if (user.getEmail() == null || user.getEmail().isEmpty()) {
            return ResponseEntity.badRequest().body("Email is required.");
        }
        if (user.getPassword() == null || user.getPassword().isEmpty()) {
            return ResponseEntity.badRequest().body("Password is required.");
        }
        if (user.getDate_of_birth() == null) {
            return ResponseEntity.badRequest().body("Invalid date of birth.");
        }
        if (user.getCountry() == null || user.getCountry().isEmpty()) {
            return ResponseEntity.badRequest().body("Country is required.");
        }

        // Check if the username already exists
        if (userRepository.existsByUsername(user.getUsername())) {
            return ResponseEntity.badRequest().body("Username already exists.");
        }

        // Save the user to the database
        userRepository.save(user);

        return ResponseEntity.status(HttpStatus.CREATED).body("User registered successfully.");
    }
}