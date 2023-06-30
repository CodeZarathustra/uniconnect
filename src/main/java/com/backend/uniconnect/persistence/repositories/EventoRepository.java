package com.backend.uniconnect.persistence.repositories;


import com.backend.uniconnect.persistence.entities.Evento;
import org.springframework.data.repository.CrudRepository;

public interface EventoRepository extends CrudRepository<Evento, Long> {
}
