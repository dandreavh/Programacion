package Examen1920Morning;

import java.io.Serializable;

public class Perro implements Serializable, Comparable<Perro>  {
// fundamental: Serializable, para escribir en ficheros. Comparable para hacer la ordenación por defecto
    private String nombre;
    private Integer edad;
    private Double peso;
    private String vacunas; // si o no
    private Propietario propietario;
    private String raza;

    public Perro(String nombre, Integer edad, Double peso, String vacunas, Propietario propietario, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.vacunas = vacunas;
        this.propietario = propietario;
        this.raza = raza;
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

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", vacunas='" + vacunas + '\'' +
                ", propietario=" + propietario +
                ", raza='" + raza + '\'' +
                '}';
    }

    @Override // comparación por defecto
    public int compareTo(Perro perro) {
        return (int) (perro.getPeso()-this.peso); // importante decidir por cuál hacerlo
    }
}
