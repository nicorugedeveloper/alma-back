package com.alma.alma.controller;

import com.alma.alma.entity.Clase;
import com.alma.alma.service.ClaseService;
import com.alma.alma.service.imp.ClaseServiceImp;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/clases")
@AllArgsConstructor
public class ClaseController {

    private final ClaseService claseService;

    @PostMapping
    public ResponseEntity<Clase> createClase(@RequestBody Clase clase) {
        Clase createdClase = claseService.save(clase);
        return new ResponseEntity<>(createdClase, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Clase>> getAllClases() {
        return new ResponseEntity<>( claseService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Clase> getClaseById(@PathVariable Integer id) {
        Optional<Clase> clase = claseService.findById(id);
        return clase.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Clase> updateClase(@PathVariable Integer id, @RequestBody Clase clase) {
        Clase updatedClase = claseService.update(id, clase);
        if (updatedClase != null) {
            return new ResponseEntity<>(updatedClase, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClase(@PathVariable Integer id) {
        claseService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

