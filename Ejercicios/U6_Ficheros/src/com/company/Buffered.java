package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Buffered {
    public static void main(String[] args) {
        String texto = "";
        try {
            BufferedReader in = new BufferedReader(new FileReader("./primerfichero.ghex"));
            String linea = in.readLine();
            while (linea != null) {
                texto += linea + "\n";
                linea = in.readLine();
            }
            in.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(texto);
    }
}
