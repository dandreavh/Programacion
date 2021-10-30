package com.company;

import java.util.Scanner;

public class Ej4Rojo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte cargo;
        byte estadoCivil;
        byte diasFuera;
        float sueldoBruto = 0;
        float sueldoNeto;
        int pagoTotalDiasFuera = 0;
        float retencion_irpf = 0;
        final int IRPF_SOLTEROS = 25;
        final int IRPF_CASADOS = 20;
        final int BASE_DIAS_FUERA = 30;

        System.out.println("Indique su cargo: 1 - Prog. junior, 2 - Prog. senior, 3 - Jefe de proyecto");
        cargo = sc.nextByte();
        System.out.println("Indique su estado civil: 1 - Soltero, 2 - Casado");
        estadoCivil = sc.nextByte();
        System.out.println("Indique la cantidad de días que ha estado de viaje visitando clientes durante el mes");
        diasFuera = sc.nextByte();

        switch (cargo){
            case 1:
                sueldoBruto = 950;
                break;
            case 2:
                sueldoBruto = 1200;
                break;
            case 3:
                sueldoBruto = 1600;
                break;
            default:
                System.out.println("Dato erróneo");
        }
        System.out.println("Sueldo base: "+ sueldoBruto);

        if(diasFuera>0){
            pagoTotalDiasFuera = diasFuera*BASE_DIAS_FUERA;
            sueldoBruto += pagoTotalDiasFuera;
        }
        System.out.println("Dietas de " + diasFuera + " días fuera: " + pagoTotalDiasFuera);
        System.out.println("Sueldo bruto: " + sueldoBruto);
        
        if(estadoCivil==1){
            retencion_irpf = (IRPF_SOLTEROS*sueldoBruto)/100;
        } else if(estadoCivil==2){
            retencion_irpf = (IRPF_CASADOS*sueldoBruto)/100;
        }
        System.out.println("Retención IRPF: " + retencion_irpf);

        sueldoNeto = sueldoBruto-retencion_irpf;
        System.out.println("Sueldo neto: " + sueldoNeto);

    }
}
