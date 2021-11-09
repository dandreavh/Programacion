package com.company;

public class Actividad9 {
    // Realizar un programa que realice lo siguiente:
    //




    //e) Partiendo de la cadena anterior y usando los métodos de StringBuilder modificar la cadena para que pase a ser "Hay 5000 Chicharrones en Chiclana" y mostrarla por consola.
    //f) Almacenar en un String los últimos 4 carácteres del StringBuilder resultante y mostrar ese String por consola.
    //g) Mostrar por  consola  la capacidad y longitud del StringBuilder final.
    //h) Realizar el mismo ejercicio con la clase StringBuffer.
    public static void main(String[] args) {
        //a) Crear un StringBuilder con la cadena "Alabí Alixar" y mostrarla por consola.
        StringBuilder s = new StringBuilder("Alabí Alixar");
        System.out.println(s);

        //b) Mostrar por consola su capacidad y longitud.
        System.out.println("capacidad: " + s.capacity()+ " longitud: " +s.length());

        //c) Partiendo de la cadena anterior y usando los métodos de StringBuilder modificar
        // la cadena para que pase a ser "Chicharrones de Chiclana" y mostrarla por consola.
        s.append("Chicharrones de Chiclana");
        System.out.println(s.delete(0,12));

        //d) Partiendo de la cadena anterior y usando los métodos de StringBuilder modificar la cadena
        // para que pase a ser "Hay 5000 Chicharrones" y mostrarla por consola.
        // El número entero 5000 debe estar almacenado en un int inicialmente.
        int num = 5000;
        System.out.println(s.insert(0, ("Hay "+num+" ")));
    }
}
