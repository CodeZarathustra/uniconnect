package com.backend.uniconnect.controllers;


import com.backend.uniconnect.persistence.entities.Estudiante;
import com.backend.uniconnect.persistence.entities.Evento;
import com.backend.uniconnect.persistence.entities.Profesor;
import com.backend.uniconnect.services.impl.EstudianteService;
import com.backend.uniconnect.services.impl.EventoService;
import com.backend.uniconnect.services.impl.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModelController {


    private final EstudianteService estudianteService;
    private final ProfesorService profesorService;

    private final EventoService eventoService;

    @Autowired
    public ModelController(EstudianteService estudianteService,
                           ProfesorService profesorService, EventoService eventoService) {
        this.estudianteService = estudianteService;
        this.profesorService = profesorService;
        this.eventoService = eventoService;
    }


    @GetMapping("/student/{id}")
    public ResponseEntity<Estudiante> getStudent(@PathVariable("id") Long id){

        return  ResponseEntity.of(estudianteService.getEntity(id));
    }

    @GetMapping("/teacher/{id}")
    public ResponseEntity<Profesor> getTeacher(@PathVariable("id") Long id){

        return  ResponseEntity.of(profesorService.getEntity(id));
    }

    @GetMapping("/event/{id}")
    public ResponseEntity<Evento> getEvent(@PathVariable("id") Long id){

        return  ResponseEntity.of(eventoService.getEntity(id));
    }
}
