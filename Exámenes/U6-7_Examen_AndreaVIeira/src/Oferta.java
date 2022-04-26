import java.io.Serializable;
import java.util.Objects;
import java.util.TreeSet;

public class Oferta implements Serializable {
    private Integer codigo;
    private String descripcion;
    private TreeSet<Trabajador> trabajadores;
    private boolean cubierta;


    public Oferta(Integer codigo, String descripcion, boolean cubierta) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.trabajadores = new TreeSet<>();
        this.cubierta = cubierta;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TreeSet<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(TreeSet<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }

    public boolean isCubierta() {
        return cubierta;
    }

    public void setCubierta(boolean cubierta) {
        this.cubierta = cubierta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Oferta oferta = (Oferta) o;
        return cubierta == oferta.cubierta && codigo.equals(oferta.codigo) && descripcion.equals(oferta.descripcion) && trabajadores.equals(oferta.trabajadores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, descripcion, trabajadores, cubierta);
    }

    @Override
    public String toString() {
        return "\nOferta{" +
                "codigo=" + codigo +
                ", descripcion='" + descripcion + '\'' +
                ", trabajadores=" + trabajadores +
                ", cubierta=" + cubierta +
                '}';
    }

}
