package com.pragma.carpooling.infrastructure.out.jpa.repository;

import com.pragma.carpooling.infrastructure.out.jpa.entity.RutaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRutaRepository extends JpaRepository<RutaEntity, Long> {
}
