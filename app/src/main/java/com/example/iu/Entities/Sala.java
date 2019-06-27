package com.example.iu.Entities;

import java.io.Serializable;

public class Sala implements Serializable {
    private String nombre;
    private String facultad;
    private int capacidad;
    private String horario;

    public Sala(String nombre, String facultad, int capacidad, String horario){
        this.nombre=nombre;
        this.facultad=facultad;
        this.capacidad=capacidad;
        this.horario=horario;
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

    public String getHorario() {
        return horario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }

    public void setHorario(String horario) { this.horario = horario; }

}
