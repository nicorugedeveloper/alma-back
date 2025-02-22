package com.alma.alma.controller.EstudianteControllers;

import com.alma.alma.entity.Estudiante;
import com.alma.alma.service.EstudianteInterface.EstudianteService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/estudiantes")
@AllArgsConstructor
public class EstudianteController {

    private final EstudianteService estudianteService;

    @PostMapping
    public ResponseEntity<Estudiante> createEstudiante(@RequestBody Estudiante estudiante) {
        return new ResponseEntity<>(estudianteService.save(estudiante), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Estudiante>> getAllEstudiantes() {
        return new ResponseEntity<>(estudianteService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estudiante> getEstudianteById(@PathVariable Integer id) {
        Optional<Estudiante> estudiante = estudianteService.findById(id);
        return estudiante.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Estudiante> updateEstudiante(@PathVariable Integer id, @RequestBody Estudiante estudiante) {
        Estudiante updatedEstudiante = estudianteService.update(id, estudiante);
        if (updatedEstudiante != null) {
            return new ResponseEntity<>(updatedEstudiante, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEstudiante(@PathVariable Integer id) {
        estudianteService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

