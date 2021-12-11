package com.company.ActividadInicial;

public class Main {

    public static void main(String[] args) {

//        Persona persona1 = new Persona(); // Invoco a mi clase Persona y creo un objeto Nuevo
//
//        persona1.setNombre("Pepe");
//        persona1.setApellidos("Pérez");
//        persona1.setAltura(175);
//        persona1.setPeso(82.5);

        Alumno alumno1 = new Alumno("Andrea", "KiKiKi");

        // MÉTODO CON EL CONSTRUCTOR
        Persona persona2 = new Persona("Ana", "López", 167, 78.6);

        System.out.println(persona2.getNombre());

        // MOSTRAR POR PANTALLA CON UN SOLO ELEMENTO
        System.out.println(alumno1);

    }
}
