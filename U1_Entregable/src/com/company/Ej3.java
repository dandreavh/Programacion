package com.company;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        final int PRECIO_BASE = 8;
        final int PRECIO_MIERCOLES = PRECIO_BASE-3;
        int entradaIndividual = 0;
        int entradasParejas = 0;
        int cantEntradas;
        int precioEntradas;
        float descuento;
        float total;
        String dia;
        String tarjeta;

        System.out.println("Venta de entradas CineCampa");
        System.out.println("Número de entradas: ");
        cantEntradas = sc.nextInt();
        System.out.println("Día de la semana: ");
        dia = sc.nextLine();
        sc.nextInt();
        System.out.println("¿Tiene tarjeta CineCampa? (s/n): ");
        tarjeta = sc.nextLine();



        if(dia.equalsIgnoreCase("miercoles")){

            precioEntradas = cantEntradas*PRECIO_MIERCOLES;

        } else if (dia.equalsIgnoreCase("jueves")){

            if(cantEntradas%2==0){
                precioEntradas = cantEntradas*11;
            }else{
                entradasParejas = cantEntradas-1;
                entradaIndividual = 1;
                precioEntradas = (entradasParejas*11)+(entradaIndividual*PRECIO_BASE);
            }

        } else{
            precioEntradas = cantEntradas*PRECIO_BASE;
        }

        if(tarjeta.equalsIgnoreCase("s")){
            descuento = (precioEntradas*10)/100;
            total = precioEntradas-descuento;
        } else{
            descuento = 0;
            total = precioEntradas;
        }

        System.out.println("Venta de entradas CineCampa");
        System.out.println("Número de entradas: " + cantEntradas);
        System.out.println("Día de la semana: " + dia);
        System.out.println("¿Tiene tarjeta CineCampa? (s/n): " + tarjeta);
        System.out.println("Aquí tienes sus entradas. Gracias por su compra.");
        System.out.println("Total " + precioEntradas);
        System.out.println("Descuento " + descuento);
        System.out.println("Total a pagar " + total);



    }
}
