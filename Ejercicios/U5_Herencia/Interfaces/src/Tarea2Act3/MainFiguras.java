package Tarea2Act3;

import java.util.Arrays;

public class MainFiguras {
    public static void main(String[] args) {

        Cuadrado cuadr1 = new Cuadrado(4, Color.AZUL);
        Cuadrado cuadr2 = new Cuadrado(6, Color.AZUL);
        Cuadrado cuadr3 = new Cuadrado(2, Color.VERDE);
        Cuadrado cuadr4 = new Cuadrado(5, Color.ROJO);

        Triangulo tri1 = new Triangulo(3, Color.ROJO, 5);
        Triangulo tri2 = new Triangulo(4, Color.ROJO, 3);
        Triangulo tri3 = new Triangulo(9, Color.AMARILLO, 8);

        Cuadrado[] cuadrados = {cuadr1, cuadr2, cuadr3, cuadr4};
        Triangulo[] triangulos = {tri1, tri2, tri3};

        System.out.println(Arrays.toString(cuadrados));
        System.out.println(Arrays.toString(triangulos));

        Arrays.sort(cuadrados);
       // Arrays.sort(triangulos);

        System.out.println(Arrays.toString(cuadrados));
        //System.out.println(Arrays.toString(triangulos));

        /*

    Por defecto, la forma de ordenación de objetos Triangulo es la ordenación por lado.
    Es decir, un triángulo se considera menor que otro si su lado es menor.
    Queremos tener también la opción de poder comparar objetos Triángulo según el orden alfabético
    de su color. (amarillo es el color más pequeño, luego azul,…).

         */

    }
}
