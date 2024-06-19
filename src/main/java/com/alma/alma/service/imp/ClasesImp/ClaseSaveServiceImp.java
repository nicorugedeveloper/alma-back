package com.alma.alma.service.imp.ClasesImp;

import com.alma.alma.entity.Clase;
import com.alma.alma.repository.ClaseRepository;
import com.alma.alma.service.ClaseInterface.ClaseSaveService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClaseSaveServiceImp implements ClaseSaveService {
    private final ClaseRepository claseRepository;

    @Override
    public Clase save(Clase clase) {

        return claseRepository.save(clase);
    }

}
