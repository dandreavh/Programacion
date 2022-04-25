package PrácticaBaloncesto;

import java.io.Serializable;
import java.util.Objects;

public class Jugador implements Serializable, Comparable<Jugador> {
    private String nombre;
    private String apellidos;
    private Integer altura;
    private Integer edad;

    public Jugador(String nombre, String apellidos, Integer altura, Integer edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.altura = altura;
        this.edad = edad;
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

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jugador jugador = (Jugador) o;
        return nombre.equals(jugador.nombre) && apellidos.equals(jugador.apellidos) && altura.equals(jugador.altura) && edad.equals(jugador.edad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellidos, altura, edad);
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", altura=" + altura +
                ", edad=" + edad +
                '}' + '\n';
    }

    @Override
    public int compareTo(Jugador jugador) {
        return this.edad.compareTo(jugador.getEdad());
    }
}
