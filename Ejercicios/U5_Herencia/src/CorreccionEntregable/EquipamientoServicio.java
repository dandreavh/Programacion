package CorreccionEntregable;

import java.util.Calendar;

public class EquipamientoServicio extends Propiedad {
    private TipoServicio tipo;

    public EquipamientoServicio(int yearConstruccion, String direccion, double metrosCuadrados, TipoServicio tipo) {
        super(yearConstruccion, direccion, metrosCuadrados);
        this.tipo = tipo;
    }

    public TipoServicio getTipo() {
        return tipo;
    }

    public void setTipo(TipoServicio tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "EquipamientoServicio{" +
                "tipo=" + tipo +
                "} " + super.toString();
    }

    @Override
    void mostrarPropiedad() {
        System.out.println("Fecha: " + Calendar.getInstance().getTime() + "\n" +
                "Clase: " + this.getClass().getSimpleName() + "\n" + this);
    }
}
