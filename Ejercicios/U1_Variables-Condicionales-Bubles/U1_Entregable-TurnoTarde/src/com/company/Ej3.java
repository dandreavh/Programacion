package com.company;

import java.util.Scanner;

public class Ej3 {
    // La hamburguesería Pitanza Feliz quiere se informatice su empresa.
    // Realiza un programa que calcule el precio de unos pedidos en función del número de hamburguesas y del día en el que se haga.
    // El precio de la hamburguesa básica con los ingredientes mínimos (pan, carne, queso) es de 3 euros.
    // La hamburguesa gourmet cuesta 5 euros, porque tiene carne de Waygu, pan artesano y queso de oveja.
    // Los martes locos de Pitanza Feliz, un pedido de dos gourmet cuesta 9 euros, y
    // los miércoles de desmadre,la hamburguesa básica cuesta 2 euros.
    // Perteneciendo al club Fanegas de Pitanza Feliz, se obtiene un 12% de descuento sobre el precio final del pedido.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float precioPedido = 0, descuento, total, totalBurgerBasica, totalBurgerGourmet, totalBugerGourmetPromo, precioBurgerBasica=3, precioBurgerGourmet=5, promoX2Gourmet=9;
        int cantBurgerBasica, cantBurgerGourmet;
        String dia="", miembroClub="";

        System.out.println("Pedidos de Pitanza Feliz");
        System.out.println("Número de hamburguesas básicas");
        cantBurgerBasica = sc.nextInt();
        System.out.println("Número de hamburguesas gourmet");
        cantBurgerGourmet = sc.nextInt();
        sc.nextLine();
        System.out.println("Día de la semana");
        dia = sc.nextLine();
        System.out.println("¿Pertenece al club de Fanegas? (s/n)");
        miembroClub = sc.nextLine();

        if(dia.equals("martes")){
            totalBurgerBasica = cantBurgerBasica*precioBurgerBasica;
            totalBugerGourmetPromo = ((cantBurgerGourmet-1)*promoX2Gourmet)/2;

            if(cantBurgerGourmet%2!=0){
                precioPedido = precioBurgerGourmet+totalBugerGourmetPromo+totalBurgerBasica;
            } else{
                precioPedido = (cantBurgerGourmet*promoX2Gourmet)/2 + (cantBurgerBasica*precioBurgerBasica);
            }

        } else if (dia.equals("miercoles")){
            precioBurgerBasica = 2;
            totalBurgerBasica = cantBurgerBasica*precioBurgerBasica;
            totalBurgerGourmet = cantBurgerGourmet*precioBurgerGourmet;
            precioPedido = totalBurgerBasica+totalBurgerGourmet;

        } else{
            totalBurgerBasica = cantBurgerBasica*precioBurgerBasica;
            totalBurgerGourmet = cantBurgerGourmet*precioBurgerGourmet;
            precioPedido = totalBurgerBasica+totalBurgerGourmet;
        }

        System.out.println("Total: " + precioPedido);

        if(miembroClub.equals("s")){
            descuento = (precioPedido*12)/100;
            total = precioPedido - descuento;
            System.out.println("Descuento: " +descuento);
            System.out.println("A pagar: " +total);
        } else{
            total = precioPedido;
            System.out.println("Descuento: ninguno");
            System.out.println("A pagar: " +total);
        }




    }
}
