package com.alma.alma.service.imp;

import com.alma.alma.entity.Profesor;
import com.alma.alma.repository.ProfesorRepository;
import com.alma.alma.service.ProfesorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProfesorServiceImp implements ProfesorService {
    private final ProfesorRepository profesorRepository;
    @Override
    public Profesor save(Profesor profesor) {
        return profesorRepository.save(profesor);
    }
    @Override
    public List<Profesor> findAll() {
        return profesorRepository.findAll();
    }
    @Override
    public Optional<Profesor> findById(Integer id) {
        return profesorRepository.findById(id);
    }
    @Override
    public Profesor update(Integer id, Profesor profesor) {
        Optional<Profesor> existingProfesor = profesorRepository.findById(id);
        if (existingProfesor.isPresent()) {
            Profesor updatedProfesor = existingProfesor.get();
            updatedProfesor.setNombre_profesor(profesor.getNombre_profesor());
            return profesorRepository.save(updatedProfesor);
        }
        return null;
    }
    @Override
    public void deleteById(Integer id) {
        profesorRepository.deleteById(id);
    }
}
