package com.example.users.Service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.users.Entity.User;
import com.example.users.Repository.IUserRepository;

@Service
public class UserServiceImpl implements IUserService{
    @Autowired
    IUserRepository userRepository;

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUserById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public String deleteUser(int id) {
        try {
            userRepository.deleteById(id);
            return "usuario eliminado";
        } catch (Exception e) {
            return "usuario no eliminado";
        }
    }
}
