package ActGaraje;

import java.util.Arrays;

public class MainGaraje {

    public static void main(String[] args) {

        Moto m1 = new Moto("Vespita", 2, "1234ABC", 1994, Color.ROJO);
        Moto m2 = new Moto("Hondita", 2, "1234ABC", 1994, Color.AZUL);

        // COPIADOS DEL PROFESOR

        Coche c1 = new Coche("Herby",4,"3333XXX", 1960, Color.AMARILLO);
        Coche c2 = new Coche("KITT",2,"444XXX", 1980, Color.ROJO);
        Coche c3 = new Coche("Rayo McQueen",3,"5555XXX", 2005, Color.ROJO);


        Helicoptero h = new Helicoptero("Rusty",10,1000,"C-100");
        Avioneta a = new Avioneta("McFly",11,2000,"C-200");

        Terrestre[] t = {c1,c2,c3,m1,m2};

        System.out.println(Arrays.toString(t));

        Arrays.sort(t);

        System.out.println(Arrays.toString(t));

        Arrays.sort(t,new ComparadorAnio());

        System.out.println(Arrays.toString(t));

        h.transportar(9);

        System.out.println(h);

    }
}
