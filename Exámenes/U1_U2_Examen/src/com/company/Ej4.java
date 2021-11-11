package com.company;

import java.util.Scanner;

public class Ej4 {
    // La tienda online BanderaDeEspaña.es vende banderas personalizadas de la máxima calidad y
    // nos ha pedido hacer un configurador que calcule el precio
    //según el alto y el ancho. El precio base de una bandera es de un céntimo de euro el centímetro cuadrado.
    // Si la queremos con un escudo bordado, el precio
    //se incrementa en 2.50 € independientemente del tamaño.
    // Los gastos de envío son 3.25 €. El IVA ya está incluido en todas las tarifas.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double altura, anchura, tamBandera, subtotal, precioBase =0.01, precioEscudo=2.50, envio = 3.25;
        String bordado;

        System.out.println("Introduzca la altura de la bandera en cm: ");
        altura = sc.nextDouble();
        System.out.println("Ahora introduzca la anchura: ");
        anchura = sc.nextDouble();
        sc.nextLine();
        System.out.println("¿Quiere bordado? (s/n)");
        bordado = sc.nextLine();

        tamBandera = altura*anchura;
        subtotal = (tamBandera*precioBase);

        System.out.println("Gracias aquí tiene el desglose de su compra...");
        System.out.println("Bandera de " + tamBandera+ " cm2: " + subtotal+ "€");

        if(bordado.equals("s")){
            subtotal += precioEscudo +envio;
            System.out.println("Con escudo: " +precioEscudo+ "€");
            System.out.println("Gastos de envío: " +envio+ "€");
            System.out.println("Total: " +subtotal+ "€");
        } else{
            System.out.println("Con escudo " +precioEscudo+ "€");
            subtotal += envio;
            System.out.println("Sin escudo: 0,00€");
            System.out.println("Gastos de envío " +envio+ "€");
            System.out.println("Total " +subtotal+ "€");
        }

    }
}
