package CorreccionEntregable;

import java.util.Arrays;
import java.util.Calendar;

public class Vivienda extends Propiedad implements Vender {
    private int numBanios;
    private int numHabitaciones;
    private int capacidadMax;
    private double precio;
    private Persona[] personas;

    public Vivienda(int yearConstruccion, String direccion, double metrosCuadrados,
                    int numBanios, int numHabitaciones, int capacidadMax, double precio) {
        super(yearConstruccion, direccion, metrosCuadrados); // lo añade de la madre -propiedad-
        this.numBanios = numBanios;
        this.numHabitaciones = numHabitaciones;
        this.capacidadMax = capacidadMax;
        this.precio = precio;
        this.personas = new Persona[0]; // le damos valor vacío y luego controlamos
    }

    public int getNumBanios() {
        return numBanios;
    }
    public void setNumBanios(int numBanios) {
        this.numBanios = numBanios;
    }
    public int getNumHabitaciones() {
        return numHabitaciones;
    }
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }
    public int getCapacidadMax() {
        return capacidadMax;
    }
    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public Persona[] getPersonas() {
        return personas;
    }
    public void setPersonas(Persona[] personas) {
        this.personas = personas;
    }

    // MÉTODOS PROPIOS
    // AÑADIR PERSONA, teniendo en cuenta la capacidad máxima y si ya esa persona está en la vivienda
    public boolean addPersona(Persona persona) {
        if (personas.length < capacidadMax && !existePersona(persona)) {
            Persona[] result = Arrays.copyOf(personas, personas.length + 1);
            result[result.length - 1] = persona;
            personas = result;
            return true;
        }
        return false;
    }
    // ELIMINAR PERSONA, solo si existe
    public boolean removePersona(Persona persona) {
        if (existePersona(persona)) {
            Persona[] result = new Persona[0];
            for (Persona p : personas) { // for each para recorrer el array y buscar si hay ese mismo elemento
                if (!p.equals(persona)) { // si no es la persona que buscamos, añadimos al array auxiliar
                    result = Arrays.copyOf(result, result.length + 1);
                    result[result.length - 1] = p;
                }
            }
            personas = result; // igualo el array
            return true;
        }
        return false;
    }
    // CONTROLADOR DE PERSONA
    private boolean existePersona(Persona persona) {
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].equals(persona)) {
                return true;
            }
        }
        return false;
    }

    // Sobrescribo el método abstracto que había creado en Propiedad e indico la info que necesito
    @Override
    void mostrarPropiedad() {
        System.out.println("Fecha:" + Calendar.getInstance().getTime() + "\n" +
                "Clase:" + this.getClass().getSimpleName() + "\n" + this);
    }

    @Override
    public String toString() {
        return "Vivienda{" +
                "numBanios=" + numBanios +
                ", numHabitaciones=" + numHabitaciones +
                ", capacidadMax=" + capacidadMax +
                ", precio=" + precio +
                ", personas=" + Arrays.toString(personas) +
                "} " + super.toString();
    }

    // preguntar!!
    @Override
    public void mostrarPrecioVenta() {
        System.out.println("Soy una Vivienda con una capacidad máxima " +
                this.getCapacidadMax() + " y valgo " + this.getPrecio());
    }
}
