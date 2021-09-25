package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio_4_5 {
    // Actividad 4.5 - Escribe un programa que muestre la hora actual
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("La hora actual: "+dtf.format(LocalDateTime.now()));
    }
}
