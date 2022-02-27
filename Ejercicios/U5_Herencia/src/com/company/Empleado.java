package com.company;

public class Empleado extends Persona{

    private Double sueldo;

    public Empleado(String nomnbre, String apellidos, String dni, Double sueldo) {
        super(nomnbre, apellidos, dni);
        this.sueldo = sueldo;
    }

    public Empleado(String nomnbre, String apellidos, String dni) {
        this(nomnbre, apellidos, dni, 1000.00);
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                " Nombre=" + this.getNomnbre() +
                " Apellidos=" + this.getApellidos() +
                " DNI=" + this.getDni() +
                " Sueldo=" + sueldo +
                '}';
    }
}
