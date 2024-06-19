package com.alma.alma.controller.ClaseControllers;

import com.alma.alma.entity.Clase;
import com.alma.alma.service.ClaseInterface.ClaseSaveService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/clasesave")
@AllArgsConstructor
public class ClaseSaveController {
    private final ClaseSaveService claseService;

    @PostMapping
    public ResponseEntity<Clase> createClase(@Valid @RequestBody Clase clase) {
        Clase createdClase = claseService.save(clase);
        return new ResponseEntity<>(createdClase, HttpStatus.CREATED);
    }
}
