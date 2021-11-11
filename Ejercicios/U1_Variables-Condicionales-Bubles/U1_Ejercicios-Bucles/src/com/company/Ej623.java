package com.company;

public class Ej623 {
    public static void main(String[] args) {
        int num = 5, multiplicadores = 0;

        do{
            System.out.println(num + " x " + multiplicadores + " = " + (num*multiplicadores));
            multiplicadores++;
        } while (multiplicadores<=10);
    }
}
