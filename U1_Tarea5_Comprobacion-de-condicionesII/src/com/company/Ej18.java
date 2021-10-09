package com.company;

import java.util.Scanner;

public class Ej18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nota1,nota2, media;
        String exRecu;

        System.out.println("Introduzca la nota del primer control");
        nota1 = sc.nextFloat();
        System.out.println("Introduzca la nota del segundo control");
        nota2 = sc.nextFloat();

        media = (nota1+nota2)/2;

        if (media>=5){
            System.out.println("Enhorabuena, has aprobado, tienes un " + media + " de nota media");
        } else{
            System.out.println("Has suspendido en la general. Indica si estás APTO o NO APTO en el examen de recuperación");
            sc.nextLine();
            exRecu = sc.nextLine();
            if (exRecu.equalsIgnoreCase("apto")){
                media = 5;
                System.out.println("El examen de recuperación ha sido APTO. Has aprobado, tienes un " + media);
            } else if (exRecu.equalsIgnoreCase("no apto")){
                System.out.println("Has suspendido también el examen de recuperación, tu media es de " + media);
            } else{
                System.out.println("Se ha equivocado, debe inidicar si es apto o no apto");
            }
        }
    }
}
