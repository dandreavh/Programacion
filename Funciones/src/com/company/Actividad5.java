package com.company;

import java.util.Scanner;

import static com.company.Actividad4.mayor;

public class Actividad5 {
    //Actividad 5: Repetir el ejercicio anterior con una versión que calcule el máximo de 3 números.
    // Piensa un poco, no hagas el algoritmo de comparación de los 3 números desde cero

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Escriba el primer número");
        num1 = sc.nextInt();
        System.out.println("Escriba el segundo número");
        num2 = sc.nextInt();
        System.out.println("Escriba el tercer número");
        num3 = sc.nextInt();

        System.out.println("El mayor es " + mayorDe3(num1, num2, num3));
    }

    public static int mayorDe3(int num1, int num2, int num3) {
        int mayor;
        if(num3>mayor(num1, num2)){
            mayor = num3;
        } else{
            mayor = mayor(num1, num2);
        }
        return mayor;
    }
}
