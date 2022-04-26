import java.io.Serializable;
import java.util.Objects;

public class Trabajador implements Serializable, Comparable<Trabajador> {
    private String dni;
    private String nombre;
    private String apellidos;
    private Integer edad;
    private String formacionAcademica;

    public Trabajador(String dni, String nombre, String apellidos, Integer edad, String formacionAcademica) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.formacionAcademica = formacionAcademica;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getFormacionAcademica() {
        return formacionAcademica;
    }

    public void setFormacionAcademica(String formacionAcademica) {
        this.formacionAcademica = formacionAcademica;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trabajador that = (Trabajador) o;
        return dni.equals(that.dni) && nombre.equals(that.nombre) && apellidos.equals(that.apellidos) && edad.equals(that.edad) && formacionAcademica.equals(that.formacionAcademica);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni, nombre, apellidos, edad, formacionAcademica);
    }

    @Override
    public String toString() {
        return "\nTrabajador{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", formacionAcademica='" + formacionAcademica + '\'' +
                '}';
    }

    @Override
    public int compareTo(Trabajador trabajador) {
        if(this.apellidos.compareTo(trabajador.getApellidos()) == 0){
            return this.nombre.compareTo(trabajador.getNombre());
        } else{
            return this.apellidos.compareTo(trabajador.getApellidos());
        }
    }
}
