package com.backend.uniconnect.controllers;

import com.backend.uniconnect.persistence.entities.User;
import com.backend.uniconnect.persistence.entities.dto.LoginResponseDto;
import com.backend.uniconnect.services.impl.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class LoginController {


    private final LoginServiceImpl loginServiceImpl;

    @Autowired
    public LoginController(LoginServiceImpl loginServiceImpl) {
        this.loginServiceImpl = loginServiceImpl;
    }

    @PostMapping("login/user")
    public ResponseEntity<LoginResponseDto> authenticateUser(@RequestBody User user){

        return ResponseEntity.ok(loginServiceImpl.authenticateUser(user));
    }
}
