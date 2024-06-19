package com.alma.alma.controller.ClaseControllers;

import com.alma.alma.entity.Clase;
import com.alma.alma.service.ClaseInterface.ClaseIdService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/claseid")
@AllArgsConstructor
public class ClaseIdController {

    private final ClaseIdService claseService;

    @GetMapping("/{id}")
    public ResponseEntity<Clase> getClaseById(@PathVariable Integer id) {
        Optional<Clase> clase = claseService.findById(id);
        return clase.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
