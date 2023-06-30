package com.backend.uniconnect.persistence.entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "profesores")
@Data
public class Profesor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "profesor_id")
    private Long id;

    private String nombre;

    private String area;

    private String facultad;

    private String hobbie;
}
