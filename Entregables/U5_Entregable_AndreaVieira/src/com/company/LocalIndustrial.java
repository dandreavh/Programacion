package com.company;

import java.util.Calendar;
import java.util.Objects;

public class LocalIndustrial extends Local{
    
    private int consumoEnergetico;
    private Calendar fecha;

    public LocalIndustrial(int yearConstruccion, String direccion, double metrosCuadrados, Persona propietaria, double precio, int consumoEnergetico) {
        super(yearConstruccion, direccion, metrosCuadrados, propietaria, precio);
        this.consumoEnergetico = consumoEnergetico;
        this.fecha = Calendar.getInstance();
    }

    public int getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(int consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LocalIndustrial that = (LocalIndustrial) o;
        return consumoEnergetico == that.consumoEnergetico;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), consumoEnergetico);
    }

    @Override
    public String toString() {
        return "LocalIndustrial{" +
                "consumoEnergetico=" + consumoEnergetico +
                '}';
    }

    @Override
    public void mostrarPropiedad() {
        System.out.println("Fecha: " + fecha.get(Calendar.DATE) + "/" + fecha.get(Calendar.MONTH)+1 + "/" + fecha.get(Calendar.YEAR)
                + "\nClase: " + getClass() + "\nInformación del local industrial consumo energético: " + consumoEnergetico);
    }
}
