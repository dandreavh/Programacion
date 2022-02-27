package RPGJuego;

import java.util.Objects;

public abstract class Personaje implements Comparable{
    private String nombre;
    private Integer energia;
    private Integer capacidadAtaque;
    private Integer capacidadDefensa;
    private boolean encantado;

    public Personaje(String nombre, Integer energia, Integer capacidadAtaque, Integer capacidadDefensa) {
        this.nombre = nombre;
        if(energia>0 && energia<1000){
            this.energia = energia;
        }

        this.capacidadAtaque = capacidadAtaque;
        this.capacidadDefensa = capacidadDefensa;
        this.encantado = false;

        // HACER COMPROBACIÓN DE LOS LÍMITES DE LOS VALORES
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getEnergia() {
        return energia;
    }
    public void setEnergia(Integer energia) {
        this.energia = energia;
    }
    public Integer getCapacidadAtaque() {
        return capacidadAtaque;
    }
    public void setCapacidadAtaque(Integer capacidadAtaque) {
        this.capacidadAtaque = capacidadAtaque;
    }
    public Integer getCapacidadDefensa() {
        return capacidadDefensa;
    }
    public void setCapacidadDefensa(Integer capacidadDefensa) {
        this.capacidadDefensa = capacidadDefensa;
    }
    public boolean isEncantado() {
        return encantado;
    }
    public void setEncantado(boolean encantado) {
        this.encantado = encantado;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", energia=" + energia +
                ", capacidadAtaque=" + capacidadAtaque +
                ", capacidadDefensa=" + capacidadDefensa +
                ", encantado=" + encantado +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personaje personaje = (Personaje) o;
        return encantado == personaje.encantado && nombre.equals(personaje.nombre) && energia.equals(personaje.energia) && capacidadAtaque.equals(personaje.capacidadAtaque) && capacidadDefensa.equals(personaje.capacidadDefensa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, energia, capacidadAtaque, capacidadDefensa, encantado);
    }

    @Override
    public int compareTo(Object o) {
        return getEnergia()- ((Personaje) o).getEnergia();
    }
}
