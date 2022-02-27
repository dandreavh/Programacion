package com.company;

import java.util.Calendar;
import java.util.Objects;

public class LocalComercial extends Local{
    
    private String descripcion;
    private Calendar fecha;

    public LocalComercial(int yearConstruccion, String direccion, double metrosCuadrados, Persona propietaria, double precio, String descripcion) {
        super(yearConstruccion, direccion, metrosCuadrados, propietaria, precio);
        this.descripcion = descripcion;
        this.fecha = Calendar.getInstance();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LocalComercial that = (LocalComercial) o;
        return descripcion.equals(that.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), descripcion);
    }

    @Override
    public String toString() {
        return "LocalComercial{" +
                "descripcion='" + descripcion + '\'' +
                '}';
    }

    @Override
    public void mostrarPropiedad() {
        System.out.println("Fecha: " + fecha.get(Calendar.DATE) + "/" + fecha.get(Calendar.MONTH)+1 + "/" + fecha.get(Calendar.YEAR)
                + "\nClase: " + getClass() + "\nInformación del local comercial con esta descripción: " + descripcion);
    }
}
