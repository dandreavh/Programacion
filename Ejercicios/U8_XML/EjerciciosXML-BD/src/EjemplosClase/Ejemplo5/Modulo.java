package EjemplosClase.Ejemplo5;

import java.util.Objects;

public class Modulo {

    private String codigo;
    private String nombre;
    private String horas;

    public Modulo(String codigo, String nombre, String horas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.horas = horas;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHoras() {
        return horas;
    }

    public void setHoras(String horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "Modulo{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", horas='" + horas + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Modulo modulo = (Modulo) o;
        return codigo.equals(modulo.codigo) && nombre.equals(modulo.nombre) && horas.equals(modulo.horas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nombre, horas);
    }
}
