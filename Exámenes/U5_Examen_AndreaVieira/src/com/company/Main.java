package com.company;

public class Main {

    public static void main(String[] args) {

        Comparsa comparsa1 = new Comparsa("La Comparsita", "Manuel Falla",
                "Pepito Pérez", "Ramón Pérez", "Tiras de colores",
                20, "HaciendoTrajes SL");

        Chirigota chirigota1 = new Chirigota("La Chirigotita", "Pedro Pinzón",
                "Manuel Machado", "Antonio Machado", "Gotas",
                25, 4);

        Coro coro1 = new Coro("El Corito", "Ana Alcántara", "Rosa Rojas",
                "Esther Momix", "Presos", 40,8, 6);

        Cuarteto cuarteto1 = new Cuarteto("El Cuartetito", "Manuel Mora", "Miguel Molina",
                "Marta Morales", "Los Vengadores", 39, 20);

        Romancero romancero1 = new Romancero("El Romancerito", "Juana Jiménez", "Peter Palomo",
                "Alfredo Álvarez", "Bebés", "La infancia");

        Integrante integrante1 = new Integrante(1, "Lola", 35, "Cádiz");
        Integrante integrante2 = new Integrante(2, "Luis", 30, "Barbate");

        Agrupacion[] agrupacion1 = {romancero1};
        AgrupacionOficial[] ao1 = {coro1, comparsa1, chirigota1, cuarteto1};
        COAC coac1 = new COAC();
        COAC coac2 = new COAC();

        chirigota1.insertar_integrante(integrante1);
        chirigota1.insertar_integrante(integrante2);
        chirigota1.eliminar_integrante(integrante2);
        chirigota1.amo_a_escucha();
        chirigota1.cantar_la_presentacion();
        chirigota1.caminito_del_Falla();

        coac1.inscribir_agrupacion(coro1);
        coac1.eliminar_agrupacion(coro1);
        coac2.inscribir_agrupacion(romancero1);

        coac2.ordenar_por_autor();
        System.out.println(coac2);

        coac2.ordenar_por_nombre();
        System.out.println(coac2);

        coac2.ordenar_por_puntos();
        System.out.println(coac2);
    }
}
