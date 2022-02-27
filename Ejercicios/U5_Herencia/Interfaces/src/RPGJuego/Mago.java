package RPGJuego;

public class Mago extends Hombre implements Magia{

    private int largoBarba;

    public Mago(String nombre, Integer energia, Integer capacidadAtaque, Integer capacidadDefensa, int largoBarba) {
        super(nombre, energia, capacidadAtaque, capacidadDefensa);
        this.largoBarba = largoBarba;
    }

    public int getLargoBarba() {
        return largoBarba;
    }
    public void setLargoBarba(int largoBarba) {
        this.largoBarba = largoBarba;
    }

    @Override
    public String toString() {
        return super.toString()+", longitudBarba=" + largoBarba;
    }

}
