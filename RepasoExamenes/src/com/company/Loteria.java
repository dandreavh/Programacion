package com.company;

import java.util.Scanner;

public class Loteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3, numLoteria, cantIguales =0, cantCifras = 0;

        System.out.println("Introduzca el primer número");
        num1 = sc.nextInt();
        System.out.println("Introduzca el segundo número");
        num2 = sc.nextInt();
        System.out.println("Introduzca el tercer número");
        num3 = sc.nextInt();
        System.out.println("Introduzca el número de la lotería");
        numLoteria = sc.nextInt();

        while(numLoteria>0){
            if (numLoteria%10==num1||numLoteria%10==num2||numLoteria%10==num3){
                cantIguales++;
            }
            cantCifras++;
            numLoteria/=10;
        }

        if(cantIguales>(cantCifras-cantIguales)){ // IMPORTANTE LEER EL ENUNCIADO
            System.out.println("Esos números le darán suerte");
        } else{
            System.out.println("Esos números no le van a dar suerte");
        }
    }
}
