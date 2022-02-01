package com.company;
import java.util.Arrays;

public abstract class Instrumento {

    private NotaMusical[] notasMusicales;
    private int capacidadMax;

    public Instrumento() {
        capacidadMax = 100;
        notasMusicales = new NotaMusical[0];
    }

    public NotaMusical[] getNotasMusicales() {
        return notasMusicales;
    }

    public void addNotas(NotaMusical nota) {
        if (notasMusicales.length < capacidadMax) {
            notasMusicales = Arrays.copyOf(notasMusicales, notasMusicales.length+1);
            notasMusicales[notasMusicales.length - 1] = nota;
            System.out.println("Nota musical añadida");
        } else {
            System.out.println("No se pueden añadir más notas musicales");
        }

    }

    public abstract void interpretar();

}
