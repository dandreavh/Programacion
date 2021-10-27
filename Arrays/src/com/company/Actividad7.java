package com.company;

public class Actividad7 {
    //Actividad 7: Diseñar una función que nos diga si un número es primo.
    public static void main(String[] args) {
        int num = 11;
        System.out.println(num+ " ¿es primo? " + esPrimo(num));
    }

    public static boolean esPrimo(int num) {
        boolean primo = true;
        for (int i = 2; i < num; i++) {
            primo = true;
            if(num%i==0){
               primo = false;
                break;
            } else{
                primo = true;
            }
        }
        return primo;
    }
}
