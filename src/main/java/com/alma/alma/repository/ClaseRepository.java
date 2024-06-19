package com.alma.alma.repository;

import com.alma.alma.entity.Clase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaseRepository extends JpaRepository <Clase, Integer> {
}

