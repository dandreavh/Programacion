package com.company;

import java.util.Scanner;

public class Ej21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte cargo, estadoCivil;
        int diasOut, pagoDias;
        float irpf, sueldoGeneral = 0, sueldoTotal = 0;

        System.out.println("Cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe de proyecto)");
        cargo = sc.nextByte();
        System.out.println("Días que ha estado de viaje visitando clientes");
        diasOut = sc.nextInt();
        System.out.println("Introduzca su estado civil (1 - Soltero, 2 - Casado)");
        estadoCivil = sc.nextByte();

        if (cargo == 1){
            sueldoGeneral = 950;
        } else if (cargo == 2){
            sueldoGeneral = 1200;
        } else if (cargo == 3){
            sueldoGeneral = 1600;
        }

        System.out.println("Sueldo base = " + sueldoGeneral);

        pagoDias = diasOut*30;

         float sueldoBruto = sueldoGeneral + pagoDias;

        if (estadoCivil == 1){
            irpf = 25*sueldoBruto/100;
            System.out.println("Cantidad IRPF = " + irpf );
            sueldoTotal = sueldoBruto-irpf;
        } else if (estadoCivil == 2){
            irpf = 20*sueldoBruto/100;
            System.out.println("Cantidad IRPF = " + irpf );
            sueldoTotal = sueldoBruto-irpf;
        }

        System.out.println("Pago días extra = " + pagoDias);
        System.out.println("TOTAL sueldo =" + sueldoTotal);



    }
}
