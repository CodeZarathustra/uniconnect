package com.backend.uniconnect.services.impl;

import com.backend.uniconnect.persistence.entities.Profesor;
import com.backend.uniconnect.persistence.repositories.ProfesorRepository;
import com.backend.uniconnect.services.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProfesorService implements CrudService<Profesor,Long> {

    private final ProfesorRepository profesorRepository;

    @Autowired
    public ProfesorService(ProfesorRepository profesorRepository) {
        this.profesorRepository = profesorRepository;
    }

    @Override
    public Optional<Profesor> getEntity(Long id) {
        return profesorRepository.findById(id);
    }
}
