package com.company;

import java.util.Scanner;

public class Entregable1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota1 , nota2, nota3;
        float media;
        String recuperacion;

        System.out.println("Escriba la primera nota");
        nota1 = sc.nextInt();
        System.out.println("Escriba la segunda nota");
        nota2 = sc.nextInt();
        System.out.println("Escriba la tercera nota");
        nota3 = sc.nextInt();

        media = (nota1 + nota2 + nota3) / 3;

        if(media<5){
            System.out.println("Ha suspendido. ¿Cuál ha sido el resultado de la recuperación? (apto o no apto)");
            sc.nextInt();
            recuperacion = sc.nextLine();
            if (recuperacion.equalsIgnoreCase("Apto")){
                System.out.println("Tu media es de un 5 - Suficiente");
            } else{
                System.out.println("Tu media es de un " + media + " - Insuficiente");
            }

        }else{
            if(media>=5 || (media==5 && media<6)){
                System.out.println("Su media es de un " + media + " - Suficiente");
            } else if (media>=6 && media<7){
                System.out.println("Su media es de un " + media + " - Bien");
            } else if (media>=7 && media<9) {
                System.out.println("Su media es de un " + media + " - Notable");
            } else {
                System.out.println("Su media es de un " + media + " - Sobresaliente");
            }
        }

    }
}
