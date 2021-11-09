package com.company;

import java.util.Scanner;

public class Actividad3 {
    //Actividad 3: Realizar una función que calcule y muestre el área o el volumen de un cilindro,
    // según se especifique. Para distinguir un caso de otro se le pasará un número 1 (para área) o 2 (para volumen).
    // Además, hemos de pasarle a la función el radio de la base y la altura.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float base;
        float altura;
        int caso;

        System.out.println("Indique la base del cilindro");
        base = sc.nextFloat();
        System.out.println("Indique la altura del cilindro");
        altura = sc.nextFloat();
        System.out.println("Indique 1 (para área) o 2 (para volumen)");
        caso = sc.nextInt();

        calculos(caso, altura, base);
    }

    public static void calculos(int caso, float altura, float base) {
        if (caso==1){
            // 2*pi*r(h+r)
            Double area = 2*Math.PI*base*(altura+base);
            System.out.println("El área del cilindro es de " + area);
        } else if (caso==2){
            //pi*rcuadrado*h
            Double volumen = Math.PI*Math.pow(base,2)*altura;
            System.out.println("El volumen del cilindro es de " + volumen);
        } else{
            System.out.println("Operación incorrecta");
        }
    }
}
