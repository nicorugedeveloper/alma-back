package com.alma.alma.controller.ClaseControllers;

import com.alma.alma.entity.Clase;
import com.alma.alma.service.ClaseInterface.ClaseAllService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/claseall")
@AllArgsConstructor
public class ClaseAllController {

    private final ClaseAllService claseService;

    @GetMapping
    public ResponseEntity<List<Clase>> getAllClases() {
        return new ResponseEntity<>( claseService.findAll(), HttpStatus.OK);
    }

}
