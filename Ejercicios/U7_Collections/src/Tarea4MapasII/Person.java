package Tarea4MapasII;

public abstract class Person {
    private String nombre;
    private String dni;
    private Integer edad;
    private Integer estatura;

    public Person(String nombre, String dni, Integer edad, Integer estatura) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getEstatura() {
        return estatura;
    }

    public void setEstatura(Integer estatura) {
        this.estatura = estatura;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", edad=" + edad +
                ", estatura=" + estatura +
                '}';
    }
}
