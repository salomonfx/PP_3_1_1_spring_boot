package org.example.PP_3_1_1_spring_boot.service;


import org.example.PP_3_1_1_spring_boot.model.User;

import java.util.List;

public interface UserService {
    void updateUser(Long id, User user);

    List<User> allUsers();

    void save(User user);

    void deleteUserById(Long id);

    User getUserById(Long id);
}