package Tarea2Act2;

import java.util.Arrays;

public class MainCliente {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("1111111Z", "Manolo", 67, 5467.23);
        Cliente c2 = new Cliente("2222222Y", "María", 47, 10500);
        Cliente c3 = new Cliente("3333333X", "Jesús", 27, 1540);
        Cliente c4 = new Cliente("4444444W", "Ángel", 32, 589);
        Cliente c5 = new Cliente("5555555V", "Belén", 54, 254);


        Cliente[] clientes = {c3, c2, c1, c5, c4};
        System.out.println(Arrays.toString(clientes));

        Arrays.sort(clientes);
        System.out.println(Arrays.toString(clientes));
    }
}
