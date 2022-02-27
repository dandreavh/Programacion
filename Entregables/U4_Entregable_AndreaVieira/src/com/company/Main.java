package com.company;

public class Main {

    public static void main(String[] args) {

        Opositor o1 = new Opositor("Ana", "Pérez", 1994, false, "");
        Opositor o2 = new Opositor("Juan", "Ruiz", 1989, true, "Tiempo extra");
        Opositor o3 = new Opositor("Rosa", "Parks", 1963, false, "");
        Opositor o4 = new Opositor("Raúl", "Sánchez", 1987, true, "Espacio para silla de ruedas");

        Sedes s1 = new Sedes("S1", Ciudad.SEVILLA);
        Sedes s2 = new Sedes("S2", Ciudad.CÁDIZ);

        Examen ex1 = new Examen("C1", "www.consejeria.com");

        Preguntas preg1 = new Preguntas("En un examen de programación...");
        Preguntas preg2 = new Preguntas("En base de datos...");

        Opciones opc1 = new Opciones("¿Quieres aprobar?", Tipo.VERDADERA);
        Opciones opc2 = new Opciones("¿Quieres dormir?", Tipo.FALSA);
        Opciones opc3 = new Opciones("¿Quieres pasear?", Tipo.FALSA);
        Opciones opc4 = new Opciones("¿Quieres otra opción?", Tipo.FALSA);
        Opciones opc5 = new Opciones("Existe herencia", Tipo.VERDADERA);
        Opciones opc6 = new Opciones("Puede haber etiquetas de XML", Tipo.FALSA);

        ex1.addSede(s1);
        ex1.addSede(s2);
        ex1.addPregunta(preg1);
        ex1.addPregunta(preg2);
        ex1.deletePregunta(preg2);
        ex1.mostrar_informacion();

        preg1.addOpcion(opc1);
        preg1.addOpcion(opc2);
        preg1.addOpcion(opc3);
        ex1.mostrar_informacion();

        preg1.deleteOpcion(opc3);
        ex1.mostrar_informacion();

        s1.addOpositor(o1);
        s1.addOpositor(o2);
        s1.mostrar_informacion();

        s1.deleteOpositor(o1);
        s1.mostrar_informacion();

    }
}
