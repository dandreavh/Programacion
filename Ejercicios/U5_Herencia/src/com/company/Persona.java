package com.company;

import java.util.Objects;

public class Persona {
    private String nomnbre;
    private String apellidos;
    private String dni;

    public Persona(String nomnbre, String apellidos, String dni) {
        this.nomnbre = nomnbre;
        this.apellidos = apellidos;
        this.dni = dni;
    }

    public String getNomnbre() {
        return nomnbre;
    }

    public void setNomnbre(String nomnbre) {
        this.nomnbre = nomnbre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nomnbre='" + nomnbre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return dni.equals(persona.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }
}
