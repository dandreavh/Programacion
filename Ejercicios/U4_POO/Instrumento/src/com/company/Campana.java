package com.company;

public class Campana extends Instrumento{
    @Override
    public void interpretar() {
        System.out.println("Soy una campana");
        for (NotaMusical n: this.getNotasMusicales()) {
            System.out.println(n);
        }
    }
}
