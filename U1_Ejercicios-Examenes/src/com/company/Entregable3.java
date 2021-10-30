package com.company;

import java.util.Scanner;

public class Entregable3 {
    public static void main(String[] args) {
        //convertir en binario
        Scanner sc = new Scanner(System.in);
        int num;
        String numBinario = "";
        int resto;
        int cociente;

        System.out.println("Escribe un número");
        num = sc.nextInt();
        cociente = num;

        while (num>=2){
            resto = num%2;
            num /= 2;
            numBinario =  resto + numBinario;
        }

        System.out.println("Su número en binario es " + (num+numBinario));
    }
}
