package com.alma.alma.controller.ClaseControllers;

import com.alma.alma.entity.Clase;
import com.alma.alma.service.ClaseInterface.ClaseUpdateService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/claseupdate")
@AllArgsConstructor
public class ClaseUpdateController {

    private final ClaseUpdateService claseService;

    @PutMapping("/{id}")
    public ResponseEntity<Clase> updateClase(@PathVariable Integer id, @RequestBody Clase clase) {
        Clase updatedClase = claseService.update(id, clase);
        if (updatedClase != null) {
            return new ResponseEntity<>(updatedClase, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
