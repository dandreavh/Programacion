package CorreccionEntregable;

import java.util.Calendar;

public class LocalComercial extends Local {
    private String descripcion;

    public LocalComercial(int yearConstruccion, String direccion, double metrosCuadrados, Persona propietario, double precio, String descripcion) {
        super(yearConstruccion, direccion, metrosCuadrados, propietario, precio);
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "LocalComercial{" +
                "descripcion='" + descripcion + '\'' +
                "} " + super.toString(); // añade lo de local
    }

    // Sobreescribe el método abstacto
    @Override
    void mostrarPropiedad() {
        System.out.println("Fecha: " + Calendar.getInstance().getTime() + "\n" +
                "Clase: " + this.getClass().getSimpleName() + "\n" + this);
    }

    @Override
    public void mostrarPrecioVenta() {
        System.out.println("Soy un LocalComercial que me dedico a " +
                this.getDescripcion() + " y valgo " + this.getPrecio());
    }
}
