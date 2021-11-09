package com.company;

import java.util.Scanner;

public class Actividad8 {
    // Los habitantes de Javalandia tienen un idioma algo extraño;
    // cuando hablan siempre comienzan sus frases con "Javalín, javalón",
    // para después hacer una pausa más o menos larga (la pausa se representa mediante espacios en blanco)
    // y a continuación expresan el mensaje.
    // Existe un dialecto que no comienza sus frases con la muletilla anterior,
    // pero siempre las terminan con un silencio, más o menos prolongado y la coletilla "javalén, len, len".
    // Se pide diseñar un traductor que, en primer lugar, nos diga si la frase está escrita en el idioma
    // de Javalandia (en cualquiera de sus dialectos),
    // y en caso afirmativo, nos muestre el mensaje sin muletillas.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fraseUsuario;
        String principio = "Javalín, javalón";
        String fin = "javalén, len, len";
        String fraseTraducida = "";
        String auxiliar;

        System.out.println("Escriba una frase en el idioma de Javalandia");
        fraseUsuario = sc.nextLine();

        // debo tener en cuanta que al menos tiene un silencia!!
        if(fraseUsuario.length()>principio.length()){
            auxiliar = fraseUsuario.substring(0, principio.length());
            if(auxiliar.equals(principio)){
                fraseTraducida = fraseUsuario.substring(auxiliar.length());
                System.out.println(fraseTraducida.trim());
            }

        } else if(fraseUsuario.length()>18){
            auxiliar = fraseUsuario.substring(fraseUsuario.length()-17, fraseUsuario.length());
        } else{
            System.out.println("La frase no está en el idioma o un dialecto de Javalandia");
        }
    }
}
