package com.dev.educore.controller;

import com.dev.educore.model.Escuela;
import com.dev.educore.service.EscuelaService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/escuelas")
@AllArgsConstructor
public class EscuelaController {

    private final EscuelaService service;

    @GetMapping
    public ResponseEntity<List<Escuela>> ObtenerEscuelas(){
        return ResponseEntity.ok(service.listarEscuelas());
    }


}
