package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Consulta 1: ");
        System.out.println(Consultas.getProductLines());

        System.out.println("Consulta 2: ");
        Consultas.categoriaMasVendida();
    }
}