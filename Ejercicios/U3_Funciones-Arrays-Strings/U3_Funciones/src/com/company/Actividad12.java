package com.company;

public class Actividad12 {
    //Actividad 12: Calcular el factorial de n recursivamente. Recordar que por definición, el factorial de 0 es 1.
    public static void main(String[] args) {
        int num =5;
        System.out.println("El factorial de " +num+ " es " +factorial(num));
    }

    private static int factorial(int num) {
        if(num==0){
            return 1;
        } else{
            return (num*factorial(num-1));
        }
    }
}
