package com.company;

import java.util.Objects;

public abstract class Agrupacion implements Comparable<Agrupacion>{
    private String nombre;
    private String autor;
    private String autor_musica;
    private String autor_letra;
    private String tipo_disfraz;
    private int cantidad_agrupaciones = 0;

    public Agrupacion(String nombre, String autor, String autor_musica, String autor_letra, String tipo_disfraz) {
        this.nombre = nombre;
        this.autor = autor;
        this.autor_musica = autor_musica;
        this.autor_letra = autor_letra;
        this.tipo_disfraz = tipo_disfraz;
        this.cantidad_agrupaciones++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor_musica() {
        return autor_musica;
    }

    public void setAutor_musica(String autor_musica) {
        this.autor_musica = autor_musica;
    }

    public String getAutor_letra() {
        return autor_letra;
    }

    public void setAutor_letra(String autor_letra) {
        this.autor_letra = autor_letra;
    }

    public String getTipo_disfraz() {
        return tipo_disfraz;
    }

    public void setTipo_disfraz(String tipo_disfraz) {
        this.tipo_disfraz = tipo_disfraz;
    }

    public int getCantidad_agrupaciones() {
        return cantidad_agrupaciones;
    }

    public void setCantidad_agrupaciones(int cantidad_agrupaciones) {
        this.cantidad_agrupaciones = cantidad_agrupaciones;
    }

    public abstract void cantar_la_presentacion();

    public abstract void hacer_tipo();

    @Override
    public String toString() {
        return "Agrupacion{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", autor_musica='" + autor_musica + '\'' +
                ", autor_letra='" + autor_letra + '\'' +
                ", tipo_disfraz='" + tipo_disfraz + '\'' +
                ", cantidad_agrupaciones=" + cantidad_agrupaciones +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Agrupacion that = (Agrupacion) o;
        return cantidad_agrupaciones == that.cantidad_agrupaciones && nombre.equals(that.nombre) && autor.equals(that.autor) && autor_musica.equals(that.autor_musica) && autor_letra.equals(that.autor_letra) && tipo_disfraz.equals(that.tipo_disfraz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, autor, autor_musica, autor_letra, tipo_disfraz, cantidad_agrupaciones);
    }

    @Override
    public int compareTo(Agrupacion agrupacion) {
        return autor.compareTo(agrupacion.getAutor());
    }
}