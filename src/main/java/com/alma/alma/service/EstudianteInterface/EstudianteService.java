package com.alma.alma.service.EstudianteInterface;

import com.alma.alma.entity.Estudiante;

import java.util.List;
import java.util.Optional;

public interface EstudianteService {
    Estudiante save(Estudiante estudiante);
    List<Estudiante> findAll();
    Optional<Estudiante> findById(Integer id);
    Estudiante update(Integer id, Estudiante estudiante);
    void deleteById(Integer id);
}
