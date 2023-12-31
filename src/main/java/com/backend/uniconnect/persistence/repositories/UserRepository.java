package com.backend.uniconnect.persistence.repositories;


import com.backend.uniconnect.persistence.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {

    Optional<User> findByUsuario(String usuario);
}
