package com.backend.uniconnect.persistence.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Table(name = "eventos")
@Data
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "evento_id")
    private Long id;

    private String nombre;

    private String sede;

    private Date fecha;

    private String facultad;

    private String tema;

    private String tipo;
}


