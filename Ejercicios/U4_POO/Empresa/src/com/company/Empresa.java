package com.company;

import java.util.Arrays;

public class Empresa {
    private String nombre;
    private Departamento[] departamentos;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.departamentos = new Departamento[0];
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Departamento[] getDepartamentos() {
        return departamentos;
    }
    public void setDepartamentos(Departamento[] departamentos) {
        this.departamentos = departamentos;
    }

    public void addDepartamento(Departamento departamento){
        departamentos = Arrays.copyOf(departamentos, departamentos.length+1);
        departamentos[departamentos.length-1] = departamento;
    }

    @Override
    public String toString() {
        return "Datos de la Empresa \n{" +
                "Nombre='" + nombre + '\'' +
                ",\n Lista de departamentos= \n" + Arrays.toString(departamentos) +
                '}';
    }
}
