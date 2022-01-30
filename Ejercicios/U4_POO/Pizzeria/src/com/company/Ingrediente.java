package com.company;

public class Ingrediente {

    private String nombre;
    private double calorias;

    public Ingrediente(String nombre, double calorias) {
        this.nombre = nombre;
        this.calorias = calorias;
    }

    public Ingrediente() {
        this("queso",250.00);
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getCalorias() {
        return calorias;
    }
    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    @Override
    public String toString() {
        return "Ingrediente{" +
                "nombre: " + nombre  +
                ", calorias: " + calorias +
                "}";
    }

}
