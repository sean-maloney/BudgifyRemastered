package ie.atu.budgifyremasted;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private List<User> myList = new ArrayList<>();
    public List<User> addUser(User user) {
        myList.add(user);
        return myList;
    }

    public List<User> updateUser(int userId, User user)
    {
        for(User u : myList){
            if(u.getUserId() == userId){
                myList.remove(u);
            }
        }
        myList.add(user);
        return myList;
    }
    public  List<User> delUser(int userId)
    {
        for(User u : myList){
            if(u.getUserId() == userId){
                myList.remove(u);
            }
        }
        return myList;
    }
}
