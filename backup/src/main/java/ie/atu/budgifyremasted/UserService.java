package ie.atu.budgifyremasted;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Authenticate user credentials
    public boolean authenticate(String username, String password) {
        User user = userRepository.findByUsername(username);
        return user != null && user.password.equals(password);
    }

    // Register a new user
    public String registerUser(User user) {
        // Check if username already exists
        if (userRepository.existsByUsername(user.getUsername())) {
            return "Username already exists.";
        }

        // Save the new user to the database
        userRepository.save(user);
        return "success";  // Return success message
    }
}
