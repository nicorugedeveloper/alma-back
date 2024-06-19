package com.alma.alma.service.imp.ClasesImp;

import com.alma.alma.entity.Clase;
import com.alma.alma.repository.ClaseRepository;
import com.alma.alma.service.ClaseInterface.ClaseUpdateService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ClaseUpdateServiceImp implements ClaseUpdateService {

    private final ClaseRepository claseRepository;

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

}
