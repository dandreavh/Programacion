package Examen2021Morning;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Maraton maraton = new Maraton();
        Integer dorsal;
        Categoria categoria;
        String pais;
        int opcion;

        do{
            showMenu();
            System.out.println("Indique una opción");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1:
                    maraton.cargarAtletas();
                    break;
                case 2:
                    maraton.guardarAtletas();
                    break;
                case 3:
                    maraton.inscribirAtleta();
                    break;
                case 4:
                    System.out.println("Indique el dorsal del atleta del que quiere añadir una marca");
                    dorsal = sc.nextInt();

                    System.out.println("Indique los segundos que ha hecho");
                    Integer segundos_marca = sc.nextInt();

                    maraton.guardarTiempo(dorsal, segundos_marca);
                    break;
                case 5:
                    System.out.println("Indique el dorsal del atleta que desea eliminar de la competición");
                    dorsal = sc.nextInt();

                    maraton.borrarAtleta(dorsal);
                    sc.nextLine();
                    break;
                case 6:
                    maraton.mostrarListaFinishers();
                    break;
                case 7:
                    System.out.println("Indique la categoría: SENIOR, JUNIOR, VETERANO");
                    categoria = Categoria.valueOf(sc.nextLine());

                    maraton.mostrarListaCategoria(categoria);
                    sc.nextLine();
                    break;
                case 8:
                    System.out.println("Indique el país");
                    pais = sc.nextLine();

                    maraton.participantesPorPaís(pais);
                    break;
            }

        } while (opcion<9);
    }
    public static void showMenu(){
        System.out.println("1. Cargar Atletas");
        System.out.println("2. Guardar Atletas");
        System.out.println("3. Inscribir Atleta");
        System.out.println("4. Guardar Tiempo");
        System.out.println("5. Borrar Atleta");
        System.out.println("6. Mostrar Lista de Finishers");
        System.out.println("7. Mostrar Lista de Categoria");
        System.out.println("8. Participantes por País");
        System.out.println("9. Salir");
    }
}
