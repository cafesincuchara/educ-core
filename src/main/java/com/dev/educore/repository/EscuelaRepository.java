package com.dev.educore.repository;

import com.dev.educore.model.Escuela;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EscuelaRepository extends JpaRepository<Escuela, UUID> {

}
