package com.company;

import java.util.Objects;

public class Cuarteto extends AgrupacionOficial implements Callejera{
    private int num_miembros;

    public Cuarteto(String nombre, String autor, String autor_musica, String autor_letra, String tipo_disfraz, int puntos_obtenidos, int num_miembros) {
        super(nombre, autor, autor_musica, autor_letra, tipo_disfraz, puntos_obtenidos);
        this.num_miembros = num_miembros;
    }

    public int getNum_miembros() {
        return num_miembros;
    }

    public void setNum_miembros(int num_miembros) {
        this.num_miembros = num_miembros;
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación del Cuarteto con nombre " + super.getNombre());
    }

    @Override
    public void hacer_tipo() {
        System.out.println("El Cuarteto " + super.getNombre() + " va de " + super.getTipo_disfraz());
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha el Cuarteto " + super.getNombre());
    }

    @Override
    public void caminito_del_Falla() {
        System.out.println("El cuarteto " + super.getNombre() + " va caminito del Falla");
    }

    @Override
    public String toString() {
        return super.toString()+"Cuarteto{" +
                "num_miembros=" + num_miembros +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cuarteto cuarteto = (Cuarteto) o;
        return num_miembros == cuarteto.num_miembros;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), num_miembros);
    }

}
