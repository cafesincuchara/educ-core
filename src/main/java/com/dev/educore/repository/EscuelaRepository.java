package com.dev.educore.repository;

import com.dev.educore.model.Escuela;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EscuelaRepository extends JpaRepository<Escuela, UUID> {
}
