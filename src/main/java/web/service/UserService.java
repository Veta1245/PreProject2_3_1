package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers ();
    User getUserById(long id);

    void removeUser(long id);
    void updateUser( User user);
}
