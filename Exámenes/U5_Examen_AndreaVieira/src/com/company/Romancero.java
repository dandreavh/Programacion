package com.company;

import java.util.Objects;

public class Romancero extends Agrupacion implements Callejera{
    private String tematica_cartelon;

    public Romancero(String nombre, String autor, String autor_musica, String autor_letra, String tipo_disfraz, String tematica_cartelon) {
        super(nombre, autor, autor_musica, autor_letra, tipo_disfraz);
        this.tematica_cartelon = tematica_cartelon;
    }

    public String getTematica_cartelon() {
        return tematica_cartelon;
    }

    public void setTematica_cartelon(String tematica_cartelon) {
        this.tematica_cartelon = tematica_cartelon;
    }

    // Comportamiento personalizado
    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación del Romancero con nombre " + super.getNombre());
    }

    @Override
    public void hacer_tipo() {
        System.out.println("El Romancero " + super.getNombre() + " va de " + super.getTipo_disfraz());
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha el Romanero " + super.getNombre());
    }

    @Override
    public String toString() {
        return super.toString()+"Romancero{" +
                "tematica_cartelon='" + tematica_cartelon + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Romancero romancero = (Romancero) o;
        return tematica_cartelon.equals(romancero.tematica_cartelon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tematica_cartelon);
    }
}
