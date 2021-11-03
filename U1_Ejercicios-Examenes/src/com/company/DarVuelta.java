package com.company;
import java.util.Scanner;

public class DarVuelta {
    // Realizar un programa que  solicite al usuario un número entero y que lo siga solicitando mientras
    // ese número no sea positivo.
    // Una vez hecho esto solicitará al usuario una posición de inicio y una posición de final y
    // mostrará el número habiéndole quitado todos los dígitos entre esas dos posiciones.
    // (Supondremos que el usuario es "bueno" y mete correctamente las posiciones y que la primera posición es la posición 0.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, inicio, fin, aux = 0, posicion= 0;

        do{
            System.out.println("Introduzca un número");
            num = sc.nextInt();
        } while (num<0);

        System.out.println("Introduzca una posición de inicio");
        inicio = sc.nextInt();
        System.out.println("Introduzca un final");
        fin = sc.nextInt();

        while(num>0){
            aux = (num%10) + aux*10;
            num /=10;
        }

        num = aux;
        aux = 0;
        System.out.println(num);

        while(num>0){
            if(posicion<inicio || posicion>fin){
                aux = (num%10) + aux*10;
            }
            posicion++;
            num /=10;
        }

        System.out.println(aux);
    }
}
