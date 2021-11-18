package com.company;

public class Ej7410 {
    //  Crea un programa que cree un array de 5x5 caracteres, lo rellene con puntos, excepto la segunda fila,
    //  que estará rellena de letras "A" y luego muestra el contenido del array en pantalla. Deberá aparecer algo como:
    public static void main(String[] args) {
        String[][] cadena = new String[5][5];

        for (int i = 0; i < cadena.length; i++) { // filas
            for (int j = 0; j < cadena[i].length; j++) { //columnas
                if(i==1){
                    System.out.print("A");
                } else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}
