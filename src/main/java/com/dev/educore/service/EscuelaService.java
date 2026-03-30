    package com.dev.educore.service;

    import com.dev.educore.model.Escuela;
    import com.dev.educore.repository.EscuelaRepository;
    import jakarta.transaction.Transactional;
    import lombok.AllArgsConstructor;
    import org.springframework.stereotype.Service;

    import java.time.LocalDate;

    @Service
    @AllArgsConstructor
    public class EscuelaService {

        private final EscuelaRepository repository;

        @Transactional
        public Escuela registrar(Escuela escuela){

            if(escuela == null){
                 throw new IllegalArgumentException("Datos nulos");
            }
            Escuela escuelaSave = new Escuela();

            escuelaSave.setEstudiantes(escuela.getEstudiantes());
            escuelaSave.setProfesores(escuela.getProfesores());
            escuelaSave.setCurso(escuela.getCurso());
            escuelaSave.setActivo(escuela.isActivo());
            escuelaSave.setFechaCreacion(LocalDate.now());
            escuelaSave.setModalidad(escuela.getModalidad());
            escuelaSave.setNivel(escuela.getNivel());

            return repository.save(escuela);
        }

    }
