package com.example.BackEndConnection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    // Autowired creates object of the class of interface
    @Autowired
    UserRepository userRepository;
    public String createUser(User user){
        userRepository.save(user);
        return "User has been added.";
    }
    public User getUser(int id){
        return userRepository.findById(id).get();
    }
}
