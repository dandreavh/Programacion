package com.company.Pelicula;

import java.util.Comparator;
import java.util.Objects;

public class Peli implements Comparable<Peli> {
    private String titulo;
    private String fecha;
    private int duracionMinutos;

    // en caso de iguales año desc en min
    // criterio duracion asc

    public Peli(String titulo, String fecha, int duracionMinutos) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.duracionMinutos = duracionMinutos;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public int getDuracionMinutos() {
        return duracionMinutos;
    }
    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    @Override
    public String toString() {
        return "Peli{" +
                "titulo='" + titulo + '\'' +
                ", fecha='" + fecha + '\'' +
                ", duracionMinutos='" + duracionMinutos + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Peli peli = (Peli) o;
        return titulo.equals(peli.titulo) && fecha.equals(peli.fecha) && duracionMinutos==(peli.duracionMinutos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, fecha, duracionMinutos);
    }

    @Override
    public int compareTo(Peli peli) {
        if(this.getDuracionMinutos()-peli.getDuracionMinutos()>0){
            return 1;
        } else{
            return 0;
        }
    }
}
