package com.company.ActividadInicial;

public class Persona {

    private String nombre;
    private String apellidos;
    private int altura;
    private double peso;


    // GETTERS Y SETTERS PARA PODER ACCEDER A LOS ATRIBUTOS PRIVADOS, QUE SIEMPRE SERÁN PRIVADOS
    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
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

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // CONSTRUCTOR
    public Persona(String nombre, String apellidos, int altura, double peso) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.altura = altura;
        this.peso = peso;
    }

}
