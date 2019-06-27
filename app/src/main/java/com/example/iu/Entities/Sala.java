package com.example.iu.Entities;

import java.io.Serializable;

public class Sala implements Serializable {
    private String nombre;
    private String facultad;
    private int capacidad;

    public Sala(String nombre, String facultad, int capacidad){
        this.nombre=nombre;
        this.facultad=facultad;
        this.capacidad=capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFacultad() {
        return facultad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }
}
