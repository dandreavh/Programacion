package Tarea2Act3;

public class Cuadrado extends PoligonoRegular implements Figura, Comparable<Cuadrado>{

    public Cuadrado(double lado, Color color) {
        super(lado, color);
    }

    @Override
    public double getArea() {
        return Math.pow(lado,2);
    }

    @Override
    public String toString() {
        return "Cuadrado{" + super.toString() + ", area= " + getArea() +
                '}';
    }


    @Override
    public int compareTo(Cuadrado cuadrado) {
        if (this.getLado()-cuadrado.getLado()>0){
            return 1;
        } else if (this.getLado()-cuadrado.getLado()<0){
            return -1;
        } else{
            return 0;
        }
    }
}
