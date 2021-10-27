package com.company;

public class Actividad11 {
    //Actividad 11: Realizar una función que calcule a elevado a n, donde a es real,
    // y n entero no negativo. Realizar una versión iterativa y otra recursiva.
    public static void main(String[] args) {
        double num = 2.5;
        int elevado = 5;

        System.out.println("El valor calculado de forma iterativa " +calculoIterativo(num, elevado));
        System.out.println("El valor calculado de forma recursiva " +calculoRecursivo(num, elevado));
    }

    public static double calculoIterativo(double num, int elevado) {
       double resultado = 1;
       while (elevado>0){
           resultado *= num;
           elevado--;
       }
       return resultado;
    }
// resultado = Math.pow(num,elevado);
    public static double calculoRecursivo(double num, int elevado) {
       if (elevado==0){
           return 1.0;
       } else{
           return (num*calculoRecursivo(num, elevado-1));
       }
    }
}
