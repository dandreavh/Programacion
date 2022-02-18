package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // LECTURA CARACTER A CARACTER
        String texto = "";
        try {
            FileReader in = new FileReader("./primerfichero.ghex");
            int caracter = in.read();
            while (caracter != -1) {
                texto += (char) caracter;
                caracter = in.read();
            }
            in.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(texto);

    }
}
