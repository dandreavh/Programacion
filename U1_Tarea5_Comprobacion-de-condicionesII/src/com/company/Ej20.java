package com.company;

import java.util.Scanner;

public class Ej20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float base, totalIva = 0, totalDesc = 0;
        String iva, codProm;

        System.out.println("Indique la base imponible");
        base = sc.nextFloat();
        sc.nextLine();
        System.out.println("Indique el iva a aplicar: general, reducido o superreducido");
        iva = sc.nextLine();
        System.out.println("Indique el código de descuento: nopro, mitad, meno5 o 5porc");
        codProm = sc.nextLine();

        switch (iva){
            case "general":
                totalIva = (base*21)/100;
                break;
            case "reducido":
                totalIva = (base*10)/100;
                break;
            case "superreducido":
                totalIva = (base*4)/100;
                break;
            default:
                System.out.println("IVA inválido");
        }

        System.out.println("Total IVA = " + totalIva + " €");

        System.out.println("Total del precio con IVA y sin descuentos = " + (totalIva+base) + " €");

        switch (codProm){
            case "nopro":
                totalDesc = 0;
                break;
            case "mitad":
                totalDesc = base/2;
                break;
            case "meno5":
                totalDesc = base-5;
                break;
            case "5porc":
                totalDesc = base - 5*100;
                break;
            default:
                System.out.println("Descuento no válido");
        }

        System.out.println("Total Descuentos = " + totalDesc + " €");
        System.out.println("TOTAL del precio con IVA y con descuentos = " + ((totalIva+base)-totalDesc) + " €");
    }
}
