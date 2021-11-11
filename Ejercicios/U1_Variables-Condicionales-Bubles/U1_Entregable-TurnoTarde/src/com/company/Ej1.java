package com.company;

import java.util.Scanner;

public class Ej1 {
    //Dibuja por pantalla la palabra MY (en mayúsculas) hechas de asteriscos separadas por 4 espacios.
    // La anchura y altura de cada una de las letras deberá ser la misma.
    // Se solicitará al usuario una altura que deberá siempre impar y mayor que 3.
    // En caso de que el usuario no introduzca un valor correcto, se pedirá de nuevo la altura
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, anchura;

        do {
            System.out.println("Introduzca una altura");
            altura = sc.nextInt();
        } while (altura<3 || altura%2==0);

        anchura = altura*2+4;
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura ; j++) {
                if(j==0||j==altura-1||(i==j && i<=altura/2)||(i+j==altura-1 && i<=altura/2) ||
                        (j==(altura/2)+altura+4 && i>=altura/2)||(j+i==anchura-1 && i<=altura/2)||(j-i==altura+4 && i<=altura/2)){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
