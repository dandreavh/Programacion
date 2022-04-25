package Examen2021Morning;

import Examen1920Tarde.Paciente;

import java.io.*;
import java.util.*;

public class Maraton {
    private Map<Integer, Atleta> atletas;

    public Maraton() {
        atletas = new HashMap<>();
    }

    public Map<Integer, Atleta> getAtletas() {
        return atletas;
    }

    public void setAtletas(Map<Integer, Atleta> atletas) {
        this.atletas = atletas;
    }

    // --------------------
    // MÉTODOS PROPIOS
    // --------------------
    public void cargarAtletas(){
        ObjectInputStream in = null;
        Atleta a; // leo atletas
        try {
            in = new ObjectInputStream(new FileInputStream("maraton.dat"));
            while (true){ // La parte más importante, leo hasta que salta la excepción
                a = (Atleta) in.readObject();
                atletas.put(a.getDorsal(),a);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void guardarAtletas(){
        ObjectOutputStream out = null;
        Collection<Atleta> conjunto = atletas.values(); // creo un conjunto con los valores que tenga en el mapa
        try {
            out = new ObjectOutputStream(new FileOutputStream("maraton.dat"));

            Iterator it = conjunto.iterator(); // hago el recorrido de cada
            while (it.hasNext()) {
                Atleta a = (Atleta) it.next();
                out.writeObject(a);
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
    }
    public void inscribirAtleta(){
        Scanner sc = new Scanner(System.in);
        String nombre;
        String pais;
        Categoria categoria;
        boolean finisher;

        System.out.println("Indique el nombre");
        nombre = sc.nextLine();
        System.out.println("Indique el país de origen");
        pais = sc.nextLine();
        System.out.println("Indique la categoría: SENIOR, JUNIOR, VETERANO");
        categoria = Categoria.valueOf(sc.nextLine());
        System.out.println("Indique si ha acabado o no la prueba [true/false]");
        finisher = sc.nextBoolean();

        Atleta a = new Atleta(nombre,pais,categoria,finisher);
        atletas.put(a.getDorsal(), a);
        System.out.println(atletas);
    }
    public void guardarTiempo(Integer dorsal, Integer segundos_marca){
        if(atletas.containsKey(dorsal)){
            atletas.get(dorsal).setSegundos_marca(segundos_marca);
            atletas.get(dorsal).setFinisher(true);

            System.out.println(atletas.get(dorsal));
        } else{
            System.out.println("El atleta no está registrado");
        }
    }
    public void borrarAtleta(Integer dorsal){
        if(atletas.containsKey(dorsal)){
            atletas.remove(dorsal);
        } else{
            System.out.println("El atleta no está registrado");
        }
    }
    public void mostrarListaFinishers(){
        Collection<Atleta> coleccion = atletas.values();
     //   Collection<Atleta> resultado = null;
        for (Atleta atleta : coleccion) {
            if (atleta.isFinisher()) {
                System.out.println(atleta);
            }
        }
      //  System.out.println(resultado);
    }
    public void mostrarListaCategoria(Categoria categoria){
        Collection<Atleta> coleccion = atletas.values();
        Collection<Atleta> resultado = null;
        for (Atleta atleta : coleccion) {
            if (atleta.getCategoria().equals(categoria)) {
                resultado.add(atleta);
            }
        }
        System.out.println(resultado);
    }
    public void participantesPorPaís(String pais){
        Collection<Atleta> coleccion = atletas.values();
        int contador = 0;

        for (Atleta atleta : coleccion) {
            if (atleta.getPais().equalsIgnoreCase(pais)) {
                contador++;
            }
        }

        if(contador<=0){
            System.out.println("No hay atletas de este país");
        } else{
            System.out.println("Hay " + contador + " atletas de " + pais);
        }
    }

    @Override
    public String toString() {
        return "Maraton{" +
                "atletas=" + atletas +
                '}';
    }
}
