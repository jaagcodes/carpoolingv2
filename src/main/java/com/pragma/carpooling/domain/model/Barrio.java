package com.pragma.carpooling.domain.model;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Barrio barrio = (Barrio) o;
        return Objects.equals(idBarrio, barrio.idBarrio) && Objects.equals(nombre, barrio.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idBarrio, nombre);
    }
}
