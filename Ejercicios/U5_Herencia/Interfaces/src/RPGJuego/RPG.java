package RPGJuego;

import java.util.Arrays;
import java.util.Comparator;

public class RPG {
    private Personaje[] personajes;

    public boolean addPersonaje(Personaje p) {
        if (personajes!=null) {
            if (personajes.length==10) {
                System.out.println("No se pueden añadir más personajes a la partida");
                return false;
            } else {
                Personaje[] p1 = Arrays.copyOf(personajes, personajes.length+1);
                p1[p1.length-1] = p;
                return true;
            }
        } else {
            personajes = new Personaje[1];
            personajes[0] = p;
            return true;
        }
    }

    public void mostrarEstado() {
        Arrays.sort(personajes);
        System.out.println(Arrays.deepToString(personajes));
    }

    public void mostrarxAtaque() {
        Arrays.sort(personajes, new Comparator<Personaje>() {
            @Override
            public int compare(Personaje personaje, Personaje t1) {
                return personaje.getCapacidadAtaque()-t1.getCapacidadAtaque();
            }
        });
        System.out.println(Arrays.deepToString(personajes));
    }

    public void mostrarxDefensa() {
        Arrays.sort(personajes, new Comparator<Personaje>() {
            @Override
            public int compare(Personaje personaje, Personaje t1) {
                return personaje.getCapacidadDefensa()-t1.getCapacidadDefensa();
            }
        });
        System.out.println(Arrays.deepToString(personajes));
    }

    public void borrarMuertos() {
        int numMuertos = 0;
        for (int i = 0; i < personajes.length; i++) {
            if (personajes[i].getEnergia()<=0) {
               numMuertos++;
            }
        }

        for (int i = 0; i < personajes.length ; i++) {
            if (personajes[i].getEnergia()>0) {
                Personaje[] p1 = Arrays.copyOf(personajes, personajes.length-numMuertos);
                p1[p1.length-1] = personajes[i];
            }
        }
    }

    public boolean hayGanador(){
        if (personajes.length>=1){
            System.out.println("Hay ganador");
            return true;
        }
        return false;
    }
}
