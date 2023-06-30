package com.backend.uniconnect.services.impl;

import com.backend.uniconnect.persistence.entities.Evento;
import com.backend.uniconnect.persistence.repositories.EventoRepository;
import com.backend.uniconnect.services.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EventoService implements CrudService<Evento,Long> {

    private final EventoRepository eventoRepository;

    @Autowired
    public EventoService(EventoRepository eventoRepository) {
        this.eventoRepository = eventoRepository;
    }

    @Override
    public Optional<Evento> getEntity(Long id) {
        return eventoRepository.findById(id);
    }
}
