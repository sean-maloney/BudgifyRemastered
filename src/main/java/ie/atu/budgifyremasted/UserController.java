package ie.atu.budgifyremasted;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/User")
public class UserController {
    private UserService myService;

    public UserController(UserService myService) {this.myService = myService;}

    private List<User> list = new ArrayList<>();

    @PostMapping("/add")
    public List<User> newUser(@Valid @RequestBody User user){
        list = myService.addUser(user);
        return list;
    }

    @PostMapping("/del/{userId}")
    public List<User> removeUser(@Valid @PathVariable int userId){
        list = myService.delUser(userId);
        return list;
    }

    @PutMapping("update/{id}")
    public List<User> updateUser(@Valid @PathVariable int userId, @RequestBody User user){
        list=myService.updateUser(userId, user);
        return list;
    }
}
