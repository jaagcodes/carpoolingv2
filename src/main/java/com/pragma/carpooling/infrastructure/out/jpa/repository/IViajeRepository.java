package com.pragma.carpooling.infrastructure.out.jpa.repository;

import com.pragma.carpooling.infrastructure.out.jpa.entity.ViajeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.time.LocalDateTime;

@Repository
public interface IViajeRepository extends JpaRepository<ViajeEntity, Long> {

    @Modifying
    @Transactional
    @Query(value="INSERT INTO viaje(id_ruta, horario) VALUES(:idRuta, :horario)", nativeQuery = true )
    Integer registrarConRuta(@Param("idRuta")Long idRuta, @Param("horario") LocalDateTime horario);
}
