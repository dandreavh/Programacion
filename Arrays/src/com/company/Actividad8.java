package com.company;

import static com.company.Actividad7.esPrimo;

public class Actividad8 {
    //Actividad 8: Escribir una función a la que se le pase un número entero
    //y devuelva el número de divisores primos que tiene.
    public static void main(String[] args) {
        int num = 24;

        System.out.println(num+ " tiene " +cantidadDivisoresPrimos(num)+ " divisores primos");
    }

    public static int cantidadDivisoresPrimos(int num) {
        int cantDivPrimos =0;
        for (int i = 1; i <= num; i++) {
          if(num%i==0 && esPrimo(i)){
              cantDivPrimos++;
              System.out.println(i);
          }
        }
        return cantDivPrimos;
    }
}
