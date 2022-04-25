package PrácticaBaloncesto;

public class Main {
    public static void main(String[] args) {
        ClubBaloncesto cb = new ClubBaloncesto();
        Jugador jug1 = new Jugador("Ana", "López", 187, 21);

        System.out.println("Método insertar");
        cb.insertarJugador();
        cb.insertarJugador();
        cb.insertarJugador();
        System.out.println(cb);

        System.out.println("Método eliminar");
        cb.borrarJugador(jug1);
        System.out.println(cb);

        System.out.println("Métodos mostrar x edad");
        cb.mostrarJugadores(Tipo.MEDIANO);

        System.out.println("Método mostrar todos x altura");
        cb.mostrarTodosXAltura();

        cb.cargarJugadores();
        cb.guardarJugadores();

        System.out.println("Método mostrar en rango de edad");
        cb.mostrarJugadoresRangoEdad(20, 30);
    }
}
