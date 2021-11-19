package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad_3_extra {
    // Un restaurante nos ha encargado una aplicación para colocar a los clientes en sus mesas.
    // En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales(mesa llena).
    //
    // Cuando llega un cliente se le pregunta cuántos son. De momento el programa no está preparado
    // para colocar a grupos mayores a 4, por tanto, si un cliente dice por ejemplo que son un grupo de 6,
    // el programa dará el mensaje“Lo siento, no admitimos grupos de 6, haga grupos de 4 personas
    // como máximo e intente de nuevo”. Para el grupo que llega, se busca siempre la primera mesa libre
    // (con 0 personas).
    //
    // Si no quedan mesas libres, se busca donde haya un hueco para todo el grupo,
    // por ejemplo si el grupo es dedos personas, se podrá colocar donde haya una o dos personas.
    // Inicialmente,las mesas se cargan con valores aleatorios entre 0 y 4.
    //
    // Cada vez que se sientan nuevos clientes se debe mostrar el estado de las mesas.
    // Los grupos no se pueden romper aunque haya huecos sueltos suficientes.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] mesas = new int[10];
        int comensales;

        for (int i = 0; i < mesas.length; i++) {
            mesas[i] = (int) (Math.random()*(5-0)+0);
        }
        System.out.println(Arrays.toString(mesas));

        System.out.println("¿Cuántos son?");
        comensales = sc.nextInt();

        while (comensales>5){
            System.out.println("Lo siento, no admitimos grupos con esa cantidad de personas, haga grupos de 4 personas como máximo e intente de nuevo");
            comensales = sc.nextInt();
        }

        if(comensales==-1){
            System.out.println("Gracias. Hasta pronto");
        } else{
            for (int i = 0; i < mesas.length; i++) {
                if(HayHueco(mesas, comensales)){
                    if(mesas[i]==0){
                        mesas[i] += comensales;
                        System.out.println("Tenemos una mesa libre. Por favor, siéntense en la mesa " +i);
                        break;
                    } else{
                        mesas[i] += comensales;
                        System.out.println("Tendrá que compartir mesa. Por favor, siéntense en la mesa " +i);
                        break;
                    }
                } else{
                    System.out.println("No tenemos sitio disponible");
                    break;
                }
            }
        }

    }

    public static boolean HayHueco(int[]mesas, int comensales){
        for (int i = 0; i < mesas.length; i++) {
            if(mesas[i]+comensales<4){
                return true;
            }
        }
        return false;
    }
}
