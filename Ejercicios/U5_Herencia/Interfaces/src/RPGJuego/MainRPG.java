package RPGJuego;

public class MainRPG {
    public static void main(String[] args) {
        RPG juego = new RPG();

        Elfo e1 = new Elfo("Adelina",80,50,20, TipoElfo.BOSQUE);
        Elfo e2 = new Elfo("Ruperto",50,60,50, TipoElfo.BOSQUE);
        Enano en1 = new Enano("Gruñón",10,20,60,80.50);
        Mago m1 = new Mago("Albus",100,1000,100,60);

        juego.addPersonaje(e1);
        System.out.println(juego);
        juego.addPersonaje(e2);
        juego.addPersonaje(en1);
        juego.addPersonaje(m1);

        m1.encantar(en1);
        System.out.println(m1);

        e1.atacarPersonaje(en1);
        System.out.println(e1);

        juego.mostrarEstado();
        juego.borrarMuertos();
        System.out.println();
        juego.mostrarxAtaque();
        juego.mostrarxDefensa();
    }
}
