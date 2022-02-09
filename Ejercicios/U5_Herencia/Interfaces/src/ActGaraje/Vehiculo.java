package ActGaraje;

import java.util.Objects;

public abstract class Vehiculo {
    private String nombre;
    private Integer capacidad;
    private Integer numPersonas;

    public Vehiculo(String nombre, Integer capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        numPersonas = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public boolean transportar(int capacidad){
        if (numPersonas>capacidad){
            return false;
        }
        this.numPersonas = numPersonas;
        return true;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "nombre='" + nombre + '\'' +
                ", capacidad=" + capacidad +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return capacidad == vehiculo.capacidad && nombre.equals(vehiculo.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, capacidad);
    }
}
