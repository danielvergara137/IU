package com.example.iu.Entities;

import android.graphics.Bitmap;

import java.io.Serializable;

public class Usuario implements Serializable {
    private String username;
    private String nombre;
    private String password;
    private String tipo;

    public Usuario(String username, String nombre, String password, String tipo){
        this.username=username;
        this.nombre=nombre;
        this.password=password;
        this.tipo=tipo;
    }

    public String getUsername(){
        return username;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }

    public String getTipo() { return tipo; }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /* public void setFoto(Bitmap foto) {
        this.foto = foto;
    }*/

}
