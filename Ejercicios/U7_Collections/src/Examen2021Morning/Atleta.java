package Examen2021Morning;

import java.io.Serializable;
import java.util.Objects;

public class Atleta implements Serializable, Comparable<Atleta> {
    private Integer dorsal;
    private String nombre;
    private String pais;
    private Integer segundos_marca; // no incluido en constructor
    private Categoria categoria;
    private boolean finisher;

    private static int contadorDorsal = 0;

    public Atleta(String nombre, String pais, Categoria categoria, boolean finisher) {
        contadorDorsal++;
        this.dorsal = contadorDorsal;
        this.nombre = nombre;
        this.pais = pais;
        this.categoria = categoria;
        this.finisher = finisher;
    }

    public Integer getDorsal() {
        return dorsal;
    }

    public void setDorsal(Integer dorsal) {
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Integer getSegundos_marca() {
        return segundos_marca;
    }

    public void setSegundos_marca(Integer segundos_marca) {
        this.segundos_marca = segundos_marca;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public boolean isFinisher() {
        return finisher;
    }

    public void setFinisher(boolean finisher) {
        this.finisher = finisher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Atleta atleta = (Atleta) o;
        return finisher == atleta.finisher && dorsal.equals(atleta.dorsal) && nombre.equals(atleta.nombre) && pais.equals(atleta.pais) && segundos_marca.equals(atleta.segundos_marca) && categoria == atleta.categoria;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dorsal, nombre, pais, segundos_marca, categoria, finisher);
    }

    @Override
    public String toString() {
        return "Atleta{" +
                "dorsal=" + dorsal +
                ", nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", segundos_marca=" + segundos_marca +
                ", categoria=" + categoria +
                ", finisher=" + finisher +
                '}';
    }

    @Override // ordenación por defecto
    public int compareTo(Atleta atleta) {
        return this.segundos_marca.compareTo(atleta.getSegundos_marca());
    }
}
