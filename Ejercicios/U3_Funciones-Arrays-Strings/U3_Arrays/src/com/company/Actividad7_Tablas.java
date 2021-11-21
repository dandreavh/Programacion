package com.company;

import java.util.Scanner;

public class Actividad7_Tablas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] notasPrimerTrim = new int[5];
//        int[] notasSegundoTrim = new int[5];
//        int[] notasTercerTrim = new int[5];
//        float mediaTrimGrupo = 0;
//
//
//        for (int i = 0; i < notasPrimerTrim.length; i++) {
//            System.out.println("Introduzca las notas del primer trimestre");
//            notasPrimerTrim[i] = sc.nextInt();
//            mediaTrimGrupo += notasPrimerTrim[i];
//        }
//        System.out.println("Media primer trimestre: " +mediaTrimGrupo/5);
//
//        mediaTrimGrupo = 0;
//        for (int i = 0; i < notasSegundoTrim.length; i++) {
//            System.out.println("Introduzca las notas del segundo trimestre");
//            notasSegundoTrim[i] = sc.nextInt();
//            mediaTrimGrupo += notasSegundoTrim[i];
//        }
//        System.out.println("Media segundo trimestre: " +mediaTrimGrupo/5);
//
//        mediaTrimGrupo = 0;
//        for (int i = 0; i < notasTercerTrim.length; i++) {
//            System.out.println("Introduzca las notas del tercer trimestre");
//            notasTercerTrim[i] = sc.nextInt();
//            mediaTrimGrupo += notasTercerTrim[i];
//        }
//        System.out.println("Media tercer trimestre: " +mediaTrimGrupo/5);
//
//        // hay que ponerlo con una posicion que se pida
//
//        System.out.println("Media del primer alumno: " +((notasPrimerTrim[0]+notasSegundoTrim[0]+notasTercerTrim[0])/3));
//        System.out.println("Media del segundo alumno: " +((notasPrimerTrim[1]+notasSegundoTrim[1]+notasTercerTrim[1])/3));
//        System.out.println("Media del tercer alumno: " +((notasPrimerTrim[2]+notasSegundoTrim[2]+notasTercerTrim[2])/3));
//        System.out.println("Media del cuarto alumno: " +((notasPrimerTrim[3]+notasSegundoTrim[3]+notasTercerTrim[3])/3));
//        System.out.println("Media del quinto alumno: " +((notasPrimerTrim[4]+notasSegundoTrim[4]+notasTercerTrim[4])/3));


        int[][] datos = new int [5][3];
        String[] nombres = {"Rosa", "Pedro", "Luis", "Juan", "Ana"};
        float suma = 0;

        for (int i = 0; i < datos.length; i++) { //filas
            System.out.println("Introduzca las notas por trimestre de " +nombres[i]);
            for (int j = 0; j < datos[i].length; j++) { //columnas
                System.out.println("Notas: ");
                datos[i][j] = sc.nextInt();
                suma += datos[i][j];
            }
        }

        float media = 0;
        for (int i = 0; i < datos.length; i++) {
            media = suma/3;
            System.out.println("La nota media de " +nombres[i]+ " es un " +media);
        }

    }
}
