package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Ej1_Entregable1920 {
    /* Un restaurante nos ha encargado una aplicación para colocar a los clientes en sus mesas.
    En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales (mesa llena).
    Cuando llega un cliente se le pregunta cuántos son.
    De momento el programa no está preparado para colocar a grupos mayores a 4, por tanto,
    si un cliente dice por ejemplo que son un grupo de 6, el programa dará el mensaje
    “Lo siento, no admitimos grupos de 6, haga grupos de 4 personas
    como máximo e intente de nuevo”. Para el grupo que llega,
    se busca siempre la primera mesa libre (con 0 personas). Si no quedan mesas libres,
    se busca donde haya un hueco para todo el grupo, por ejemplo si el grupo es de dos personas,
    se podrá colocar donde haya una o dos personas. Inicialmente,
    las mesas se cargan con valores aleatorios entre 0 y 4.
    Cada vez que se sientan nuevos clientes se debe mostrar el estado de las mesas.
    Los grupos no se pueden romper aunque haya huecos sueltos suficientes */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantPersonas;
        int[] mesas = new int[10];
        int personasSentadas;

        for (int i = 0; i < mesas.length; i++) {
            personasSentadas = (int) (Math.random()*5);
            mesas[i] = personasSentadas;
        }

        System.out.println(Arrays.toString(mesas));

        do{
            System.out.println("¿Cuántos son? (Introduzca -1 para salir del programa)");
            cantPersonas = sc.nextInt();
            if (cantPersonas>4){
                System.out.println("Lo siento, no admitimos grupos de más de 4 personas, haga grupos de 4 personas como máximo e intente de nuevo");
            } else if (cantPersonas== -1){
                System.out.println("Gracias, hasta pronto");
            } else if (!haySitio(mesas, cantPersonas)){
                System.out.println("Lo siento, en estos momentos no queda sitio.");
            }
        } while(cantPersonas>4 || cantPersonas<0 || !haySitio(mesas,cantPersonas));

        for (int i = 0; i < mesas.length; i++) {
            if(!ocupada(mesas)){
                mesas[i] = cantPersonas;
                System.out.println("Por favor, siéntense en la mesa número " +(i+1));
                break;
            } else{
                if(!haySitio(mesas, cantPersonas)){
                    System.out.println("Lo siento, en estos momentos no queda sitio.");
                } else{
                    mesas[i] += cantPersonas;
                    System.out.println("Tendrán que compartir mesa. Por favor, siéntense en la mesa número " +(i+1));
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(mesas));
    }

    public static boolean ocupada(int[] mesas){
        for (int i = 0; i < mesas.length; i++) {
            if(mesas[i]==0){
                return false;
            }
        }
        return true;
    }

    public static boolean haySitio(int[] mesas, int cantPersonas) {
        for (int i = 0; i < mesas.length; i++) {
            if(mesas[i]+cantPersonas<=4){
                return true;
            }
        }
        return false;
    }
}
