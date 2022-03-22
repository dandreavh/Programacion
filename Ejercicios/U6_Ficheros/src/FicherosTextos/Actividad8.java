package FicherosTextos;

import java.io.*;

public class Actividad8 {
    /*
    Disponemos de dos ficheros perso1.txt y perso2.txt con nombres de personas (ambos ordenados).
    Realizar un programa que lea ambos ficheros y que cree un tercer fichero  (todos.txt)
    con todos los nombres ordenados alfabéticamente.
     */
    public static void main(String[] args) {
        try {
            BufferedReader p1 = new BufferedReader(new FileReader("perso1.txt"));
            BufferedReader p2 = new BufferedReader(new FileReader("perso2.txt"));
            BufferedWriter todos = new BufferedWriter(new FileWriter("todos.txt"));

            String per1 = p1.readLine();
            String per2 = p2.readLine();


            while(p1!=null){
                p1.readLine();
            }

            while(p2!=null){
                p2.readLine();
            }


            p1.close();
            p2.close();
            todos.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }



    }
}
