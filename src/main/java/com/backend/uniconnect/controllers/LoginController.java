package com.backend.uniconnect.controllers;

import com.backend.uniconnect.persistence.entities.User;
import com.backend.uniconnect.services.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {


    private final UserService userService;

    @Autowired
    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login/user")
    public boolean authenticateUser(@RequestBody User user){

        return userService.authenticateUser(user);
    }
}
