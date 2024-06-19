package com.alma.alma.service;

import com.alma.alma.entity.Clase;

import java.util.List;
import java.util.Optional;

public interface ClaseService {
    Clase save(Clase clase);
    List<Clase> findAll();
    Optional<Clase> findById(Integer id);
    Clase update(Integer id, Clase clase);
    void deleteById(Integer id);
}
