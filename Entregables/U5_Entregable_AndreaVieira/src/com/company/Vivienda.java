package com.company;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Objects;

public class Vivienda extends Propiedad implements MostrarPrecioVenta{
    private int cantidadBathrooms;
    private int cantidadHabitaciones;
    private int capacidadMaxima;
    private double precio;
    private Persona[] habitantes;
    private Calendar fecha;

    public Vivienda(int yearConstruccion, String direccion, double metrosCuadrados, int cantidadBathrooms, int cantidadHabitaciones, int capacidadMaxima, double precio) {
        super(yearConstruccion, direccion, metrosCuadrados);
        this.cantidadBathrooms = cantidadBathrooms;
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.capacidadMaxima = capacidadMaxima;
        this.precio = precio;
        this.habitantes = new Persona[0];
        this.fecha = Calendar.getInstance();
    }

    public int getCantidadBathrooms() {
        return cantidadBathrooms;
    }

    public void setCantidadBathrooms(int cantidadBathrooms) {
        this.cantidadBathrooms = cantidadBathrooms;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Persona[] getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(Persona[] habitantes) {
        this.habitantes = habitantes;
    }

    public boolean addPersona(Persona persona){
        if(habitantes.length<capacidadMaxima && !existePersona(persona)){
            habitantes = Arrays.copyOf(habitantes, habitantes.length+1);
            habitantes[habitantes.length-1] = persona;
            return true;
        }
        return false;
    }

    public boolean deletePersona(Persona persona){
        if (existePersona(persona)){
            Persona[] p = new Persona[habitantes.length-1];
            for (int i = 0; i < habitantes.length ; i++) {
                if (!habitantes[i].equals(persona)) {
                    p[i-1] = habitantes[i];
                }
            }
            habitantes = p;
            return true;
        }
        return false;
    }

    public boolean existePersona(Persona persona){
        for (int i = 0; i < habitantes.length; i++) {
            if((habitantes[i].equals(persona))){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Vivienda vivienda = (Vivienda) o;
        return cantidadBathrooms == vivienda.cantidadBathrooms && cantidadHabitaciones == vivienda.cantidadHabitaciones && capacidadMaxima == vivienda.capacidadMaxima && Double.compare(vivienda.precio, precio) == 0 && Arrays.equals(habitantes, vivienda.habitantes);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(super.hashCode(), cantidadBathrooms, cantidadHabitaciones, capacidadMaxima, precio);
        result = 31 * result + Arrays.hashCode(habitantes);
        return result;
    }

    @Override
    public String toString() {
        return "Vivienda{" +
                "cantidadBathrooms=" + cantidadBathrooms +
                ", cantidadHabitaciones=" + cantidadHabitaciones +
                ", capacidadMaxima=" + capacidadMaxima +
                ", precio=" + precio +
                ", habitantes=" + Arrays.toString(habitantes) +
                '}';
    }

    @Override
    public void mostrarPrecio() {
        System.out.println("Esta propiedad cuesta: " + precio + "€");
    }

    @Override
    public void mostrarPropiedad() {
        System.out.println("Fecha: " + fecha.get(Calendar.DATE) + "/" + fecha.get(Calendar.MONTH)+1 + "/" + fecha.get(Calendar.YEAR)
                + "\nClase: " + getClass() + "\nInformación: " + "{cantidadBathrooms=" + cantidadBathrooms +
                ", cantidadHabitaciones=" + cantidadHabitaciones +
                        ", capacidadMaxima=" + capacidadMaxima +
                        ", precio=" + precio +
                        ", habitantes=" + Arrays.toString(habitantes) +
                        '}');
    }
}
