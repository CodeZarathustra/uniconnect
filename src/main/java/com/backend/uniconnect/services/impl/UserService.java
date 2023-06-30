package com.backend.uniconnect.services.impl;

import com.backend.uniconnect.persistence.entities.User;
import com.backend.uniconnect.persistence.repositories.UserRepository;
import com.backend.uniconnect.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements LoginService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean authenticateUser(User user) {
        Optional<User> optionalUser = userRepository.findByUsuario(user.getUsuario());
        return optionalUser.map(user1 -> user1.getPassword().
                        equals(user.getPassword())).
                orElse(false);
    }
}
