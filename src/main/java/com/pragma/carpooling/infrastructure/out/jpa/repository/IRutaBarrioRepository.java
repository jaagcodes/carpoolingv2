package com.pragma.carpooling.infrastructure.out.jpa.repository;

import com.pragma.carpooling.infrastructure.out.jpa.entity.RutaBarrioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface IRutaBarrioRepository extends JpaRepository<RutaBarrioEntity, Long> {
    @Modifying
    @Transactional
    @Query(value="INSERT INTO ruta_barrio(id_ruta, id_barrio) VALUES(:idRuta, :idBarrio)", nativeQuery = true )
    Integer register(@Param("idRuta")Long idRuta, @Param("idBarrio") Long idBarrio);
}
