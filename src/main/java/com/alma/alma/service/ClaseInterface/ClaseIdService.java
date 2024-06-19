package com.alma.alma.service.ClaseInterface;

import com.alma.alma.entity.Clase;

import java.util.Optional;

public interface ClaseIdService {
    Optional<Clase> findById(Integer id);
}
