package com.example.users.Service;

import java.util.*;

import com.example.users.Entity.User;

public interface IUserService {
    List<User> getUsers();
    Optional<User> getUserById(int id);
    User saveUser(User user);
    String deleteUser(int id);
}
