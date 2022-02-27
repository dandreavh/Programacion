package RPGJuego;

public class Guerrero extends Hombre implements Atacar{
    private int edad;

    public Guerrero(String nombre, Integer energia, Integer capacidadAtaque, Integer capacidadDefensa, int edad) {
        super(nombre, energia, capacidadAtaque, capacidadDefensa);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
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

    @Override
    public String toString() {
        return super.toString()+"edad=" + edad + "\n";
    }
}
