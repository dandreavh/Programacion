package com.company;

import java.util.Objects;

public class Chirigota extends AgrupacionOficial implements Callejera{
    private int num_cuples;

    public Chirigota(String nombre, String autor, String autor_musica, String autor_letra, String tipo_disfraz, int puntos_obtenidos, int num_cuples) {
        super(nombre, autor, autor_musica, autor_letra, tipo_disfraz, puntos_obtenidos);
        this.num_cuples = num_cuples;
    }

    public int getNum_cuples() {
        return num_cuples;
    }

    public void setNum_cuples(int num_cuples) {
        this.num_cuples = num_cuples;
    }

    // Comportamiento personalizado
    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación de la Chirigota con nombre " + super.getNombre());
    }

    @Override
    public void hacer_tipo() {
        System.out.println("La Chirigota " + super.getNombre() + " va de " + super.getTipo_disfraz());
    }

    @Override
    public void caminito_del_Falla() {
        System.out.println("La Chirigota " + super.getNombre() + " va caminito del Falla");
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha la Chirigota " + super.getNombre());
    }

    @Override
    public String toString() {
        return super.toString()+"Chirigota{" +
                "num_cuples=" + num_cuples +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Chirigota chirigota = (Chirigota) o;
        return num_cuples == chirigota.num_cuples;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), num_cuples);
    }

}
