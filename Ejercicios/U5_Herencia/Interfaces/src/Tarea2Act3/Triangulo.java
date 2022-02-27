package Tarea2Act3;

public class Triangulo extends PoligonoRegular implements Figura{

    private double altura;

    public Triangulo(double lado, Color color, double altura) {
        super(lado, color);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return (lado*altura)/2;
    }

    @Override
    public String toString() {
        return "Triángulo{" + super.toString() + ", área= " + getArea() +
                '}' + "\n";
    }
}
