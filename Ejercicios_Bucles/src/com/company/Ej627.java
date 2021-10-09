package com.company;

public class Ej627 {
    public static void main(String[] args) {
        int fila = 0, alto = 6, ancho = 1, columna = 0;

        do{
            columna = 0;
            while (columna<ancho){
                System.out.print("*");
                columna++;
            }
            System.out.println();
           ancho++;
           fila++;
        } while(fila<alto);
    }
}
