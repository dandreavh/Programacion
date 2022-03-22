package com.company;

import java.util.Objects;

public class Coro extends AgrupacionOficial{
    private int num_bandurrias;
    private int num_guitarras;


    public Coro(String nombre, String autor, String autor_musica, String autor_letra, String tipo_disfraz, int puntos_obtenidos, int num_bandurrias, int num_guitarras) {
        super(nombre, autor, autor_musica, autor_letra, tipo_disfraz, puntos_obtenidos);
        this.num_bandurrias = num_bandurrias;
        this.num_guitarras = num_guitarras;
    }

    public int getNum_bandurrias() {
        return num_bandurrias;
    }

    public void setNum_bandurrias(int num_bandurrias) {
        this.num_bandurrias = num_bandurrias;
    }

    public int getNum_guitarras() {
        return num_guitarras;
    }

    public void setNum_guitarras(int num_guitarras) {
        this.num_guitarras = num_guitarras;
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación del Coro con nombre " + super.getNombre());
    }

    @Override
    public void hacer_tipo() {
        System.out.println("El Coro " + super.getNombre() + " va de " + super.getTipo_disfraz());
    }


    @Override
    public void caminito_del_Falla() {
        System.out.println("El coro " + super.getNombre() + " va caminito del Falla");
    }

    @Override
    public String toString() {
        return super.toString() + "Coro{" +
                "num_bandurrias=" + num_bandurrias +
                ", num_guitarras=" + num_guitarras +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Coro coro = (Coro) o;
        return num_bandurrias == coro.num_bandurrias && num_guitarras == coro.num_guitarras;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), num_bandurrias, num_guitarras);
    }

}
