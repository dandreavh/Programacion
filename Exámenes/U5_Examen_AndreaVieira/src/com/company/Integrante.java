package com.company;

import java.util.Objects;

public class Integrante {
    private int num_participante;
    private String nombre;
    private int edad;
    private String localidad;

    public Integrante(int num_participante, String nombre, int edad, String localidad) {
        this.num_participante = num_participante;
        this.nombre = nombre;
        this.edad = edad;
        this.localidad = localidad;
    }

    public int getNum_participante() {
        return num_participante;
    }

    public void setNum_participante(int num_participante) {
        this.num_participante = num_participante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return "Integrante{" +
                "num_participante=" + num_participante +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", localidad='" + localidad + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Integrante that = (Integrante) o;
        return num_participante == that.num_participante && edad == that.edad && nombre.equals(that.nombre) && localidad.equals(that.localidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num_participante, nombre, edad, localidad);
    }
}
