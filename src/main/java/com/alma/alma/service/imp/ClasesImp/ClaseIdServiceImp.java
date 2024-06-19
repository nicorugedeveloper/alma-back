package com.alma.alma.service.imp.ClasesImp;

import com.alma.alma.entity.Clase;
import com.alma.alma.repository.ClaseRepository;
import com.alma.alma.service.ClaseInterface.ClaseIdService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ClaseIdServiceImp implements ClaseIdService {

    private final ClaseRepository claseRepository;
    @Override
    public Optional<Clase> findById(Integer id) {

        return claseRepository.findById(id);
    }
}
