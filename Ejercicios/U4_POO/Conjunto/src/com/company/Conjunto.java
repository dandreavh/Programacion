package com.company;

import java.util.Arrays;

/**
 * @author dandreavh
 */
public class Conjunto {
    private Integer[] numeros;
    private int capacidad;
    private static int cantElementos = 0;

    /**
     * Default constructor demanding array of numbers and the array's capacity
     * @param capacidad (reserved spaces in array)
     */
    public Conjunto(int capacidad) {
        this.capacidad = capacidad;
        this.numeros  = new Integer[0];
    }

    /**
     * Constructor only with default capacity of 10
     */
    public Conjunto() {
        this( 10);
    }

    /**
     * Getters & Setters
     * @return array of numbers
     */
    public Integer[] getNumeros() {
        return numeros;
    }

    public void setNumeros(Integer[] numeros) {
        this.numeros = numeros;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public static int getCantElementos() {
        return cantElementos;
    }


    public boolean insertarNumero(Integer n){
        Integer[] resultado = new Integer[0];
        if(numeros.length<capacidad){
            if(!estaNumero(n)){
                resultado = Arrays.copyOf(numeros, numeros.length+1);
                resultado[resultado.length-1] = n;
                numeros = resultado;
                cantElementos++;
                return true;
            }
        }
        return false;
    }

    public boolean estaNumero(Integer n){
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]==n){
                return true;
            }
        }
        return false;
    }

    public boolean insertarConjunto(Conjunto c){
        Integer[] r = c.getNumeros();
        for (int i = 0; i < numeros.length; i++) {
            if(insertarNumero(r[i])){
                numeros = r;
                return true;
            }
        }
        return false;
    }

    public boolean borrarElemento(Integer n){
        if (estaNumero(n)){
            Integer[] resultado = new Integer[0];
            for (int i = 0; i < numeros.length; i++) {
                if(!numeros[i].equals(n)){
                    resultado = Arrays.copyOf(numeros, numeros.length-1);
                    resultado[resultado.length-1]=numeros[i];
                }
            }
            numeros = resultado;
            return true;
        }
        return false;
    }

    /**
     * ToString Method
     * @return values
     */
    @Override
    public String toString() {
        return "Conjunto{" +
                "numeros=" + Arrays.toString(numeros) +
                ", capacidad=" + capacidad +
                "} cantidad de elementos en el array " + cantElementos ;
    }

    /**
     * Equals
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conjunto conjunto = (Conjunto) o;
        return Arrays.equals(numeros, conjunto.numeros);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(numeros);
    }
}
