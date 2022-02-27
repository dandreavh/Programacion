package Tarea2Act3;

import java.util.Objects;

public abstract class PoligonoRegular{
    double lado;
    public Color color;
    private static int contadorPoligono = 0;

    public PoligonoRegular(double lado, Color color) {
        this.lado = lado;
        this.color = color;
        contadorPoligono++;
    }

    public double getLado() {
        return lado;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public static int getContadorPoligono() {
        return contadorPoligono;
    }

    @Override
    public String toString() {
        return "(" +
                "lado=" + lado +
                ", color=" + color +
                ')';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PoligonoRegular that = (PoligonoRegular) o;
        return Double.compare(that.lado, lado) == 0 && color == that.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lado, color);
    }
}
