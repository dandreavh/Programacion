package FicherosBinarios.Repaso;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Aaaa", "Bbbb", "Ccc", "123");
        Persona p2 = new Persona("Pppp", "Qqq", "Rrr", "987");
        Persona p3 = new Persona("Eee", "Ffff", "Hhh", "654");
        Persona p4 = new Persona("Iii", "Mmm", "Nnn", "321");
        Persona p5 = new Persona("Ooo", "Uuu", "Jjj", "456");

        Persona[] personas = {p1, p2, p3, p4, p5};

        ObjectInputStream in = null;
        ObjectOutputStream out = null;

        try {
            out = new ObjectOutputStream(new FileOutputStream("ejemploPersonas.dat"));

            for (Persona p: personas) {
                out.writeObject(p);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            in = new ObjectInputStream(new FileInputStream("ejemploPersonas.dat"));

            while (true){
               // System.out.println((Persona) in.readObject().toString());
            }

        } catch (IOException e) {
            System.out.println("Fin de fichero");
        } try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
