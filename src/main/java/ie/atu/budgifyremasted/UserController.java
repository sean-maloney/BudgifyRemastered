package ie.atu.budgifyremasted;

import ie.atu.budgifyremasted.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam int password) {
        if (userService.authenticate(username, password)) {
            return "redirect:/BudgifyMainPage.html";
        } else {
            return "Invalid credentials";
        }
    }


}
