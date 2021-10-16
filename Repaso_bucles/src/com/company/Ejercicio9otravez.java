package com.company;

import java.util.Scanner;

public class Ejercicio9otravez {
    //Actividad8-9: Un centro de investigación necesita una aplicación que muestre cual es el árbol más alto.
    // Para ello se introducirán por teclado las alturas en cms de cada árbol, terminando cuando se introduzca -1.
    // Los árboles se identifican mediante etiquetas con números correlativos, comenzando en 0.
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float altura;
        float altura_mayor = 0;
        int etiqueta = 0;
        int etiqueta_mayor = 0;

        do {
            System.out.println("Escriba la altura de un árbol "+ etiqueta);
            altura = sc.nextFloat();

            if(altura>altura_mayor){
                altura_mayor = altura;
                etiqueta_mayor = etiqueta;
            }
            etiqueta++;

        } while (altura!=-1);
        System.out.println("El árbol más alto tiene la etiqueta " + etiqueta_mayor + " y mide " + altura_mayor + "cms.");

//        System.out.println("Escriba la altura de un árbol" + etiqueta);
//        altura = sc.nextFloat();
//        altura_mayor = altura;
//
//
//
//        while (altura!=-1){
//            System.out.println("Escriba la altura de un árbol"+ etiqueta);
//            altura = sc.nextFloat();
//
//            if(altura>altura_mayor){
//                altura_mayor = altura;
//                etiqueta_mayor = etiqueta;
//            }
//            etiqueta++;
//        }

    }


}
