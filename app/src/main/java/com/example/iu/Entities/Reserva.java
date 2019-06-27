package com.example.iu.Entities;

import java.io.Serializable;

public class Reserva implements Serializable {
    private int id;
    private String docente;
    private String sala;
    private String ramo;
    private String motivo;
    private int horario;
    private String estado;

    public Reserva(int id, String docente, String sala, String ramo, String motivo, int horario, String estado){
        this.id=id;
        this.docente=docente;
        this.sala=sala;
        this.ramo=ramo;
        this.motivo=motivo;
        this.horario=horario;
        this.estado=estado;
    }

    public int getId() {
        return id;
    }

    public String getDocente() { return docente; }

    public String getSala() {
        return sala;
    }

    public String getRamo() {
        return ramo;
    }

    public String getMotivo() {
        return motivo;
    }

    public int getHorario() {
        return horario;
    }

    public String getEstado() {
        return estado;
    }

    public void setId(int id) { this.id=id; }

    public void setDocente(String docente) { this.docente=docente; }

    public void setSala(String sala) { this.sala=sala; }

    public void setRamo(String ramo) { this.ramo=ramo; }

    public void setMotivo(String motivo) { this.motivo=motivo; }

    public void setHorario(int horario) { this.horario=horario; }

    public void setEstado(String estado) { this.estado=estado; }

}
