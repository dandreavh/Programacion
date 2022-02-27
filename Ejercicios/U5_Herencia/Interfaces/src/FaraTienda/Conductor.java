package FaraTienda;

import java.util.Objects;

public class Conductor {
    private String nombre;
    private String apellidos;
    private String nss;

    public Conductor(String nombre, String apellidos, String nss) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nss = nss;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getNss() {
        return nss;
    }
    public void setNss(String nss) {
        this.nss = nss;
    }

    @Override
    public String toString() {
        return "\n   Conductor{" +
                "\n   Nombre='" + nombre + '\'' +
                ", \n   Apellidos='" + apellidos + '\'' +
                ", \n   NSS='" + nss + '\'' +
                '}' + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conductor conductor = (Conductor) o;
        return nss.equals(conductor.nss);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nss);
    }
}
