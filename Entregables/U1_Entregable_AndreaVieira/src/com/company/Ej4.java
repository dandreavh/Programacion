package com.company;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num;
        int grupos;
        int n = 0;
        boolean esPrimo = true;

        do{
            System.out.println("Introduzca un número");
            num = sc.nextLine();
        } while (num.length()%2!=0);

        for (int i = 0; i < num.length(); i++) {
            if(num.length()<1){
                esPrimo = true;
                n = Integer.parseInt(num);
                for (int j = 2; j < n; j++) {
                    if(n%j==0){
                        esPrimo = false;
                        System.out.println(n + " no es primo" );
                        break;
                    } else{
                        esPrimo = true;
                        System.out.println(n + " es primo" );
                    }
                }
            } else{
                n = Integer.parseInt(num);
                grupos = n%100;
                while (grupos>0){
                    for (int j = 2; j < grupos; j++) {
                        if(grupos%j==0){
                            esPrimo = false;
                            System.out.println(grupos + " no es primo" );
                            break;
                        } else{
                            esPrimo = true;
                            System.out.println(grupos + " es primo" );
                        }

                    }
                    grupos /=100;
                }

            }


        }

    }
}
