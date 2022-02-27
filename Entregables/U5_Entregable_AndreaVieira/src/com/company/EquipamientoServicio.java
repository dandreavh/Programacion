package com.company;

import java.util.Calendar;
import java.util.Objects;

public class EquipamientoServicio extends Propiedad{
    private TipoServicio tipoServicio;
    private Calendar fecha;


    public EquipamientoServicio(int yearConstruccion, String direccion, double metrosCuadrados, TipoServicio tipoServicio) {
        super(yearConstruccion, direccion, metrosCuadrados);
        this.tipoServicio = tipoServicio;
        this.fecha = Calendar.getInstance();
    }

    public TipoServicio getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(TipoServicio tipoServicio) {
        this.tipoServicio = tipoServicio;
    }


    @Override
    public void mostrarPropiedad() {
        System.out.println("Fecha: " + fecha.get(Calendar.DATE) + "/" + fecha.get(Calendar.MONTH)+1 + "/" + fecha.get(Calendar.YEAR)
        + "\nClase: " + getClass() + "\nInformación: " + tipoServicio);
        
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EquipamientoServicio that = (EquipamientoServicio) o;
        return tipoServicio == that.tipoServicio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipoServicio);
    }

    @Override
    public String toString() {
        return "EquipamientoServicio{" +
                "tipoServicio=" + tipoServicio +
                '}';
    }

}
