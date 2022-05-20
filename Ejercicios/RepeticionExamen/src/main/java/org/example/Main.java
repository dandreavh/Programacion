package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Primera consulta");
        //System.out.println(Consultas.getProductLines());

        System.out.println("Segunda consulta");
        //Consultas.categoriaMasVendida();

        System.out.println("Transacción");
        Transacciones.insertarPedido();

    }
}