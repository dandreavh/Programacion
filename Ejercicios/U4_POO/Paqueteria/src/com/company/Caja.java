package com.company;
/*
    Caja(double ancho, double alto, double fondo, Unidades u):
    que construye una caja con las dimensiones especificadas,
    que pueden encontrarse en "cm" (centímetros) o en "m" (metros)

y métodos:

    double getVolumen(): que devuelve el volumen de la caja en metros cúbicos
    String toString(): que devuelva una cadena con la representación de la caja.
 */
public class Caja {
    private double ancho;
    private double alto;
    private double fondo;
    private int unidades;
    private Etiqueta etiqueta;

    public Caja(double ancho, double alto, double fondo, int unidades) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidades = unidades;
    }

    public double getAncho() {
        return ancho;
    }
    public double getAlto() {
        return alto;
    }
    public double getFondo() {
        return fondo;
    }
    public int getUnidades() {
        return unidades;
    }
    public Etiqueta getEtiqueta() {
        return etiqueta;
    }
    public void setEtiqueta(Etiqueta etiqueta) {
        this.etiqueta = etiqueta;
    }

    @Override
    public String toString() {
        return "Caja{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                ", fondo=" + fondo +
                ", unidades=" + unidades +
                ", etiqueta=" + etiqueta +
                '}';
    }
}
