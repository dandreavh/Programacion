package CorreccionEntregable;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        Crear personas
        Persona p1 = new Persona("1111A","Pepe","Perez");
        Persona p2 = new Persona("2222B","Juan","Garcia");
        Persona p3 = new Persona("3333C","Ana","Lopez");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

//        Crear Propiedades
        Vivienda viv1 = new Vivienda(2000, "Vivienda1",300, 2, 4, 5, 100000);
        Vivienda viv2 = new Vivienda(1995, "Vivienda2",500, 1, 3, 3, 70000);
        Vivienda viv3 = new Vivienda(1990, "Vivienda3",150, 3, 7, 10, 250000);
        LocalIndustrial locIndustrial1 = new LocalIndustrial(2003, "Industrial1" , 400, p1, 150000, 3300);
        LocalComercial locComercial1 = new LocalComercial(1990, "Comercio1", 240, p2, 300000, "Tienda de Ropa");
        EquipamientoServicio servicio1 = new EquipamientoServicio(2005, "Servicio1",80, TipoServicio.SANITARIO);

//        Añadir personas a las propiedades
        viv1.addPersona(p1);
        viv2.addPersona(p2);
        viv3.addPersona(p3);

//        Mostrar información de las propiedades
        viv1.mostrarPropiedad();
        viv1.mostrarPrecioVenta();
        viv2.mostrarPropiedad();
        viv2.mostrarPrecioVenta();
        viv3.mostrarPropiedad();
        viv3.mostrarPrecioVenta();
        locIndustrial1.mostrarPropiedad();
        locIndustrial1.mostrarPrecioVenta();
        locComercial1.mostrarPropiedad();
        locComercial1.mostrarPrecioVenta();
        servicio1.mostrarPropiedad();

//        Crear Registro y añadir propiedades
        Registro registro = new Registro();
        registro.addPropiedad(viv1);
        registro.addPropiedad(viv2);
        registro.addPropiedad(viv3);
        registro.addPropiedad(locComercial1);
        registro.addPropiedad(locIndustrial1);
        registro.addPropiedad(servicio1);

//        Ordenar propiedades
        System.out.println("Orden por defecto (metros cuadrados):");
        registro.informeSuperficie();
        System.out.println("Orden por antigüedad (más nuevos primero):");
        registro.informeAntiguedad();

//        Ordenar viviendas por número de habitaciones
        Vivienda[] viviendas = {viv1, viv2, viv3};
        System.out.println("Viviendas ordenadas por el número de habitaciones:");
        Arrays.sort(viviendas, new OrdenaViviendaPorNumHabit());
        for (Vivienda vivienda : viviendas) {
            System.out.println(vivienda);
        }

//        Quitar personas de viviendas
        System.out.println("Quitar personas:");
        viv1.removePersona(p1);
        viv2.removePersona(p2);
        viv3.removePersona(p3);
        System.out.println(viv1);
        System.out.println(viv2);
        System.out.println(viv3);

//        Quitar propiedades del registro
        System.out.println("Quitar propiedades:");
        registro.eliminarPropiedad(viv1);
        registro.eliminarPropiedad(viv3);
        registro.eliminarPropiedad(locIndustrial1);
        registro.informeSuperficie();
    }
}