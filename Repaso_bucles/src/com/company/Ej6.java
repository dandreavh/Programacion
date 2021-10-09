package com.company;

public class Ej6 {
    //Actividad8-6: Escribir todos los múltiplos de 7 menores que 100.
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i%7==0){
                System.out.println(i);
            }
        }
    }
}
