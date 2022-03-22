package com.company;

import java.util.Objects;

public class Comparsa extends AgrupacionOficial{
    private String empresa_atrezzo;

    public Comparsa(String nombre, String autor, String autor_musica, String autor_letra, String tipo_disfraz, int puntos_obtenidos, String empresa_atrezzo) {
        super(nombre, autor, autor_musica, autor_letra, tipo_disfraz, puntos_obtenidos);
        this.empresa_atrezzo = empresa_atrezzo;
    }

    public String getEmpresa_atrezzo() {
        return empresa_atrezzo;
    }

    public void setEmpresa_atrezzo(String empresa_atrezzo) {
        this.empresa_atrezzo = empresa_atrezzo;
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación de la Comparsa con nombre " + super.getNombre());
    }

    @Override
    public void hacer_tipo() {
        System.out.println("La Comparsa " + super.getNombre() + " va de " + super.getTipo_disfraz());
    }

    @Override
    public void caminito_del_Falla() {
        System.out.println("La Comparsa " + super.getNombre() + " va caminito del Falla");
    }

    @Override
    public String toString() {
        return super.toString()+"Comparsa{" +
                "empresa_atrezzo='" + empresa_atrezzo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Comparsa comparsa = (Comparsa) o;
        return empresa_atrezzo.equals(comparsa.empresa_atrezzo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), empresa_atrezzo);
    }

}
