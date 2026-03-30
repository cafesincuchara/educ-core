package com.dev.educore.controller;

import com.dev.educore.model.Escuela;
import com.dev.educore.service.EscuelaService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/escuelas")
@AllArgsConstructor
public class EscuelaController {

    private final EscuelaService service;

    @GetMapping
    public ResponseEntity<List<Escuela>> ObtenerEscuelas(){
        return ResponseEntity.ok(service.listarEscuelas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Escuela> buscarEscuelaPorId(@PathVariable UUID id){
        return ResponseEntity.ok(service.encontrarPorIdEscuela(id));
    }

    @PutMapping
    public ResponseEntity<Escuela> registrarEscuela(@RequestBody Escuela escuela){
        return ResponseEntity.ok(service.registrar(escuela));
    }

}
