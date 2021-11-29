package com.company;

import java.util.Arrays;

public class Ej1_EntregableManana {
    // Define la función mezcla con la siguiente cabecera: public static int[] mezcla(int[] a, int[] b)
    // Esta función toma dos vectores como parámetros y devuelve un array que es el resultado de mezclar los números
    // de ambos de forma alterna, se coge un número de a, luego de b, luego de a, etc. Los vectores y b pueden tener
    // longitudes diferentes; por tanto, si se terminan los números de un array se terminan de coger todos los que
    // quedan del otro.
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        int[] b = {98,87,76,65,54,43,32,21};

        System.out.println("La combinación de a " + Arrays.toString(a)+ " y de b " +Arrays.toString(b)+ " da lugar a " +mezcla(a,b));

    }
    public static int[] mezcla(int[] a, int[] b){
        int[] resultado = new int[a.length+ b.length];
        int pos = 0;
        int tamMenor = (a.length>b.length ? b.length : a.length); // Si a > b, entonces b = tamMenor, si no a = tamMenor

        for (int i = 0; i < tamMenor; i++) { // Se recorre hasta el tamaño del menor
            resultado[pos] = a[i]; // primero meto lo de a
            pos++; // aumenta la posición para poder meter el número de b en el siguiente
            resultado[pos] = b[i]; //  ahora meto lo de b
            pos++;
            // cuando se acabe el recorrido habremos llegado gasta el tamaño del que sea menor y ahora nos toca añadir el resto
        }

        int[] vMayor = (a.length>b.length ? a : b); // escogemos el tamaño del más grande

        for (int i = tamMenor; i < vMayor.length ; i++) { // vamos a recorrer desde el tamaño del menor (xq hasta ahí lo tenenos, hasta lo que falta
            resultado[pos] = vMayor[i]; // al resultado que teníamos antes en la siguiente posición vamos a meter lo que falta
            pos++;
        }

        return resultado;
    }
}
