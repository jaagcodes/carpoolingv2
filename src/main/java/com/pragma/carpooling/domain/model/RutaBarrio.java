package com.pragma.carpooling.domain.model;


public class RutaBarrio {

    private Long id;
    private Long idRuta;
    private Long idBarrio;
    private String puntoEncuentro;
    private Integer posicion;

    public RutaBarrio( Long idRuta, Long idBarrio, String puntoEncuentro, Integer posicion) {
        this.idRuta = idRuta;
        this.idBarrio = idBarrio;
        this.puntoEncuentro = puntoEncuentro;
        this.posicion = posicion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(Long idRuta) {
        this.idRuta = idRuta;
    }

    public Long getIdBarrio() {
        return idBarrio;
    }

    public void setIdBarrio(Long idBarrio) {
        this.idBarrio = idBarrio;
    }

    public String getPuntoEncuentro() {
        return puntoEncuentro;
    }

    public void setPuntoEncuentro(String puntoEncuentro) {
        this.puntoEncuentro = puntoEncuentro;
    }

    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }
}
