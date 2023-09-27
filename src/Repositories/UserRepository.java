 package Repositories;

import Entities.User;

public interface UserRepository {
    public User createUser(User user);
    public User findByEmail(String email);
}
