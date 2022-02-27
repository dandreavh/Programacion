package RPGJuego;

public class Enano extends Personaje implements Atacar{

    private Double altura;

    public Enano(String nombre, Integer energia, Integer capacidadAtaque, Integer capacidadDefensa, Double altura) {
        super(nombre, energia, capacidadAtaque, capacidadDefensa);
        this.altura = altura;
    }

    public Double getAltura() {
        return altura;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
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
