package com.company;

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nota1, nota2, nota3, media;

        System.out.println("Introduzca la primera nota");
        nota1 = sc.nextFloat();
        System.out.println("Introduzca la segunda nota");
        nota2 = sc.nextFloat();
        System.out.println("Introduzca la tercera nota");
        nota3 = sc.nextFloat();

        media = (nota1+nota2+nota3)/3;

        if (media<5 && media>=0){
            System.out.println("Insuficiente, su media es de un " + media);
        } else if (media==5 && media<6){
            System.out.println("Suficiente, su media es de un " + media);
        } else if (media>6 && media<=7){
            System.out.println("Bien, su media es de un " + media);
        } else if (media>=7 && media<9){
            System.out.println("Notable, su media es de un " + media);
        } else if (media>=9 && media<=10){
            System.out.println("Sobresaliente, su media es de un " + media);
        } else{
            System.out.println("No es posible hacer su media con esos datos");
        }
    }
}
