package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Persona p1 = new Persona("1111A", "Juan", "Valdés");
        Persona p2 = new Persona("2222B", "Ana", "Blanco");
        Persona p3 = new Persona("3333B", "Inés", "Rosales");
        Persona p4 = new Persona("4444C", "Carolina", "Herrera");
        Persona p5 = new Persona("5555D", "Adolfo", "Domínguez");
        Persona p6 = new Persona("6666R", "Pepe", "Gambrino");
        Persona p7 = new Persona("7777T", "Pablo", "López");
        Persona p8 = new Persona("88888K", "David", "Bisbal");
        Persona p9 = new Persona("99999J", "Ainhoa", "Arteta");
        Persona p10 = new Persona("34353G", "Paco", "Miranda");


        Vivienda v1 = new Vivienda(2018, "Av. Europa, 4 - Gines", 123.4, 3, 4, 6, 123000.50);
        Vivienda v2 = new Vivienda(2010, "Av. La Paz, 4 - Gines", 113.4, 3, 4, 8, 203000.50);
        Vivienda v3 = new Vivienda(2018, "Av. Bilbao, 4 - Gines", 101.4, 2, 3, 5, 193000.50);
        Vivienda v4 = new Vivienda(2021, "Calle Rosas, 4 - Gines", 98.4, 1, 2, 3, 93000.50);
        Vivienda v5 = new Vivienda(1994, "Calle Filipinas, 4 - Gines", 124.4, 2, 5, 10, 223000.50);


        EquipamientoServicio es1 = new EquipamientoServicio(2020, "Las Flores, 3", 500.98, TipoServicio.EDUCATIVO);
        EquipamientoServicio es2 = new EquipamientoServicio(2010, "Las Flores, 4", 5370.98, TipoServicio.SANITARIO);
        EquipamientoServicio es3 = new EquipamientoServicio(2000, "Las Flores, 5", 1570.98, TipoServicio.DEPORTIVO);
        EquipamientoServicio es4 = new EquipamientoServicio(2009, "Las Flores, 6", 120.98, TipoServicio.EDUCATIVO);
        EquipamientoServicio es5 = new EquipamientoServicio(2006, "Las Flores, 7", 800.98, TipoServicio.OTROS);


        LocalComercial lc1 = new LocalComercial(2001,"Calle Amor, 5", 120.4, p2, 298000.50, "Tienda de muebles");
        LocalComercial lc2 = new LocalComercial(2002,"Calle Amor, 53", 120.4, p8, 212000.50, "Tienda de ordenadores");
        LocalComercial lc3 = new LocalComercial(2020,"Calle Amor, 51", 120.4, p9, 267000.50, "Tienda de ropa");
        LocalComercial lc4 = new LocalComercial(1998,"Calle Amor, 56", 120.4, p10, 287000.50, "Peluquería");
        LocalComercial lc5 = new LocalComercial(1997,"Calle Amor, 57", 120.4, p1, 234000.50, "Veterinario");

        LocalIndustrial li1 = new LocalIndustrial(2008, "Calle San Jacinto, 98", 156.90, p3, 387956.98, 2);
        LocalIndustrial li2 = new LocalIndustrial(1997, "Calle San Jacinto, 98", 156.90, p3, 387921.98, 24);
        LocalIndustrial li3 = new LocalIndustrial(2008, "Calle San Jacinto, 98", 156.90, p7, 387967.98, 23);
        LocalIndustrial li4 = new LocalIndustrial(2001, "Calle San Jacinto, 98", 156.90, p1, 387998.98, 7);
        LocalIndustrial li5 = new LocalIndustrial(2018, "Calle San Jacinto, 98", 156.90, p10, 387932.98, 6);



        v1.addPersona(p1);
        v1.addPersona(p2);
        v1.addPersona(p3);
        v1.addPersona(p4);
        v1.addPersona(p3);
        v1.addPersona(p5);
        v1.addPersona(p6);
        v1.addPersona(p7);

        System.out.println(v1);

        v1.deletePersona(p1);
        System.out.println(v1);

        /*
        Propiedad[] propiedades = {v1, v2, lc1, lc2};
        Registro r1 = new Registro(propiedades);
        System.out.println(r1);
         */


        Vivienda[] viviendas = {v1, v2, v2, v3, v4, v5};
        Arrays.sort(viviendas, new Comparator<Vivienda>() {
            @Override
            public int compare(Vivienda v1, Vivienda v2) {
                return v1.getCantidadHabitaciones()-v2.getCantidadHabitaciones();
            }
        });
        System.out.println(Arrays.toString(viviendas));
    }
}
