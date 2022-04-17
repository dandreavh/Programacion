package Examen1920Tarde;

import java.io.Serializable;

public class Medico implements Serializable {
    String nombre;
    String apellidos;
    Integer num_colegiado;
    String hospital;

    public Medico(String nombre, String apellidos, Integer num_colegiado, String hospital) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.num_colegiado = num_colegiado;
        this.hospital = hospital;
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

    public Integer getNum_colegiado() {
        return num_colegiado;
    }

    public void setNum_colegiado(Integer num_colegiado) {
        this.num_colegiado = num_colegiado;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", num_colegiado=" + num_colegiado +
                ", hospital='" + hospital + '\'' +
                '}';
    }
}
