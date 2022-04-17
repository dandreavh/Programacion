package Examen1920Tarde;

import java.io.Serializable;

public class Paciente implements Serializable, Comparable<Paciente> {
    String nombre;
    Integer edad;
    Double peso;
    String vacunas;
    Medico medico;
    Character cepa;

    public Paciente(String nombre, Integer edad, Double peso, String vacunas, Medico medico, Character cepa) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.vacunas = vacunas;
        this.medico = medico;
        this.cepa = cepa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getVacunas() {
        return vacunas;
    }

    public void setVacunas(String vacunas) {
        this.vacunas = vacunas;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Character getCepa() {
        return cepa;
    }

    public void setCepa(Character cepa) {
        this.cepa = cepa;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", vacunas='" + vacunas + '\'' +
                ", medico=" + medico +
                ", cepa=" + cepa +
                '}';
    }

    @Override // ordenación por defecto
    public int compareTo(Paciente paciente) {
        return this.peso.compareTo(paciente.getPeso());
    }
}
