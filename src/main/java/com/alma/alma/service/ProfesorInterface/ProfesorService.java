package com.alma.alma.service.ProfesorInterface;

import com.alma.alma.entity.Profesor;

import java.util.List;
import java.util.Optional;

public interface ProfesorService {
    Profesor save(Profesor profesor);
    List<Profesor> findAll();
    Optional<Profesor> findById(Integer id);
    Profesor update(Integer id, Profesor profesor);
    void deleteById(Integer id);
}
