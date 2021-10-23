package com.company;

import java.util.Scanner;

public class Ej3 {
    // Realiza un programa que calcule el precio de unas entradas de cine en función del número de personas y del día
    // de la semana. El precio base de una entrada son 8 euros. El miércoles (día del espectador),
    // el precio base es de 5 euros. Los jueves son el día de la pareja, por lo que
    // la entrada para dos cuesta 11 euros.
    // Con la tarjeta CineCampa se obtiene un 10% de descuento. Si un jueves, un grupo de 6 personas compran entradas,
    // el precio total sería de 33 euros ya que son 3 parejas; pero si es un grupo de 7,
    // pagarán 3 entradas de pareja más 1 individual que son 41 euros (33 + 8).
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float precioEntradas = 0;
        int numPersonas;
        String dia;
        String tarjeta;
        final int PRECIO_BASE = 8;
        final int PRECIO_MIERCOLES = PRECIO_BASE-3;
        final int PRECIO_PAREJAS_JUEVES = 11;
        float descuento = 0;
        float totalPagar;

        System.out.println("VENTA DE ENTRADAS");
        System.out.println("Número de entradas:");
        numPersonas = sc.nextInt();
        System.out.println("Día de la semana:");
        dia = sc.nextLine();
        sc.nextLine();
        System.out.println("¿Tiene tarjeta CineCampa?: (s/n)");
        tarjeta = sc.nextLine();

        if(dia.equals("miercoles")){
            precioEntradas=(PRECIO_MIERCOLES*numPersonas);
        } else if(dia.equalsIgnoreCase("jueves")){
            if(numPersonas%2==0){
                precioEntradas = (numPersonas/2)*PRECIO_PAREJAS_JUEVES;
            } else{
                precioEntradas = (PRECIO_BASE + ((numPersonas-1)/2)*PRECIO_PAREJAS_JUEVES);
            }
        } else{
            precioEntradas = PRECIO_BASE*numPersonas;
        }

        if(tarjeta.equalsIgnoreCase("s")){
            descuento = (precioEntradas*10)/100;
            totalPagar = precioEntradas-descuento;
        } else{
            totalPagar = precioEntradas;
        }

        System.out.println("Aquí tiene sus entradas. Gracias por su compra");
        System.out.println("Cantidad de entradas: " + numPersonas);
        System.out.println("Total: " + precioEntradas);
        System.out.println("Tarjeta: " + tarjeta);
        System.out.println("Descuento: " + descuento);
        System.out.println("Total a pagar: " + totalPagar);

    }
}
