package ie.atu.budgifyremasted;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    private List<User> myList = new ArrayList<>();

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //public List<User> likedSongs(User user) {
    //    return mylikedSongs;
   // }

    public List<User> addUser(User user) {
        myList.add(user);
        return myList;
    }

    public List<User> updateUser(int id, User user)
    {
        for(User u : myList){
            if(u.getId() == id){
                myList.remove(u);
            }
        }
        myList.add(user);
        return myList;
    }
    public  List<User> delUser(int id)
    {
        for(User u : myList){
            if(u.getId() == id){
                myList.remove(u);
            }
        }
        return myList;
    }
}
