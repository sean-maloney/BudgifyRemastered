package ie.atu.budgifyremasted;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("Login")
public class LoginController {
    private LoginService myService;

    public LoginController(UserService myService) {
        this.myService = myService;
    }
    private List<User> list = new ArrayList<>();

}
