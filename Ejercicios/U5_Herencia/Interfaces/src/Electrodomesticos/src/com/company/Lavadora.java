package com.company;

public class Lavadora extends Electrodomestico{
    private double carga;

    public Lavadora(double precioBase, Color color, ConsumoEnergetico consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Lavadora() {
        super();
        this.carga = 5;
    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
        this.carga = 5;
    }

    public double getCarga() {
        return carga;
    }



    @Override
    public String toString() {
        return "Lavadora{" +
                "precioBase=" + precioBase +
                ", color=" + color +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                ", carga=" + carga +
                '}';
    }
}
