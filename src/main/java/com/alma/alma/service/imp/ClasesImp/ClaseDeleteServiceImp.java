package com.alma.alma.service.imp.ClasesImp;

import com.alma.alma.repository.ClaseRepository;
import com.alma.alma.service.ClaseInterface.ClaseDeleteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClaseDeleteServiceImp implements ClaseDeleteService {
    private final ClaseRepository claseRepository;
    @Override
    public void deleteById(Integer id) {
        claseRepository.deleteById(id);
    }
}
