package com.dev.educore.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;


@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "escuelas")
public class Escuela {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String estudiantes;
    private String profesores;
    private String curso;
    private boolean activo;
    private LocalDate fechaCreacion;
    private String modalidad;
    private String nivel; //curso

}
