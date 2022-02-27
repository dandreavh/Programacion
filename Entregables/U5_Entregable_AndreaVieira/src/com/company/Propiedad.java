package com.company;

import java.util.Objects;

public abstract class Propiedad implements Comparable<Propiedad> {
    private int yearConstruccion;
    private String direccion;
    private double metrosCuadrados;
    private int cantPropiedades;

    public Propiedad(int yearConstruccion, String direccion, double metrosCuadrados) {
        this.yearConstruccion = yearConstruccion;
        this.direccion = direccion;
        this.metrosCuadrados = metrosCuadrados;
    }

    public int getYearConstruccion() {
        return yearConstruccion;
    }

    public void setYearConstruccion(int yearConstruccion) {
        this.yearConstruccion = yearConstruccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public int getCantPropiedades() {
        return cantPropiedades;
    }

    public void setCantPropiedades(int cantPropiedades) {
        this.cantPropiedades = cantPropiedades;
    }

    public abstract void mostrarPropiedad();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Propiedad propiedad = (Propiedad) o;
        return yearConstruccion == propiedad.yearConstruccion && Double.compare(propiedad.metrosCuadrados, metrosCuadrados) == 0 && cantPropiedades == propiedad.cantPropiedades && direccion.equals(propiedad.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearConstruccion, direccion, metrosCuadrados, cantPropiedades);
    }

    @Override
    public String toString() {
        return "Propiedad{" +
                "yearConstruccion=" + yearConstruccion +
                ", direccion='" + direccion + '\'' +
                ", metrosCuadrados=" + metrosCuadrados +
                ", cantPropiedades=" + cantPropiedades +
                '}';
    }

    @Override
    public int compareTo(Propiedad propiedad) {
        return (int) (this.metrosCuadrados - propiedad.getMetrosCuadrados());
    }
}
