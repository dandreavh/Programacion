package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Conjunto c1 = new Conjunto( 5);
        Conjunto c2 = new Conjunto();
        Conjunto c3 = new Conjunto(20);

        c1.insertarNumero(2);
        c1.insertarNumero(2);
        c1.insertarNumero(8);
        c1.insertarNumero(8);
        c1.insertarNumero(10);
        c1.insertarNumero(11);
        c1.insertarNumero(12);
        c1.insertarNumero(14);

        System.out.println(c1);

        c2.insertarNumero(24);
        c2.insertarNumero(23);
        c2.insertarNumero(78);
        c2.insertarNumero(8999);
        System.out.println(c2);
        c2.borrarElemento(8999);
        System.out.println(c2);

        c3.insertarNumero(12);
        c3.insertarNumero(14);

        c3.insertarConjunto(c1);
        System.out.println(c3);



    }
}
