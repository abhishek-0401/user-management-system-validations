package com.geekster.usermanagementsystem.service;

import com.geekster.usermanagementsystem.model.User;
import com.geekster.usermanagementsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private static List<User> users = new ArrayList<>();

    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers(){

        return userRepository.findAll();
    }
    public User getUser(@RequestParam int userId){
        return userRepository.findById(userId).get();
    }
    public void addUser(@RequestBody User user){
        userRepository.save(user);
    }
    public void updateUser(int userId, User newUser){
        User user = userRepository.findById(userId).get();
        user.setUserId(newUser.getUserId());
        user.setUserName(newUser.getUserName());
        user.setDob(newUser.getDob());
        user.setPhoneNumber(newUser.getPhoneNumber());
        user.setTime(newUser.getTime());
        user.setDate(newUser.getDate());
        user.setEmail(newUser.getEmail());
        userRepository.save(user);
    }
    public void deleteUser(@RequestParam int userId){
        userRepository.deleteById(userId);
    }
}
