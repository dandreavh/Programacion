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
        int[] mesas = new int[10];
        int personas;
        boolean sentados = false;
        final int HUECOS_MESAS = 4; // Se asigna una capacidad por defecto

        for (int i = 0; i < mesas.length; i++) { // Indica cúantos sitios están ocupados en las mesas con un máximo de 4
            mesas[i] = (int) (Math.random()*5);
        }

        System.out.println(Arrays.toString(mesas)); // Vemos cuántos sitios hay ocupados en cada mesa

        do {
            System.out.println("Introduce el número de comensales");
            personas = sc.nextInt();

            if (mesaLibre(mesas) && personas<5) { // se evalúa con la función si hay mesas libres y se discrimina si hay grupos mayores a 4
                for (int i = 0; i < mesas.length ; i++) {
                    if (mesas[i]==0) {
                        sentados = true; // indicamos que hay gente sentada para cuando no haya sitios en 0 valorar si caben compartiendo
                        mesas[i] = personas; // Actualizamos el valor de esa posición
                        System.out.println("Tenemos hueco libre en la mesa " +(i+1));
                        break;
                    }
                }
            } else if (personas>4) {
                System.out.println("No tenemos capacidad para grupos tan grandes, divídalos en más pequeños.");
            } else{
                for (int i = 0; i < mesas.length; i++) { // evalúa si en las mesas ocupadas hay posibilidad de compartir
                    if (mesas[i]+personas <= HUECOS_MESAS) {
                        sentados = true;
                        mesas[i]+= personas;
                        System.out.println("Todas la mesas está ocupadas, pero hay sitios para compartir. Se pueden sentar en la mesa " +(i+1));
                        break;
                    }
                }
                System.out.println("Capacidad actual del restaurante: " +Arrays.toString(mesas));
            }

            if (sentados) {
                System.out.println("Clientes aposentados");
            } else {
                System.out.println("No hay sitio en el restaurante");
            }

        } while (personas>0);
    }

    public static boolean mesaLibre(int[] mesas) {
        for(int m: mesas) {
            if (m==0) {
                return true;
            }
        }
        return false;
    }
}
