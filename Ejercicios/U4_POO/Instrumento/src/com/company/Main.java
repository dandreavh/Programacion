package com.company;

public class Main {

    public static void main(String[] args) {

        Piano p = new Piano();
        Campana c = new Campana();

        p.addNotas(NotaMusical.DO);
        p.addNotas(NotaMusical.DO);
        p.addNotas(NotaMusical.RE);

        c.addNotas(NotaMusical.LA);
        c.addNotas(NotaMusical.LA);
        c.addNotas(NotaMusical.MI);

        p.interpretar();
        c.interpretar();
    }
}
