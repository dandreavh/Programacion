package com.company;

public class Ej7411 {
    // Crea un programa que cree un array de 5x5 caracteres, lo rellene con puntos en todas las posiciones excepto
    // aquellas en las que el número de fila es igual al número de columna, en las que pondrá un X. (Diagonal)
    public static void main(String[] args) {
        String[][] cadena = new String[5][5];

        for (int i = 0; i < cadena.length; i++) {
            for (int j = 0; j < cadena[i].length; j++) {
                if(i==j){
                    System.out.print("X");
                } else{
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
