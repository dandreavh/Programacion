package com.company;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int combi = 1234;
        int combi_user = 0;
        int oportunidad = 4;

        do {
            if (oportunidad<=4){
                oportunidad--;
                System.out.println("Escriba una combinación para abrir la caja fuerte");
                combi_user = sc.nextInt();

                if(combi_user==combi){
                    System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                } else{
                    System.out.println("Lo siento,esa no es la combinación. Oportunidades: " + oportunidad);
                    if(oportunidad==0){
                        System.out.println("Se han agotado las oportunidades");
                        break;
                    }

                }
            }

        } while (combi_user!=combi && oportunidad>0);
    }
}
