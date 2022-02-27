package com.company;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Objects;

public class Examen {
    private Calendar fecha;
    private String consejeria;
    private String url;
    private Sedes[] sedes;
    private Preguntas[] preguntas;
    private static Integer maxPreguntas = 100;

    public Examen(String consejeria, String url) {
        this.fecha = Calendar.getInstance();
        this.consejeria = consejeria;
        this.url = url;
        this.sedes = new Sedes[0];
        this.preguntas = new Preguntas[0];

    }

    public Calendar getFecha() {
        return fecha;
    }
    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }
    public String getConsejeria() {
        return consejeria;
    }
    public void setConsejeria(String consejeria) {
        this.consejeria = consejeria;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public Sedes[] getSedes() {
        return sedes;
    }
    public void setSedes(Sedes[] sedes) {
        this.sedes = sedes;
    }
    public Preguntas[] getPreguntas() {
        return preguntas;
    }
    public void setPreguntas(Preguntas[] preguntas) {
        this.preguntas = preguntas;
    }
    public static Integer getMaxPreguntas() {
        return maxPreguntas;
    }
    public static void setMaxPreguntas(Integer maxPreguntas) {
        Examen.maxPreguntas = maxPreguntas;
    }

    public boolean addPregunta(Preguntas pregunta){
        if(!esta(pregunta) && preguntas.length<maxPreguntas){
            Preguntas[] result = new Preguntas[0];
            result = Arrays.copyOf(result, result.length+1);
            result[result.length-1] = pregunta;
            preguntas = result;
            return true;
        }
        return false;
    }
    public boolean esta(Preguntas pregunta){
        for (int i = 0; i < preguntas.length; i++) {
            if(this.preguntas[i].equals(pregunta)){
                return true;
            }
        }
        return false;
    }
    public boolean deletePregunta(Preguntas pregunta){
        Preguntas[] result = new Preguntas[0];
        int actuales = preguntas.length;
        for (int i = 0; i < preguntas.length; i++) {
            if(!this.preguntas[i].equals(pregunta)){
                result = Arrays.copyOf(result, result.length+1);
                result[result.length-1] = preguntas[i];
            }
        }
        preguntas = result;

        if(preguntas.length==actuales){
            return false;
        } else{
            return true;
        }
    }

    public boolean addSede(Sedes sede){
        if(!esta(sede)){
            Sedes[] result = new Sedes[0];
            result = Arrays.copyOf(result, result.length+1);
            result[result.length-1] = sede;
            sedes = result;
            return true;
        }
        return false;
    }
    public boolean esta(Sedes sede){
        for (int i = 0; i < sedes.length; i++) {
            if(this.sedes[i].equals(sede)){
                return true;
            }
        }
        return false;
    }
    public boolean deleteSede(Sedes sede){
        Sedes[] result = new Sedes[0];
        int actuales = sedes.length;
        for (int i = 0; i < sedes.length; i++) {
            if(!this.sedes[i].equals(sede)){
                result = Arrays.copyOf(result, result.length+1);
                result[result.length-1] = sedes[i];
            }
        }
        sedes = result;

        if(sedes.length==actuales){
            return false;
        } else{
            return true;
        }
    }

    public void mostrar_informacion(){
        System.out.println
                ("Fecha del examen: " + fecha.get(Calendar.DATE) + "/" + fecha.get(Calendar.MONTH)+1 + "/" + fecha.get(Calendar.YEAR) +
                "\n Consejería: " + consejeria +
                "\nURL: " + url +
                "\nSedes: " + Arrays.toString(sedes) +
                "\nPreguntas: " + Arrays.toString(preguntas));
    }

    @Override
    public String toString() {
        return "Examen{" +
                "Fecha= " + fecha.get(Calendar.DATE) + "/" + fecha.get(Calendar.MONTH)+1 + "/" + fecha.get(Calendar.YEAR) +
                ", consejeria='" + consejeria + '\'' +
                ", url='" + url + '\'' +
                ", sedes=" + Arrays.toString(sedes) +
                ", preguntas=" + Arrays.toString(preguntas) +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Examen examen = (Examen) o;
        return fecha.equals(examen.fecha) && consejeria.equals(examen.consejeria) && url.equals(examen.url) && Arrays.equals(sedes, examen.sedes) && Arrays.equals(preguntas, examen.preguntas);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(fecha, consejeria, url);
        result = 31 * result + Arrays.hashCode(sedes);
        result = 31 * result + Arrays.hashCode(preguntas);
        return result;
    }
}
