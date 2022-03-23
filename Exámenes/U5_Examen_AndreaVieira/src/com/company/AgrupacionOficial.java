package com.company;

import java.util.Arrays;
import java.util.Objects;

public abstract class AgrupacionOficial extends Agrupacion {
    private int puntos_obtenidos;
    private Integrante[] integrantes;

    public AgrupacionOficial(String nombre, String autor, String autor_musica, String autor_letra, String tipo_disfraz, int puntos_obtenidos) {
        super(nombre, autor, autor_musica, autor_letra, tipo_disfraz);
        this.puntos_obtenidos = puntos_obtenidos;
        this.integrantes = new Integrante[0];
    }

    public int getPuntos_obtenidos() {
        return puntos_obtenidos;
    }

    public void setPuntos_obtenidos(int puntos_obtenidos) {
        this.puntos_obtenidos = puntos_obtenidos;
    }

    public Integrante[] getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(Integrante[] integrantes) {
        this.integrantes = integrantes;
    }

    // Métodos propios
    public boolean existe_integrante(Integrante integrante) {
        for (Integrante i : integrantes) {
            if (i.equals(integrante)) {
                return true;
            }
        }
        return false;
    }

    public void insertar_integrante(Integrante integrante){
        if(!existe_integrante(integrante)){
            integrantes = Arrays.copyOf(integrantes, integrantes.length + 1);
            integrantes[integrantes.length - 1] = integrante;
        }
    }

    public boolean eliminar_integrante(Integrante integrante) {
        if (existe_integrante(integrante)) {
            Integrante[] result = new Integrante[0];
            for (int i = 0; i < integrantes.length; i++) {
                if (!integrantes[i].equals(integrante)) {
                    result = Arrays.copyOf(result, result.length + 1);
                    result[result.length - 1] = integrantes[i];
                }
            }
            integrantes = result;
            return true;
        }
        return false;
    }

    public abstract void caminito_del_Falla();

    @Override
    public String toString() {
        return super.toString()+"AgrupacionOficial{" +
                "puntos_obtenidos=" + puntos_obtenidos +
                ", integrantes=" + Arrays.toString(integrantes) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AgrupacionOficial that = (AgrupacionOficial) o;
        return puntos_obtenidos == that.puntos_obtenidos;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), puntos_obtenidos);
    }
}
