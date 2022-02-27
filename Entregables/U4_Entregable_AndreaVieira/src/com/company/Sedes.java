package com.company;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Objects;

public class Sedes {
    private String codigo;
    private Ciudad ciudad;
    private Opositor[] opositores;

    public Sedes(String codigo, Ciudad ciudad) {
        this.codigo = codigo;
        this.ciudad = ciudad;
        this.opositores = new Opositor[0];
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public Ciudad getCiudad() {
        return ciudad;
    }
    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
    public Opositor[] getOpositores() {
        return opositores;
    }
    public void setOpositores(Opositor[] opositores) {
        this.opositores = opositores;
    }

    public boolean addOpositor(Opositor opositor){
        if(!esta(opositor)){
            Opositor[] result = new Opositor[0];
            result = Arrays.copyOf(result, result.length+1);
            result[result.length-1] = opositor;
            opositores = result;
            return true;
        }
        return false;
    }
    public boolean esta(Opositor opositor){
        for (int i = 0; i < opositores.length; i++) {
            if(this.opositores[i].equals(opositor)){
                return true;
            }
        }
        return false;
    }
    public boolean deleteOpositor(Opositor opositor){
        Opositor[] result = new Opositor[0];
        int actuales = opositores.length;
        for (int i = 0; i < opositores.length; i++) {
            if(!this.opositores[i].equals(opositor)){
                result = Arrays.copyOf(result, result.length+1);
                result[result.length-1] = opositores[i];
            }
        }
        opositores = result;

        if(opositores.length==actuales){
            return false;
        } else{
            return true;
        }
    }

    public void mostrar_informacion(){
        System.out.println
                ("Código de la sede: " + codigo +
                        "\n Ciudad: " + ciudad +
                        "\n Opositores=" + Arrays.toString(opositores));
    }

    @Override
    public String toString() {
        return "Sedes{" +
                "codigo='" + codigo + '\'' +
                ", ciudad=" + ciudad +
                ", opositores=" + Arrays.toString(opositores) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sedes sedes = (Sedes) o;
        return codigo.equals(sedes.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}
