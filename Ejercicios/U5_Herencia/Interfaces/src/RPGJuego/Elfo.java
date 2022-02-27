package RPGJuego;

public class Elfo extends Personaje implements Atacar{

    private TipoElfo tipoElfo;

    public Elfo(String nombre, Integer energia, Integer capacidadAtaque, Integer capacidadDefensa, TipoElfo tipoElfo) {
        super(nombre, energia, capacidadAtaque, capacidadDefensa);
        this.tipoElfo = tipoElfo;
    }

    public TipoElfo getTipoElfo() {
        return tipoElfo;
    }
    public void setTipoElfo(TipoElfo tipoElfo) {
        this.tipoElfo = tipoElfo;
    }

    @Override
    public void atacarPersonaje(Personaje p) {
        if (!p.getClass().equals(getClass())) {
            System.out.println("SOY "+getNombre()+" Y ESTOY ATACANDO");
            int damage = p.isEncantado() ? (getCapacidadAtaque()-p.getCapacidadDefensa())*2 : getCapacidadAtaque()-p.getCapacidadDefensa() ;
            p.setEnergia(p.getEnergia()-damage);
        } else {
            System.out.println("No puedo atacar a mis amigos");
        }
    }

}
