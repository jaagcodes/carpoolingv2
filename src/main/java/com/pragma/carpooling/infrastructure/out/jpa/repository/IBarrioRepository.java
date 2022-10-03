package com.pragma.carpooling.infrastructure.out.jpa.repository;

import com.pragma.carpooling.infrastructure.out.jpa.entity.BarrioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBarrioRepository extends JpaRepository<BarrioEntity, Long> {
}
