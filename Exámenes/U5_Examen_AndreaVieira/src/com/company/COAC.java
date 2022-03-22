package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class COAC {
    private Agrupacion[] agrupaciones;
    private AgrupacionOficial[] agrupacionesOficiales;

    public COAC() {
        this.agrupaciones = new Agrupacion[0];
        this.agrupacionesOficiales = new AgrupacionOficial[0];
    }

    public Agrupacion[] getAgrupaciones() {
        return agrupaciones;
    }

    public void setAgrupaciones(Agrupacion[] agrupaciones) {
        this.agrupaciones = agrupaciones;
    }

    public AgrupacionOficial[] getAgrupacionesOficiales() {
        return agrupacionesOficiales;
    }

    public void setAgrupacionesOficiales(AgrupacionOficial[] agrupacionesOficiales) {
        this.agrupacionesOficiales = agrupacionesOficiales;
    }

    // MÉTODOS PROPIOS
    public boolean existe_agrupacion(Agrupacion agrupacion) {
        for (Agrupacion a : agrupaciones) {
            if (a.equals(agrupacion)) {
                return true;
            }
        }
        return false;
    }

    public void inscribir_agrupacion(Agrupacion agrupacion){
        if(!existe_agrupacion(agrupacion)){
            agrupaciones = Arrays.copyOf(agrupaciones, agrupaciones.length + 1);
            agrupaciones[agrupaciones.length - 1] = agrupacion;
        }
    }

    public boolean eliminar_agrupacion(Agrupacion agrupacion) {
        if (existe_agrupacion(agrupacion)) {
            Agrupacion[] result = new Agrupacion[0];
            for (int i = 0; i < agrupaciones.length; i++) {
                if (!agrupaciones[i].equals(agrupacion)) {
                    result = Arrays.copyOf(result, result.length + 1);
                    result[result.length - 1] = agrupaciones[i];
                }
            }
            agrupaciones = result;
            return true;
        }
        return false;
    }
    public void ordenar_por_nombre() {
        Arrays.sort(agrupaciones);
        for (Agrupacion agrupacion : agrupaciones) {
            System.out.println(agrupacion);
        }
    }

    public void ordenar_por_puntos() {
        Arrays.sort(agrupacionesOficiales);
        for (AgrupacionOficial agrupacionOficial : agrupacionesOficiales) {
            System.out.println(agrupacionOficial);
        }
    }

    public void ordenar_por_autor() {
        Arrays.sort(agrupaciones, new Comparator<Agrupacion>() {
            @Override
            public int compare(Agrupacion a1, Agrupacion a2) {
                int result = a1.getAutor().compareTo(a2.getAutor());
                if (result == 0) {
                    result = a2.compareTo(a1);
                }
                return result;
            }
        });
        for (Agrupacion agrupacion : agrupaciones) {
            System.out.println(agrupacion);
        }
    }

    @Override
    public String toString() {
        return "COAC{" +
                "agrupaciones=" + Arrays.toString(agrupaciones) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        COAC coac = (COAC) o;
        return Arrays.equals(agrupaciones, coac.agrupaciones);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(agrupaciones);
    }
}
