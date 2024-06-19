package com.alma.alma.service;

import com.alma.alma.entity.Profesor;
import com.alma.alma.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfesorService {

    @Autowired
    private ProfesorRepository profesorRepository;

    public Profesor save(Profesor profesor) {
        return profesorRepository.save(profesor);
    }

    public List<Profesor> findAll() {
        return profesorRepository.findAll();
    }

    public Optional<Profesor> findById(Integer id) {
        return profesorRepository.findById(id);
    }

    public Profesor update(Integer id, Profesor profesor) {
        Optional<Profesor> existingProfesor = profesorRepository.findById(id);
        if (existingProfesor.isPresent()) {
            Profesor updatedProfesor = existingProfesor.get();
            updatedProfesor.setNombre_profesor(profesor.getNombre_profesor());
            return profesorRepository.save(updatedProfesor);
        }
        return null;
    }

    public void deleteById(Integer id) {
        profesorRepository.deleteById(id);
    }
}
