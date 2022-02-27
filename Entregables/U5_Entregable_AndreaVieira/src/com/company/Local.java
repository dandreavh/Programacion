package com.company;

import java.util.Objects;

public abstract class Local extends Propiedad implements MostrarPrecioVenta{
    private Persona propietaria;
    private double precio;

    public Local(int yearConstruccion, String direccion, double metrosCuadrados, Persona propietaria, double precio) {
        super(yearConstruccion, direccion, metrosCuadrados);
        this.propietaria = propietaria;
        this.precio = precio;
    }

    public Persona getPropietaria() {
        return propietaria;
    }

    public void setPropietaria(Persona propietaria) {
        this.propietaria = propietaria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Local local = (Local) o;
        return Double.compare(local.precio, precio) == 0 && propietaria.equals(local.propietaria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), propietaria, precio);
    }

    @Override
    public String toString() {
        return "Local{" +
                "propietaria=" + propietaria +
                ", precio=" + precio +
                '}';
    }

    @Override
    public void mostrarPrecio() {
        System.out.println("Esta propiedad cuesta: " + precio);
    }
}
