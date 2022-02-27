package com.company;

import java.util.Arrays;
import java.util.Objects;

public class Preguntas {
    private String enunciado;
    private Opciones[] opciones;
    private static int maxOpciones = 3;

    public Preguntas(String enunciado) {
        this.enunciado = enunciado;
        this.opciones = new Opciones[0];
    }

    public String getEnunciado() {
        return enunciado;
    }
    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }
    public Opciones[] getOpciones() {
        return opciones;
    }
    public void setOpciones(Opciones[] opciones) {
        this.opciones = opciones;
    }
    public static int getMaxOpciones() {
        return maxOpciones;
    }
    public static void setMaxOpciones(int maxOpciones) {
        Preguntas.maxOpciones = maxOpciones;
    }

    public boolean addOpcion(Opciones opcion){
        if(!esta(opcion) && opciones.length<maxOpciones){
            Opciones[] result = new Opciones[0];
            result = Arrays.copyOf(result, result.length+1);
            result[result.length-1] = opcion;
            opciones = result;
            return true;
        }
        return false;
    }

    public boolean esta(Opciones opcion){
        for (int i = 0; i < opciones.length; i++) {
            if(this.opciones[i].equals(opcion)){
                return true;
            }
        }
        return false;
    }

    public boolean deleteOpcion(Opciones opcion){
        Opciones[] result = new Opciones[0];
        int actuales = opciones.length;
        for (int i = 0; i < opciones.length; i++) {
            if(!this.opciones[i].equals(opcion)){
                result = Arrays.copyOf(result, result.length+1);
                result[result.length-1] = opciones[i];
            }
        }
        opciones = result;

        if(opciones.length==actuales){
            return false;
        } else{
            return true;
        }
    }

    public void mostrar_informacion(){
        System.out.println
                ("Enunciado de la pregunta: " + enunciado +
                        "\nOpciones: " + opciones);
    }


    @Override
    public String toString() {
        return "Preguntas{" +
                "enunciado='" + enunciado + '\'' +
                ", opciones=" + Arrays.toString(opciones) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Preguntas preguntas = (Preguntas) o;
        return enunciado.equals(preguntas.enunciado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enunciado);
    }
}
