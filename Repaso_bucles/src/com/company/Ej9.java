package com.company;

import java.util.Scanner;

public class Ej9 {
    //Actividad8-9: Un centro de investigación necesita una aplicación que muestre cual es el árbol más alto.
    // Para ello se introducirán por teclado las alturas en cms de cada árbol, terminando cuando se introduzca -1.
    // Los árboles se identifican mediante etiquetas con números correlativos, comenzando en 0.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float altura;
        int contador = 0;        //AUXILIARES

        System.out.println("Introduzca una altura en cms");
        altura = sc.nextFloat();

        float max = altura;
        int etiqueta = contador;

        while (altura!=-1){
            if(altura<-1){
              System.out.println("Altura incorrecta");
              continue;
            }

            if (altura>max){
                max = altura;
                etiqueta = contador;
                contador++;
            }
            System.out.println("Altura: " + altura + " Etiqueta: " + contador);
            System.out.println("Introduzca otra altura en cms");
            altura = sc.nextFloat();
        }

        System.out.println("El árbol con altura más alta es de " + max +" con la etiqueta " + etiqueta);

    }
}
