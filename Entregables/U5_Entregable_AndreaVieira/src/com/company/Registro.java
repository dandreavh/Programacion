package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Registro {
    private Propiedad[] propiedades;

    public Registro(Propiedad[] propiedades) {
        this.propiedades = propiedades;
    }

    public Propiedad[] getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(Propiedad[] propiedades) {
        this.propiedades = propiedades;
    }

    public void addPropiedad(){

    }

    public boolean deletePropiedad(){
        return false;
    }

    public void informeSuperficie(){
        Arrays.sort(propiedades);
        System.out.println(propiedades);
    }

    public void informeAntiguedad(){
        Arrays.sort(propiedades, new Comparator<Propiedad>() {
            @Override
            public int compare(Propiedad p1, Propiedad p2) {
                if (p1.getMetrosCuadrados()==p2.getMetrosCuadrados()){
                    return p1.getYearConstruccion()-p2.getYearConstruccion();
                }
                return (int) (p1.getMetrosCuadrados()-p2.getMetrosCuadrados());
            }
        });

        System.out.println(propiedades);
    }

    public boolean addPropiedad(Propiedad p){
        if(!existePropiedad(p)){
            propiedades = Arrays.copyOf(propiedades, propiedades.length+1);
            propiedades[propiedades.length-1] = p;
            return true;
        }
        return false;
    }

    public boolean deletePropiedad(Persona p){
        if (existePropiedad(p)){
            Propiedad[] pr = new Propiedad[propiedades.length-1];
            for (int i = 0; i < propiedades.length ; i++) {
                if (!propiedades[i].equals(pr)) {
                    pr[i-1] = propiedades[i];
                }
            }
            propiedades = pr;
            return true;
        }
        return false;
    }

    public boolean existePropiedad(Propiedad propiedad){
        for (int i = 0; i < propiedades.length; i++) {
            if((propiedades[i].equals(propiedad))){
                return true;
            }
        }
        return false;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Registro registro = (Registro) o;
        return Arrays.equals(propiedades, registro.propiedades);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(propiedades);
    }

    @Override
    public String toString() {
        return "Registro{" +
                "propiedades=" + Arrays.toString(propiedades) +
                '}';
    }

}
