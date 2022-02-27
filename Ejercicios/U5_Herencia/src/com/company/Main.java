package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Persona p1 = new Persona("Ana", "López", "111111111A");
        Persona p2 = new Persona("Juan", "López", "222222222A");

        Empleado e1 = new Empleado("Enrique", "Ruiz", "3333333333A");
        Empleado e2 = new Empleado("Raquel", "Sánchez", "444444444A", 2500.50);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(e1);
        System.out.println(e2);

    }
}
