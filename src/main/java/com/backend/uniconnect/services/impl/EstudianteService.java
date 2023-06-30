package com.backend.uniconnect.services.impl;


import com.backend.uniconnect.persistence.entities.Estudiante;
import com.backend.uniconnect.persistence.repositories.EstudianteRepository;
import com.backend.uniconnect.services.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EstudianteService implements CrudService <Estudiante,Long> {

    private final EstudianteRepository estudianteRepository;

    @Autowired
    public EstudianteService(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    @Override
    public Optional<Estudiante> getEntity(Long id) {
        return estudianteRepository.findById(id);
    }
}
