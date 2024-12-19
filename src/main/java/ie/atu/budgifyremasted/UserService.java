package ie.atu.budgifyremasted;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.mapping.Set;
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

    public List<User> updateUser(int user_Id, User user)
    {
        for(User u : myList){
            if(u.getUser_Id() == user_Id){
                myList.remove(u);
            }
        }
        myList.add(user);
        return myList;
    }
    public  List<User> delUser(int userId)
    {
        for(User u : myList){
            if(u.getUser_Id() == user_Id){
                myList.remove(u);
            }
        }
        return myList;
    }
}
