package Examen1920Morning;

import java.io.Serializable;

public class Propietario implements Serializable {

    private String nombre;
    private String apellidos;
    private Integer num_socio;
    private String pais_origen;

    public Propietario(String nombre, String apellidos, Integer num_socio, String pais_origen) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.num_socio = num_socio;
        this.pais_origen = pais_origen;
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

    public Integer getNum_socio() {
        return num_socio;
    }

    public void setNum_socio(Integer num_socio) {
        this.num_socio = num_socio;
    }

    public String getPais_origen() {
        return pais_origen;
    }

    public void setPais_origen(String pais_origen) {
        this.pais_origen = pais_origen;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", num_socio=" + num_socio +
                ", pais_origen='" + pais_origen + '\'' +
                '}';
    }
}
