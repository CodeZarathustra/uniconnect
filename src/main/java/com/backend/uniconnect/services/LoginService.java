package com.backend.uniconnect.services;

import com.backend.uniconnect.persistence.entities.User;
import com.backend.uniconnect.persistence.entities.dto.LoginResponseDto;

public interface LoginService {

    LoginResponseDto authenticateUser(User user);
}
