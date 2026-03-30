    package com.dev.educore.service;

    import com.dev.educore.model.Escuela;
    import com.dev.educore.repository.EscuelaRepository;
    import jakarta.transaction.Transactional;
    import lombok.AllArgsConstructor;
    import org.hibernate.annotations.NotFound;
    import org.springframework.stereotype.Service;

    import java.time.LocalDate;
    import java.util.List;
    import java.util.UUID;

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

        @Transactional
        public List<Escuela> listarEscuelas(){
            return repository.findAll();
        }

        @Transactional
        public Escuela encontrarPorIdEscuela(UUID id){
            return  repository.findById(id).orElseThrow(()-> new RuntimeException("ID no valido"));
        }

        @Transactional
        public Escuela modificarEscuelaPorId(UUID id, Escuela escuelaNuevosDatos) {

            Escuela escuelaExistente = repository.findById(id)
                    .orElseThrow(() -> new RuntimeException("ID no encontrado"));

            escuelaExistente.setCurso(escuelaNuevosDatos.getCurso());
            escuelaExistente.setEstudiantes(escuelaNuevosDatos.getEstudiantes());
            escuelaExistente.setProfesores(escuelaNuevosDatos.getProfesores());
            escuelaExistente.setModalidad(escuelaNuevosDatos.getModalidad());
            escuelaExistente.setNivel(escuelaNuevosDatos.getNivel());
            escuelaExistente.setActivo(escuelaNuevosDatos.isActivo());

            return repository.save(escuelaExistente);
        }

    }
