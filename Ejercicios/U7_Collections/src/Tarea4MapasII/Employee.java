package Tarea4MapasII;

import java.io.Serializable;

public class Employee extends Person implements Serializable {
    private Double sueldo;

    public Employee(String nombre, String dni, Integer edad, Integer estatura, Double sueldo) {
        super(nombre, dni, edad, estatura);
        this.sueldo = sueldo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() +
                "sueldo=" + sueldo +
                '}';
    }
}
