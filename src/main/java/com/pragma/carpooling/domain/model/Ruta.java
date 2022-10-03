package com.pragma.carpooling.domain.model;

public class Ruta {

    private Long idRuta;
    private Long idUsuario;
    private String descripcion;
    private Integer cupos;

    public Ruta(Long idRuta, Long idUsuario, String descripcion, Integer cupos) {
        this.idRuta = idRuta;
        this.idUsuario = idUsuario;
        this.descripcion = descripcion;
        this.cupos = cupos;
    }

    public Long getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(Long idRuta) {
        this.idRuta = idRuta;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
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
}
