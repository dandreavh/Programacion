package com.company;

import java.util.Arrays;
import java.util.Objects;

public class Departamento {
    private String nombre;
    private String sede;
    private String extension;
    private Empleado[] empleados;
    private static int cantDepartamentos = 0;

    public Departamento(String nombre, String sede, String extension) {
        this.nombre = nombre;
        this.sede = sede;
        this.extension = extension;
        this.empleados = new Empleado[0];
        Departamento.cantDepartamentos++;
    }
    public Departamento(String nombre, String extension) {
        this(nombre,"Castilleja", extension);
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getSede() {
        return sede;
    }
    public void setSede(String sede) {
        this.sede = sede;
    }
    public String getExtension() {
        return extension;
    }
    public void setExtension(String extension) {
        this.extension = extension;
    }
    public Empleado[] getEmpleado() {
        return empleados;
    }
    public void setEmpleado(Empleado[] empleados) {
        this.empleados = empleados;
    }
    public static int getCantDepartamentos() {
        return cantDepartamentos;
    }
    
    public void addEmpleado(Empleado empleado){
        empleados = Arrays.copyOf(empleados, empleados.length+1);
        empleados[empleados.length-1] = empleado;
    }

    public void deleteEmpleado(Empleado empleado){
        Empleado[] resultado = new Empleado[0];
        for (int i = 0; i < empleados.length; i++) {
            if(!empleados[i].getNumSS().equals(empleado.getNumSS())){
                resultado = Arrays.copyOf(empleados, empleados.length-1);
                resultado[resultado.length-1] = empleados[i];
            }
        }
        empleados = resultado;
    }

    @Override
    public String toString() {
        return "Departamento\n{" +
                "Nombre='" + nombre + '\'' +
                ", Sede='" + sede + '\'' +
                ", Extensión='" + extension + '\'' +
                ", \n   Lista de empleados=\n" + Arrays.toString(empleados) +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departamento that = (Departamento) o;
        return nombre.equals(that.nombre) && sede.equals(that.sede);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nombre, sede);
    }
}
