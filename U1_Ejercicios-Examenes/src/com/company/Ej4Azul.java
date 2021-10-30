package com.company;

import java.util.Scanner;

public class Ej4Azul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String respuesta;
        int cantVerdad = 0;
        int totalVerdad;
        int total;
        System.out.println("Responde con -verdadero- o -falso- para conocer si tu pareja te engaña");
        System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
        respuesta = sc.nextLine();
        if(respuesta.equalsIgnoreCase("verdadero")){
            cantVerdad++;
        }
        System.out.println("2. Ha aumentado sus gastos de vestuario");
        respuesta = sc.nextLine();
        if(respuesta.equalsIgnoreCase("verdadero")){
            cantVerdad++;
        }
        System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti");
        respuesta = sc.nextLine();
        if(respuesta.equalsIgnoreCase("verdadero")){
            cantVerdad++;
        }
        System.out.println("4. Ahora se asea con más frecuencia");
        respuesta = sc.nextLine();
        if(respuesta.equalsIgnoreCase("verdadero")){
            cantVerdad++;
        }
        System.out.println("5. No te deja que mires la agenda de su teléfono móvil");
        respuesta = sc.nextLine();
        if(respuesta.equalsIgnoreCase("verdadero")){
            cantVerdad++;
        }
        System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
        respuesta = sc.nextLine();
        if(respuesta.equalsIgnoreCase("verdadero")){
            cantVerdad++;
        }
        System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
        respuesta = sc.nextLine();
        if(respuesta.equalsIgnoreCase("verdadero")){
            cantVerdad++;
        }
        System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
        respuesta = sc.nextLine();
        if(respuesta.equalsIgnoreCase("verdadero")){
            cantVerdad++;
        }
        System.out.println("9. Has notado que últimamente se perfuma más");
        respuesta = sc.nextLine();
        if(respuesta.equalsIgnoreCase("verdadero")){
            cantVerdad++;
        }
        System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
        respuesta = sc.nextLine();
        if(respuesta.equalsIgnoreCase("verdadero")){
            cantVerdad++;
        }

        totalVerdad = cantVerdad*3;

        if(totalVerdad<11 && totalVerdad>=0){
            System.out.println("Puntuación entre 0 y 10: ¡Enhorabuena! tu pareja parece ser totalmente fiel.");
        } else if(totalVerdad<23 && totalVerdad>=11){
            System.out.println("Puntuación entre 11 y 22: Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
        } else if (totalVerdad<31 && totalVerdad>=22){
            System.out.println("Puntuación entre 22 y 30: Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües qué es lo que está pasando por su cabeza.");
        }
    }

}
