package com.company;

public abstract class Electrodomestico {
     double precioBase;
     Color color;
     ConsumoEnergetico consumoEnergetico;
     double peso;

    public Electrodomestico(double precioBase, Color color, ConsumoEnergetico consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }
    public Electrodomestico() {
        this(100, Color.BLANCO, ConsumoEnergetico.F, 5);
    }
    public Electrodomestico(double precioBase, double peso) {
        this(precioBase, Color.BLANCO, ConsumoEnergetico.F, peso);
    }

    public double getPrecioBase() {
        return precioBase;
    }
    public Color getColor() {
        return color;
    }
    public ConsumoEnergetico getConsumoEnergetico() {
        return consumoEnergetico;
    }
    public double getPeso() {
        return peso;
    }

    public double getPrecioFinal(){
        double precioFinal;
        switch (consumoEnergetico){
            case A: precioFinal = 100;
            break;
            case B: precioFinal = 80;
            break;
            case C: precioFinal = 60;
            break;
            case D: precioFinal = 50;
            break;
            case E: precioFinal = 30;
            break;
            case F: precioFinal = 10;
            break;
            default: precioFinal = 0;
        }

        if (peso>0 && peso<30){
            precioFinal += 10;
        } else if (peso>29 && peso<50){
            precioFinal += 60;
        } else if (peso>49 && peso<80){
            precioFinal += 80;
        } else if (peso >= 80){
            precioFinal += 100;
        }

        return precioFinal + precioBase;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "Precio Base=" + precioBase +
                "€, Color=" + color +
                ", Consumo Energético=" + consumoEnergetico +
                ", Peso=" + peso +
                "kg. PRECIO FINAL= "+ getPrecioFinal() +"€}";
    }
}
