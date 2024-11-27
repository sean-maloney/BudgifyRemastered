package ie.atu.budgifyremasted;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    private final UserRepository userRepository;

    public LoginService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void validateUser(String username, String password){
        User user = userRepository.findByUsername(username);

        if(user == null || !user.getPassword().equals(password)){
            throw new InvalidLoginException("Invalid username or password");
        }
    }
}
