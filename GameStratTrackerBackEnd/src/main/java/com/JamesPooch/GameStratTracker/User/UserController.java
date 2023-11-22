package com.JamesPooch.GameStratTracker.User;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import jakarta.validation.Valid;

@RestController
public class UserController {
    private UserRepository repository;

    UserController(UserRepository repository){
        this.repository = repository;
    }
    

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return(repository.findAll());
    }

    @PostMapping("/user")
    public void createUser(@Valid @RequestBody User user){
        repository.save(user);
    }

}
