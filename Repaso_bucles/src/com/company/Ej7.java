package com.company;

public class Ej7 {
    // Actividad8-7: Diseñar un programa que muestre el producto de los 10 primeros números impares.
    public static void main(String[] args) {
        int producto = 1;
        for (int i = 0; i <= 10; i++) {
            if (i%2!=0){
                producto = i*producto;
                System.out.println(i);
            }
        }
        System.out.printf("El producto de los 10 primeros impares es " + producto);
    }
}
