package com.alma.alma.service.imp;

import com.alma.alma.entity.Clase;
import com.alma.alma.repository.ClaseRepository;
import com.alma.alma.service.ClaseService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ClaseServiceImp implements ClaseService {
    private final ClaseRepository claseRepository;
    @Override
    public Clase save(Clase clase) {
        return claseRepository.save(clase);
    }
    @Override
    public List<Clase> findAll() {
        return claseRepository.findAll();
    }
    @Override
    public Optional<Clase> findById(Integer id) {
        return claseRepository.findById(id);
    }
    @Override
    public Clase update(Integer id, Clase clase) {
        Optional<Clase> existingClase = claseRepository.findById(id);
        if (existingClase.isPresent()) {
            Clase updatedClase = existingClase.get();
            updatedClase.setNombre_clase(clase.getNombre_clase());
            return claseRepository.save(updatedClase);
        }
        return null;
    }
    @Override
    public void deleteById(Integer id) {
        claseRepository.deleteById(id);
    }
}
