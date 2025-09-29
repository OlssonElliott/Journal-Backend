package com.journal_backend.journal_backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.journal_backend.journal_backend.models.User;
import com.journal_backend.journal_backend.repositories.UserRepository;

@Service
public class UserService {
    
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(String id) {
    return userRepository.findById(id);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public String deleteUserById(String id) {
    return userRepository.findById(id).map(user -> {
            userRepository.delete(user);
            return "User with id " + id + " deleted successfully.";
        }).orElse("User with id " + id + " not found.");
    }

}
