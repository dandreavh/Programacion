package com.company;

import java.util.Arrays;

public class Ej2_EntregableTarde {
    // Crea una función con la siguiente cabecera:
    //      public String convierteEnMorse(int n)
    // Esta función convierte el número n al sistema Morse y lo devuelve en una cadena de caracteres.
    // Por ejemplo, el 213 es el . . _ _ _ . _ _ _ _ . . . _ _ en Morse.
    // Utiliza esta función en un programa para comprobar que funciona bien.
    // Desde la función no se debe mostrar nada por pantalla, solo se debe usar print desde el programa principal.
    public static void main(String[] args) {
        int n = 213;
        System.out.println("EL número " +n+ " en código Morse sería = " + convierteEnMorse(n));
    }

    public static String convierteEnMorse(int n) {
        String cadenaEnMorse = "";
        int elemento;

        while (n>0){
            elemento = n%10;
            if(elemento==0){
            cadenaEnMorse = " " + "_ _ _ _ _" + cadenaEnMorse+ " ";
            } else if(elemento==1){
                cadenaEnMorse = " " + ". _ _ _ _" + cadenaEnMorse+ " ";
            } else if(elemento==2){
                cadenaEnMorse = " " + ". . _ _ _" + cadenaEnMorse+ " ";
            } else if(elemento==3){
                cadenaEnMorse = " " + ". . . _ _" + cadenaEnMorse+ " ";
            } else if(elemento==4){
                cadenaEnMorse = " " + ". . . . _" + cadenaEnMorse+ " ";
            } else if(elemento==5){
                cadenaEnMorse = " " + ". . . . ." + cadenaEnMorse+ " ";
            } else if(elemento==6){
                cadenaEnMorse = " " + "_ . . . ." + cadenaEnMorse+ " ";
            } else if(elemento==7){
                cadenaEnMorse = " " + "_ _ . . ." + cadenaEnMorse+ " ";
            } else if(elemento==8){
                cadenaEnMorse = " " + "_ _ _ . ." + cadenaEnMorse+ " ";
            } else if(elemento==9){
                cadenaEnMorse = " " + "_ _ _ _ ." +cadenaEnMorse+ " ";
            }
            n/=10;
        }

        return cadenaEnMorse;
    }
}
