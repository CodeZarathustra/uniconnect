package com.backend.uniconnect.persistence.repositories;

import com.backend.uniconnect.persistence.entities.Estudiante;
import org.springframework.data.repository.CrudRepository;

public interface EstudianteRepository extends CrudRepository<Estudiante, Long> {
}
