package com.company;

import java.util.Scanner;

public class Ej15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean resp1, resp2, resp3, resp4, resp5, resp6, resp7, resp8, resp9, resp10;
        int contador = 0;

        System.out.println("Responde a estas preguntas con verdadero (true) o falso(false)");
        System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
        resp1 = sc.nextBoolean();
        if (resp1){
            contador = contador +3;
        } else{
            contador = contador;
        }
        System.out.println("2. Ha aumentado sus gastos de vestuario.");
        resp2 = sc.nextBoolean();
        if (resp2){
            contador = contador +3;
        } else{
            contador = contador;
        }
        System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti.");
        resp3 = sc.nextBoolean();
        if (resp3){
            contador = contador +3;
        } else{
            contador = contador;
        }
        System.out.println("4. Ahora se asea con más frecuencia.");
        resp4 = sc.nextBoolean();
        if (resp4){
            contador = contador +3;
        } else{
            contador = contador;
        }
        System.out.println("5. No te deja que mires la agenda de su teléfono móvil");
        resp5 = sc.nextBoolean();
        if (resp5){
            contador = contador +3;
        } else{
            contador = contador;
        }
        System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante.");
        resp6 = sc.nextBoolean();
        if (resp6){
            contador = contador +3;
        } else{
            contador = contador;
        }
        System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.");
        resp7 = sc.nextBoolean();
        if (resp7){
            contador = contador +3;
        } else{
            contador = contador;
        }
        System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.");
        resp8 = sc.nextBoolean();
        if (resp8){
            contador = contador +3;
        } else{
            contador = contador;
        }
        System.out.println("9. Has notado que últimamente se perfuma más.");
        resp9 = sc.nextBoolean();
        if (resp9){
            contador = contador +3;
        } else{
            contador = contador;
        }
        System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo.");
        resp10 = sc.nextBoolean();
        if (resp10){
            contador = contador +3;
        } else{
            contador = contador;
        }

        System.out.println("Has sacado un " + contador + " de 30.");

        if (contador>=0 && contador<=10){
            System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
        } else if (contador>=11 && contador<=22){
            System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
        } else if (contador>23 && contador<=30){
            System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
        }
    }
}
