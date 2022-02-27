package com.company;

import java.util.Objects;

public class Opciones {
    private String texto;
    private Tipo tipo;

    public Opciones(String texto, Tipo tipo) {
        this.texto = texto;
        this.tipo = tipo;
    }

    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
    public Tipo getTipo() {
        return tipo;
    }
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public void mostrar_informacion(){
        System.out.println
                ("Texto de la opción: " + texto  +
                        "\nTipo de opción: " + tipo);
    }

    @Override
    public String toString() {
        return "Opciones{" +
                "texto='" + texto + '\'' +
                ", tipo=" + tipo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Opciones opciones = (Opciones) o;
        return texto.equals(opciones.texto) && tipo == opciones.tipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(texto, tipo);
    }
}
