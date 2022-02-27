package RPGJuego;

public class Orco extends Personaje implements Atacar{

    private Double tonelaje;

    public Orco(String nombre, Integer energia, Integer capacidadAtaque, Integer capacidadDefensa, Double tonelaje) {
        super(nombre, energia, capacidadAtaque, capacidadDefensa);
        this.tonelaje = tonelaje;
    }

    public Double getTonelaje() {
        return tonelaje;
    }
    public void setTonelaje(Double tonelaje) {
        this.tonelaje = tonelaje;
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
