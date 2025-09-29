package com.journal_backend.journal_backend.controller;

import java.util.List;
import java.util.Optional;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.journal_backend.journal_backend.models.User;
import com.journal_backend.journal_backend.service.UserService;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    
    private final UserService userservice;

    UserController(UserService userservice) {
        this.userservice = userservice;
    }

     @GetMapping("/getAll")
    public List<User> getAllUsers() {
        return userservice.getAllUsers();
    }

    @GetMapping("/getById")
    public Optional<User> getUserById(@RequestParam String id) {
        return userservice.getUserById(id);
    }
    
    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        return userservice.createUser(user);
    }

    @DeleteMapping("/delete")
    public String deleteUserById (@RequestParam String id) {
        return userservice.deleteUserById(id);
    }


}
