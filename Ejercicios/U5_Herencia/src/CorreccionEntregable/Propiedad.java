package CorreccionEntregable;

import java.util.Objects;

public abstract class Propiedad implements Comparable<Propiedad> {
    private int yearConstruccion;
    private String direccion;
    private double metrosCuadrados;
    private static int numPropiedades = 0; // contador

    public Propiedad(int yearConstruccion, String direccion, double metrosCuadrados) {
        this.yearConstruccion = yearConstruccion;
        this.direccion = direccion;
        this.metrosCuadrados = metrosCuadrados;
        numPropiedades++; // incremento para llevar control de las propiedades al crear
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
    public static int getNumPropiedades() {
        return numPropiedades;
    }
    public static void setNumPropiedades(int numPropiedades) {
        Propiedad.numPropiedades = numPropiedades;
    }

    /*
    CREO UN MÉTODO DE LA CLASE VACÍO, PORQUE LUEGO EN SUS HIJOS
    HARÉ UN OVERRIDE DE ESTE MÉTODO Y PONDRÉ TODO LO QUE NECESITE
     */
    abstract void mostrarPropiedad();

    @Override
    public String toString() {
        return "yearConstruccion=" + yearConstruccion +
                ", direccion='" + direccion + '\'' +
                ", metrosCuadrados=" + metrosCuadrados +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Propiedad propiedad = (Propiedad) o;
        return yearConstruccion == propiedad.yearConstruccion && Double.compare(propiedad.metrosCuadrados, metrosCuadrados) == 0 && Objects.equals(direccion, propiedad.direccion);
    }
    @Override
    public int hashCode() {
        return Objects.hash(yearConstruccion, direccion, metrosCuadrados);
    }

    @Override
    public int compareTo(Propiedad propiedad) {
        return Double.compare(this.getMetrosCuadrados(), propiedad.getMetrosCuadrados());
    }
}