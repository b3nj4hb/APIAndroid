package com.example.api_android.model;

public class Escuela {
    private int idescuela;
    private String nombre;

    public Escuela() {
    }

    public Escuela(int idescuela, String nombre) {
        this.idescuela = idescuela;
        this.nombre = nombre;
    }

    public int getIdescuela() {
        return idescuela;
    }

    public void setIdescuela(int idescuela) {
        this.idescuela = idescuela;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}