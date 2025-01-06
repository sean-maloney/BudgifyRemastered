package ie.atu.userservice.service;

import ie.atu.userservice.User;
import ie.atu.userservice.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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
        return user != null && user.getPassword().equals(password);
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

    public String deleteUser(Long id) {
        userRepository.deleteById(id);
        return "User deleted successfully.";
    }

    public String updatePassword(User user, String newPassword) {
        user.setPassword(newPassword);
        userRepository.save(user);
        return "Password updated successfully.";
    }
}
