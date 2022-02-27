package FaraTienda;

import java.util.Objects;

public abstract class Prenda implements Comparable{
    private Double precio;
    private String nombre;
    private String codBarras;
    private Double peso;
    private static Integer cantPrendas = 0;

    public Prenda(Double precio, String nombre, String codBarras, Double peso) {
        this.precio = precio;
        this.nombre = nombre;
        this.codBarras = codBarras;
        this.peso = peso;
        cantPrendas++;
    }

    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCodBarras() {
        return codBarras;
    }
    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }
    public Double getPeso() {
        return peso;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public static Integer getCantPrendas() {
        return cantPrendas;
    }
    public static void setCantPrendas(Integer cantRopa) {
        Prenda.cantPrendas = cantPrendas;
    }

    @Override
    public String toString() {
        return "  Prendas{" +
                "precio=" + precio +
                ", nombre='" + nombre + '\'' +
                ", codBarras='" + codBarras + '\'' +
                ", peso=" + peso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prenda prenda = (Prenda) o;
        return codBarras.equals(prenda.codBarras);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codBarras);
    }
}
