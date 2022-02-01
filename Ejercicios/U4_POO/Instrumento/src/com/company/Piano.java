package com.company;

public class Piano extends Instrumento{
    @Override
    public void interpretar() {
        System.out.println("Soy un piano");
        for (NotaMusical n: this.getNotasMusicales()) {
            System.out.println(n);
        }
    }
}
