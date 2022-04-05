package com.company;

import java.io.Serializable;

public class Alumno implements Serializable, Comparable<Alumno> {
    private String nombre;
    private String apellidos;
    private String direccion;
    private String dni;
    private String email;
    private String curso;
    private String dual;

    public Alumno(String nombre, String apellidos, String direccion, String dni, String email, String curso, String dual) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.dni = dni;
        this.email = email;
        this.curso = curso;
        this.dual = dual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String isDual() {
        return dual;
    }

    public void setDual(String dual) {
        this.dual = dual;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", direccion='" + direccion + '\'' +
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                ", curso='" + curso + '\'' +
                ", dual=" + dual +
                '}';
    }

    @Override
    public int compareTo(Alumno a) {
        return this.apellidos.compareTo(a.getApellidos());
    }
}
