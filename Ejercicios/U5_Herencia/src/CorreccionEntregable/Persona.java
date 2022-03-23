package CorreccionEntregable;

import java.util.Objects;

public class Persona {
    private String NIF;
    private String nombre;
    private String apellidos;
    private int ID;
    private static int numPersonas = 0; // contador

    public Persona(String NIF, String nombre, String apellidos) {
        this.NIF = NIF;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.ID = numPersonas + 1; // con el contador que tenía asigno un identificador
        numPersonas++; // incremento para llevar el control de las personas
    }

    public String getNIF() {
        return NIF;
    }
    public void setNIF(String NIF) {
        this.NIF = NIF;
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
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public static int getNumPersonas() {
        return numPersonas;
    }
    public static void setNumPersonas(int numPersonas) {
        Persona.numPersonas = numPersonas;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "NIF='" + NIF + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", ID=" + ID +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return ID == persona.ID;
    }
    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }
}
