package com.backend.uniconnect.persistence.entities.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LoginResponseDto {

    private boolean validUser;
}
