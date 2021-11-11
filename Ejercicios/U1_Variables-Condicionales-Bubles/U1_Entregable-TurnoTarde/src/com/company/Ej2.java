package com.company;

import java.util.Scanner;

public class Ej2 {
    // Escribe un programa que solicite al usuario los siguientes números:
    //  • Un número entero positivo
    //  • Un número entre Oy 2 (ambos inclusive)
    // Una vez introducidos los dos números nos debe construir un número
    // saltando las cifras según indique el segundo número.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numEntero, salto, contador=1, resultado, vuelta=0, numSolo=0, vueltaFinal=0;

        do {
            System.out.println("Escriba un número entero positivo");
            numEntero = sc.nextInt();
            System.out.println("Escriba un número entre 0 y 2 para los saltos");
            salto = sc.nextInt();
        } while (numEntero<0 || (salto<0 || salto>2));

        while(numEntero>0){
            numSolo = numEntero%10;
            vuelta = vuelta*10+numSolo;
            numEntero /= 10;
        }
        if(salto==0){
            System.out.println("No se ha realizado ningún salto, su número queda: " + numEntero);

        } else if(salto==1){
            while(vuelta>0){
                if(contador!=salto){
                    contador=1;
                } else{
                    numSolo = vuelta%10;
                    vueltaFinal = vueltaFinal*10+numSolo;
                    contador--;
                }
                vuelta /=10;
            }
            System.out.println("Su número con un salto queda: " + vueltaFinal);

        } else if(salto==2){
            while(vuelta>0){
                if(contador==1){
                    numSolo = vuelta%10;
                    vueltaFinal = vueltaFinal*10+numSolo;
                    contador++;
                } else if(contador==2){
                    contador++;
                } else if(contador==3){
                    contador=1;
                }
                vuelta /=10;
            }
            System.out.println("Su número con dos saltos queda: " + vueltaFinal);
        }

    }
}
