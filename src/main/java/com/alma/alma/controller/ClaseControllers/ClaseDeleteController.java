package com.alma.alma.controller.ClaseControllers;

import com.alma.alma.service.ClaseInterface.ClaseDeleteService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clasedelete")
@AllArgsConstructor
public class ClaseDeleteController {

    private final ClaseDeleteService claseService;

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClase(@PathVariable Integer id) {
        claseService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

