package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inicio aplicación");

        System.out.println("++++++++++++++++++++++++ Primera consulta ++++++++++++++++++++++++");
        Consultas.empleadosOficinaMayor();
        System.out.println("++++++++++++++++++++++++ Segunda consulta ++++++++++++++++++++++++");
        Consultas.productosNoVendidos();
        System.out.println("++++++++++++++++++++++++ Tercera consulta ++++++++++++++++++++++++");
        Consultas.informeCategoria();

        System.out.println("------------------ TRANSACCIONES ------------------");
        System.out.println("++++++++++++++++++++++++ Primera transacción ++++++++++++++++++++++++");
        Transacciones.insert1();
        System.out.println("++++++++++++++++++++++++ Segunda transacción ++++++++++++++++++++++++");
        Transacciones.insert2();
    }
}