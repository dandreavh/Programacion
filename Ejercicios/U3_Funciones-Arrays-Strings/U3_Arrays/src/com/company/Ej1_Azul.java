package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ej1_Azul {
    // Implementa la función aleatorioDeArray con la cabecera que se muestra a continuación:
    //public static int aleatorioDeArray(int[] a)
    //Esta función debe devolver un número del array escogido al azar entre todos los disponibles.
    //Por ejemplo, si a = {111, 222, 333, 444}, aleatorioDeArray(a) podría devolver el 111, el 222, el 333 o el 444.
    // Si b = {52, 37}, aleatorioDeArray(b) podría devolver el 52 o el 37.
    //Utiliza la función en un programa de prueba.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {111, 222, 333, 444};
        int[] b = {52, 37};
        String eleccion;

        System.out.println("Escoja entre 'a' o 'b'");
        eleccion = sc.nextLine();

        if(eleccion.equals("a")){
            System.out.println("De la cadena "+ Arrays.toString(a)+ ". El programa ha escogido " +aleatorioDeArray(a));
        } else if (eleccion.equals("b")){
            System.out.println("De la cadena "+ Arrays.toString(b)+ ". El programa ha escogido " +aleatorioDeArray(b));
        }
    }
    public static int aleatorioDeArray(int[] a){
        int result = 0;
        int pos = (int) (Math.random()*(a.length-0)+0);

        for (int i = 0; i < a.length; i++) {
            if(i == pos){
                result = a[i];
            }
        }
        return result;
    }
}
