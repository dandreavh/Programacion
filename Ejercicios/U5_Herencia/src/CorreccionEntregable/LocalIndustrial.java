package CorreccionEntregable;

import java.util.Calendar;

public class LocalIndustrial extends Local {
    private double consumoContratado;

    public LocalIndustrial(int yearConstruccion, String direccion, double metrosCuadrados, Persona propietario, double precio, double consumoContratado) {
        super(yearConstruccion, direccion, metrosCuadrados, propietario, precio);
        this.consumoContratado = consumoContratado;
    }

    public double getConsumoContratado() {
        return consumoContratado;
    }
    public void setConsumoContratado(double consumoContratado) {
        this.consumoContratado = consumoContratado;
    }

    @Override
    public String toString() {
        return "LocalIndustrial{" +
                "consumoContratado=" + consumoContratado +
                "} " + super.toString(); // añado lo de local
    }

    // sobreescribo el método abstacto
    @Override
    void mostrarPropiedad() {
        System.out.println("Fecha: " + Calendar.getInstance().getTime() + "\n" +
                "Clase: " + this.getClass().getSimpleName() +  "\n" + this);
    }

    @Override
    public void mostrarPrecioVenta() {
        System.out.println("Soy un LocalIndustrial con un consumo máximo de " +
                this.getConsumoContratado() + " y valgo " + this.getPrecio());
    }
}