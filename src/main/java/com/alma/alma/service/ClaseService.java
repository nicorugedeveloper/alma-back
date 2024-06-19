package com.alma.alma.service;

import com.alma.alma.entity.Clase;
import com.alma.alma.repository.ClaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClaseService {

    @Autowired
    private ClaseRepository claseRepository;

    public Clase save(Clase clase) {
        return claseRepository.save(clase);
    }

    public List<Clase> findAll() {
        return claseRepository.findAll();
    }

    public Optional<Clase> findById(Integer id) {
        return claseRepository.findById(id);
    }

    public Clase update(Integer id, Clase clase) {
        Optional<Clase> existingClase = claseRepository.findById(id);
        if (existingClase.isPresent()) {
            Clase updatedClase = existingClase.get();
            updatedClase.setNombre_clase(clase.getNombre_clase());
            return claseRepository.save(updatedClase);
        }
        return null;
    }

    public void deleteById(Integer id) {
        claseRepository.deleteById(id);
    }
}
