package com.company;

import java.util.Scanner;

public class Ej22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double altura, anchura, alt_anch, precio_bandera, total;
        boolean bordado;
        final double ESCUDO = 2.50, ENVIO = 3.25, CENT_CUADR = 0.01;

        System.out.println("Introduzca la altura de la bandera en cm:");
        altura = sc.nextDouble();
        System.out.println("Ahora introduzca la anchura:");
        anchura = sc.nextDouble();
        System.out.println("¿Quiere escudo bordado? (s/n):");
        bordado = sc.nextBoolean();

        alt_anch = altura*anchura;
        precio_bandera = alt_anch*CENT_CUADR;

        if (bordado){
            total = precio_bandera + ESCUDO + ENVIO;
        } else{
            total = precio_bandera + ENVIO;
        }

        System.out.println();



    }
}
