package com.alma.alma.service.imp.ClasesImp;

import com.alma.alma.entity.Clase;
import com.alma.alma.repository.ClaseRepository;
import com.alma.alma.service.ClaseInterface.ClaseAllService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ClaseAllServiceImp implements ClaseAllService {

    private final ClaseRepository claseRepository;

    @Override
    public List<Clase> findAll() {
        return claseRepository.findAll();
    }
}
