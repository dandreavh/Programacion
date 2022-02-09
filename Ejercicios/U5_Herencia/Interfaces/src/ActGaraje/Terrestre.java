package ActGaraje;

import java.util.Objects;

public  abstract class Terrestre extends Vehiculo implements Comparable<Terrestre>{
    private String matricula;
    private Integer anioFabricacion;
    private Color color;

    public Terrestre(String nombre, int capacidad, String matricula, Integer anioFabricacion, Color color) {
        super(nombre, capacidad);
        this.matricula = matricula;
        this.anioFabricacion = anioFabricacion;
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(Integer anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return  this.getClass().getSimpleName()+"{" +
                super.toString() +
                "matricula='" + matricula + '\'' +
                ", anioFabricacion=" + anioFabricacion +
                ", color=" + color +
                '}' + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Terrestre terrestre = (Terrestre) o;
        return matricula.equals(terrestre.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), matricula);
    }

    @Override
    public int compareTo(Terrestre terrestre) {
        return this.getMatricula().compareTo(terrestre.getMatricula());
    }

}
