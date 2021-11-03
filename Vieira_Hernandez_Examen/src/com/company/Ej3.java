package com.company;

import java.util.Scanner;

public class Ej3 {
    // Realiza un programa que muestre al azar el nombre de una carta de la baraja francesa.
    // Esta baraja está dividida en cuatro palos: picas, corazones, diamantes y tréboles.
    // Cada palo está formado por 13 cartas, de las cuales 9 cartas son numerales y 4
    // literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el 1).
    // Deberemos por tanto generar de manera aleatoria primero el palo y posteriormente la carta perteneciente al plo.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String carta="", palo="";
        int numeroRandom, paloRandom;

        numeroRandom = (int) (Math.random() * 14);

        if(numeroRandom==1 || numeroRandom>10){
            if(numeroRandom==1){
                carta="A";
            } else if (numeroRandom==11){
                carta ="J";
            } else if (numeroRandom==12){
                carta ="Q";
            } else if (numeroRandom==13){
                carta ="K";
            }
        } else{
            carta= String.valueOf(numeroRandom);
        }

        paloRandom = (int) (Math.random() * 5);
        if(paloRandom==1){
            palo = "Picas";
        } else if(paloRandom ==2){
            palo = "Corazones";
        } else if(paloRandom ==3){
            palo = "Diamantes";
        } else if(paloRandom ==4){
            palo = "Tréboles";
        }

        System.out.println("Su carta al azar es: " + carta+ " (carta) de " +palo+ " (palo)");



    }
}
