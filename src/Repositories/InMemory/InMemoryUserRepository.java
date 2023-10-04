
package Repositories.InMemory;

import Entities.User;
import Repositories.UserRepository;
import java.util.ArrayList;

public class InMemoryUserRepository implements UserRepository{
    
    private static ArrayList<User> users = new ArrayList<>();

    public User createUser(User user){
         users.add(user);
         return user;
        }
    
    
    @Override
    public User findByEmail(String  email){
       for(User user : this.users){
            if(user.getEmail().equals(email)){
                return user;
            }
       }
       return null;
    }

}
