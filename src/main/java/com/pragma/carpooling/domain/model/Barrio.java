package com.pragma.carpooling.domain.model;

public class Barrio {

    private Long idBarrio;
    private String nombre;
    private String descripcion;

    public Barrio(Long idBarrio, String nombre, String descripcion) {
        this.idBarrio = idBarrio;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Long getIdBarrio() {
        return idBarrio;
    }

    public void setIdBarrio(Long idBarrio) {
        this.idBarrio = idBarrio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
