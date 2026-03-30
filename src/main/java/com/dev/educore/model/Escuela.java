package com.dev.educore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;


@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "escuelas")
public class Escuela {

    @Id
    private UUID id;
    private String estudiantes;
    private String profesores;
    private String curso;
    private boolean activo;
    private LocalDate fechaCreacion;
    private String modalidad;
    private String nivel; //curso

}
