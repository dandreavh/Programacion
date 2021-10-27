package com.company;

public class Actividad10 {
    //Actividad 10: Escribir una función que decida si dos números enteros positivos son amigos.
    // Dos números son amigos si la suma de los divisores propios (distinto de él mismo)
    // del primer número es igual al segundo número, y viceversa. Ejemplos: (220 - 284), (1184 - 1210)
    public static void main(String[] args) {
        int num1 = 254, num2 = 251;

        if(sonAmigos(num1, num2)){
            System.out.println(num1+ " y " +num2+ " son amigos");
        } else{
            System.out.println(num1+ " y " +num2+ " no son amigos");
        }
    }

    public static boolean sonAmigos(int num1, int num2) {
        int sumaDivisores1 = 0;
        int sumaDivisores2 = 0;

        for (int i = 1; i < num1; i++) {
            if(num1%i==0){
                sumaDivisores1 += i;
            }
        }
        for (int i = 1; i < num2; i++) {
            if(num2%i==0){
                sumaDivisores2 += i;
            }
        }

        System.out.println("Suma de los divisores del primer número " +sumaDivisores1);
        System.out.println("Suma de los divisores del segundo número " +sumaDivisores2);

        if(sumaDivisores1==num2 && sumaDivisores2==num1){
            return true;
        }
        return false;
    }
}
