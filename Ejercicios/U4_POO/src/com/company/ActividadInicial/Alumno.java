package com.company.ActividadInicial;

public class Alumno {
    private String nombre;
    private String apellido;
    private String direccion;
    private String centro = "IES Alixar";


// GETTERS AND SETTERS********************************************************************
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    // CONSTRUCTORES **************************************************************************************

    public Alumno(String nombre, String apellido, String direccion, String centro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.centro = centro;
    }

    public Alumno(String nombre, String apellido, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    public Alumno(String nombre, String centro) {
        this.nombre = nombre;
        this.centro = centro;
    }

    // PARA IMPRIMIR POR PANTALLA COMO YO QUIERO **********************************************************

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", centro='" + centro + '\'' +
                '}';
    }
}
