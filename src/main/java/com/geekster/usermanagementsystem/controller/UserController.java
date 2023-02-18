package com.geekster.usermanagementsystem.controller;

import com.geekster.usermanagementsystem.model.User;
import com.geekster.usermanagementsystem.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    public UserService userService;

//  http://localhost:8080/api/getAllUser
    @GetMapping("/getAllUser")
    public List<User> getAllUsers(){

        return userService.getAllUsers();
    }

//  http://localhost:8080/api/getUser/
    @GetMapping("/getUser/{userId}")
    public User getUser(@RequestParam int userId){
        return userService.getUser(userId);
    }
//  http://localhost:8080/api/addUser
    @PostMapping("/addUser")
    public ResponseEntity<String> addUser(@Valid @RequestBody User user) {
        userService.addUser(user);
        return ResponseEntity.ok("User is valid");
    }
//  http://localhost:8080/api/updateUserInfo
    @PutMapping("/updateUserInfo/userId/{userId}")
    public ResponseEntity<String> updateUser(@Valid @RequestBody User newUser,@PathVariable int userId){
        userService.updateUser(userId,newUser);
        return ResponseEntity.ok("User is updated");
    }
//  http://localhost:8080/api/deleteUser
    @DeleteMapping("/deleteUser")
    public void deleteUser(@RequestParam int userId){
        userService.deleteUser(userId);
    }
}
