package com.backend.uniconnect.services;

import com.backend.uniconnect.persistence.entities.User;

public interface LoginService {

    boolean authenticateUser(User user);
}
