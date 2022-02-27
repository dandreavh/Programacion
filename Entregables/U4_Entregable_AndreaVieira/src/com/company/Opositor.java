package com.company;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Objects;

public class Opositor {
    private String nombre;
    private String apellidos;
    private Integer anioNacimiento;
    private Boolean adaptacion;
    private String descripcionAdaptacion;
    private static int cantAdaptados = 0;
    private static int numOpositores = 0;

    public Opositor(String nombre, String apellidos, Integer anioNacimiento, Boolean adaptacion, String descripcionAdaptacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.anioNacimiento = anioNacimiento;
        this.adaptacion = adaptacion;
        if (this.adaptacion){
            this.descripcionAdaptacion = descripcionAdaptacion;
            cantAdaptados++;
        } else{
            this.descripcionAdaptacion = "Sin adaptación";
        }
        numOpositores++;
    }

    public Opositor(String nombre, String apellidos, Integer anioNacimiento, Boolean adaptacion) {
        this(nombre, apellidos, anioNacimiento, adaptacion, "");
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
    public Integer getAnioNacimiento() {
        return anioNacimiento;
    }
    public void setAnioNacimiento(Integer anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }
    public Boolean getAdaptacion() {
        return adaptacion;
    }
    public void setAdaptacion(Boolean adaptacion) {
        this.adaptacion = adaptacion;
    }
    public String getDescripcionAdaptacion() {
        return descripcionAdaptacion;
    }
    public void setDescripcionAdaptacion(String descripcionAdaptacion) {
        this.descripcionAdaptacion = descripcionAdaptacion;
    }

    public void mostrar_informacion(){
        System.out.println(
                "Nombre:'" + nombre + '\'' +
                        "\n Apellidos:'" + apellidos + '\'' +
                        "\n Año de nacimiento: " + anioNacimiento +
                        "\n ¿Tiene adaptación? " + adaptacion +
                        "\n Descripción de la adaptación: " + descripcionAdaptacion
        );

    }

    @Override
    public String toString() {
        return "Opositor{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", añoNacimiento=" + anioNacimiento +
                ", adaptacion=" + adaptacion +
                ", descripcionAdaptacion='" + descripcionAdaptacion + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Opositor opositor = (Opositor) o;
        return nombre.equals(opositor.nombre) && apellidos.equals(opositor.apellidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellidos);
    }
}
