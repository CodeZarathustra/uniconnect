package com.backend.uniconnect.services.impl;

import com.backend.uniconnect.persistence.entities.User;
import com.backend.uniconnect.persistence.entities.dto.LoginResponseDto;
import com.backend.uniconnect.persistence.repositories.UserRepository;
import com.backend.uniconnect.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginServiceImpl implements LoginService {

    private final UserRepository userRepository;

    @Autowired
    public LoginServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public LoginResponseDto authenticateUser(User user) {
        Optional<User> optionalUser = userRepository.findByUsuario(user.getUsuario());
       boolean result=optionalUser.map(user1 -> user1.getPassword().
                        equals(user.getPassword())).
                orElse(false);
        return LoginResponseDto.builder().validUser(result).build();
    }
}
