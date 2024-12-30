package ie.atu.budgifyremasted;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Method to check if the username already exists
    public boolean usernameExists(String username) {
        return userRepository.existsByUsername(username);
    }

    // Method to save the user to the database
    public void addUser(User user) {
        userRepository.save(user);
    }

    // Method to authenticate user login
    public boolean authenticate(String username, String password) {
        User user = userRepository.findByUsername(username);
        return user != null && user.getPassword().equals(password);
    }
}
