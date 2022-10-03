package com.pragma.carpooling.domain.model;

public class Ruta {

    private Long idRuta;
    private String descripcion;
    private Integer cupos;
    private Long idConductor;

    public Ruta(Long idRuta, String descripcion, Integer cupos, Long idConductor) {
        this.idRuta = idRuta;
        this.descripcion = descripcion;
        this.cupos = cupos;
        this.idConductor = idConductor;
    }

    public Long getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(Long idRuta) {
        this.idRuta = idRuta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCupos() {
        return cupos;
    }

    public void setCupos(Integer cupos) {
        this.cupos = cupos;
    }

    public Long getIdConductor() {
        return idConductor;
    }

    public void setIdConductor(Long idConductor) {
        this.idConductor = idConductor;
    }
}
