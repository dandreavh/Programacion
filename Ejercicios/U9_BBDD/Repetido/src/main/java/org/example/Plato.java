package org.example;

import java.util.Objects;

public class Plato {
    private String calorias;
    private String nombre;
    private String precio;

    public Plato() {
    }

    public String getCalorias() {
        return calorias;
    }

    public void setCalorias(String calorias) {
        this.calorias = calorias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Plato{" +
                "calorias='" + calorias + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio='" + precio + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plato plato = (Plato) o;
        return Objects.equals(calorias, plato.calorias) && Objects.equals(nombre, plato.nombre) && Objects.equals(precio, plato.precio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(calorias, nombre, precio);
    }
}
