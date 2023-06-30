package com.backend.uniconnect.persistence.entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "estudiantes")
@Data
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "estudiante_id")
    private Long estudianteId;

    private String nombre;

    private Long edad;

    @Column(name = "cancion_preferida")
    private String cancionPreferida;

    @Column(name = "comida_preferida")
    private String comidaPreferida;

    @Column(name = "pelicula_preferida")
    private String peliculaPreferida;
}