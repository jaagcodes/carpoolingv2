package com.pragma.carpooling.infrastructure.out.jpa.repository;

import com.pragma.carpooling.infrastructure.out.jpa.entity.RutaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface IRutaRepository extends JpaRepository<RutaEntity, Long> {

}
