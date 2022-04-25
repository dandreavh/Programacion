package PrácticaBaloncesto;

import java.io.*;
import java.util.*;

public class ClubBaloncesto {
    private Map<Tipo, HashSet<Jugador>> jugadores;

    public ClubBaloncesto() {
        jugadores = new HashMap<>();
    }

    public Map<Tipo, HashSet<Jugador>> getJugadores() {
        return jugadores;
    }

    public void setJugadores(Map<Tipo, HashSet<Jugador>> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "ClubBaloncesto{" +
                "jugadores=" + jugadores +
                '}';
    }

    // MIS MÉTODOS

    public void insertarJugador(){
        Scanner sc = new Scanner(System.in);
        String nombre;
        String apellidos;
        Integer altura;
        Integer edad;
        Tipo tipo;
        Jugador jugador;

        System.out.println("Indique el nombre");
        nombre = sc.nextLine();
        System.out.println("Indique los apellidos");
        apellidos = sc.nextLine();
        System.out.println("Indique la altura en cms");
        altura = sc.nextInt();
        sc.nextLine();
        System.out.println("Indique la edad");
        edad = sc.nextInt();
        sc.nextLine();

        tipo = calculaTipo(altura);

        if(!jugadores.containsKey(tipo)){
            jugadores.put(tipo, new HashSet<Jugador>());
        }

        jugador = new Jugador(nombre, apellidos, altura, edad);
        jugadores.get(tipo).add(jugador);
    }
    public static Tipo calculaTipo(Integer altura){
        if(altura>0 && altura<=180){
            return Tipo.BAJO;
        } else if (altura>180 && altura<201) {
            return Tipo.MEDIANO;
        } else if (altura>200){
            return Tipo.ALTO;
        }
        return null;
    }
    public void borrarJugador(Jugador jugador){
        Tipo tipo = calculaTipo(jugador.getAltura());
        if(jugadores.containsKey(tipo)){
            jugadores.get(tipo).remove(jugador);
        } else {
            System.out.println("No existe este jugador");
        }
    }
    public void mostrarJugadores(Tipo tipo){ // x edad
        // SI lo pongo en TREESET esto no hace falta, ya están ordenados,
        Collection<Jugador> coleccion = jugadores.get(tipo);
        if(jugadores.containsKey(tipo)){
            for (Jugador jug:coleccion) {
                System.out.println(jug);
            }
        } else{
            System.out.println("No hay jugadores de este grupo");
        }
    }
    public void mostrarTodosXAltura(){
        ArrayList<Jugador> lista = new ArrayList<>();

        Collection<HashSet<Jugador>> sacos = jugadores.values();

        Iterator it = sacos.iterator();

        while (it.hasNext()){
            lista.addAll((HashSet<Jugador>)it.next());
        }

        Collections.sort(lista, new Comparator<Jugador>() {
            @Override
            public int compare(Jugador j1, Jugador j2) {
                return j1.getEdad().compareTo(j2.getEdad());
            }
        });

        System.out.println(lista);

        /*
        SABIENDO LAS CLAVES - FORMA FÁCIL

        ArrayList<Jugador> lista = new ArrayList<>(jugadores.get(BAJOS));
        lista.addAll(jugadores.get(Mediados))
        lista.addAll(jugadores.get(Altos))

        Collections.sort(lista, new Comparator<Jugador>() {
            @Override
            public int compare(Jugador j1, Jugador j2) {
                return j1.getEdad().compareTo(j2.getEdad());
            }
        });
         */
    }

    public void cargarJugadores(){
        ObjectInputStream in = null;

        try {
            in = new ObjectInputStream(new FileInputStream("jugadores.dat"));
            while (true){
                Jugador jugador = (Jugador) in.readObject();
                Tipo tipo = calculaTipo(jugador.getAltura());

                if (jugadores.containsKey(tipo)){
                    jugadores.get(tipo).add(jugador);
                } else {
                    jugadores.put(tipo, new HashSet<>());
                    jugadores.get(tipo).add(jugador);
                }
            }
        } catch (Exception e) {
            System.out.println(e);;
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public void guardarJugadores(){

        ObjectOutputStream out = null;
        Collection<HashSet<Jugador>> conjunto = jugadores.values();

        try {
            out = new ObjectOutputStream(new FileOutputStream("jugadores.dat"));
            Iterator it = conjunto.iterator();
            while (it.hasNext()){
                HashSet<Jugador> saco = (HashSet<Jugador>) it.next();
                for (Jugador jug: saco) {
                    out.writeObject(jug);
                }
            }

        } catch (IOException e) {
            System.out.println(e);;
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void mostrarJugadoresRangoEdad(Integer edadMin, Integer edadMax){
        Collection<HashSet<Jugador>> sacos = jugadores.values();

        Iterator it = sacos.iterator();

        while (it.hasNext()){
            HashSet<Jugador> saco = (HashSet<Jugador>) it.next();
            for (Jugador jug: saco) {
                if(jug.getEdad()>= edadMin && jug.getEdad()<=edadMax){
                    System.out.println(jug);
                }
            }

        }

    }
}
