package com.company;

import java.util.Calendar;
import java.util.Objects;

public class Empleado {
    private String nombreCompleto;
    private String numSS;
    private String telefono;
    private Calendar fechaEntrada;
    private TipoEmpleado tipoEmpleado;
    private static int cantEmpleados = 0;

    public Empleado(String nombreCompleto, String numSS, String telefono, TipoEmpleado tipoEmpleado) {
        this.nombreCompleto = nombreCompleto;
        this.numSS = numSS;
        this.telefono = telefono;
        this.fechaEntrada = Calendar.getInstance();
        this.tipoEmpleado = tipoEmpleado;
        cantEmpleados++;
    }
    public Empleado(String nombreCompleto, String numSS, String telefono) {
        this(nombreCompleto, numSS, telefono, TipoEmpleado.TECNICO);
    }

    public static int getCantEmpleados() {
        return cantEmpleados;
    }
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public String getNumSS() {
        return numSS;
    }
    public void setNumSS(String numSS) {
        this.numSS = numSS;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public Calendar getFechaEntrada() {
        return fechaEntrada;
    }
    public void setFechaEntrada(Calendar fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }
    public TipoEmpleado getTipoEmpleado() {
        return tipoEmpleado;
    }
    public void setTipoEmpleado(TipoEmpleado tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    @Override
    public String toString() {
        return "\nEmpleado{" +
                "Nombre y Apellidos='" + nombreCompleto + '\'' +
                ", Nº SS='" + numSS + '\'' +
                ", Teléfono='" + telefono + '\'' +
                ", Fecha de Entrada=" + fechaEntrada.get(Calendar.DATE)  + "/" +
                                    (fechaEntrada.get(Calendar.MONTH)+1)  + "/" +
                                    fechaEntrada.get(Calendar.YEAR)  +
                ", Tipo de Empleado=" + tipoEmpleado +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return numSS.equals(empleado.numSS);
    }
    @Override
    public int hashCode() {
        return Objects.hash(numSS);
    }
}
