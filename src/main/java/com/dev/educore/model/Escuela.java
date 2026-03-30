package com.dev.educore.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
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

    @NotBlank(message = "La lista de estudiantes no puede estar vacía")
    @Size(min = 3, message = "Debe ingresar al menos un nombre válido")
    private String estudiantes;

    @NotBlank(message = "El nombre del profesor es obligatorio")
    private String profesores;

    @NotBlank(message = "El nombre del curso es obligatorio")
    private String curso;

    @NotNull(message = "El estado activo/inactivo es obligatorio")
    private boolean activo;

    private LocalDate fechaCreacion;

    @NotBlank(message = "La modalidad (Presencial/Online) es obligatoria")
    private String modalidad;

    @NotBlank(message = "El nivel del curso es obligatorio")
    private String nivel;
}