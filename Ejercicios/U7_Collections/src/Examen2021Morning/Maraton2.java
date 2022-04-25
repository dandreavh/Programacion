package Examen2021Morning;

import java.io.*;
import java.util.*;

public class Maraton2 {
    private Map<Categoria, Set<Atleta>> atletas;

    public Maraton2() {
        atletas = new HashMap<>();
    }

    public Map<Categoria, Set<Atleta>> getAtletas() {
        return atletas;
    }

    public void setAtletas(Map<Categoria, Set<Atleta>> atletas) {
        this.atletas = atletas;
    }

    // --------------------
    // MÉTODOS PROPIOS
    // --------------------
    public void cargarAtletas(){
        ObjectInputStream in = null;
        Atleta a; // leo atletas
        try {
            in = new ObjectInputStream(new FileInputStream("maraton2.dat"));
            while (true){ // La parte más importante, leo hasta que salta la excepción
                a = (Atleta) in.readObject();
                atletas.get(a.getDorsal()).add(a);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
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
        /*
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

         */
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
        if(!atletas.containsKey(a.getCategoria())){
            atletas.put(a.getCategoria(),new TreeSet<Atleta>());
        }
        atletas.get(a.getCategoria()).add(a);
        System.out.println(atletas);
    }
    public void guardarTiempo(Integer dorsal, Integer segundos_marca){
        Collection<Set<Atleta>> valores = atletas.values();

        Iterator it = valores.iterator();
        while (it.hasNext()){
           Set<Atleta> ats = (Set<Atleta>) it.next();

            for (Atleta at: ats) {
                if(at.getDorsal()==dorsal){
                    at.setSegundos_marca(segundos_marca);
                    at.setFinisher(true);
                }
            }
        }
    }
    public void borrarAtleta(Integer dorsal){
        Collection<Set<Atleta>> valores = atletas.values();

        Iterator it = valores.iterator();
        while (it.hasNext()){
            Set<Atleta> ats = (Set<Atleta>) it.next();

            for (Atleta at: ats) {
                if(at.getDorsal()==dorsal){
                    ats.remove(at);
                }
            }
        }
    }
    public void mostrarListaFinishers(){
        Collection<Set<Atleta>> valores = atletas.values();

        Iterator it = valores.iterator();
        while (it.hasNext()){
            Set<Atleta> ats = (Set<Atleta>) it.next();

            for (Atleta at: ats) {
                if(at.isFinisher()){
                    System.out.println(at);
                }
            }
        }
    }
    public void mostrarListaCategoria(Categoria categoria){
        /*
        Collection<Atleta> coleccion = atletas.values();
        Collection<Atleta> resultado = null;
        for (Atleta atleta : coleccion) {
            if (atleta.getCategoria().equals(categoria)) {
                resultado.add(atleta);
            }
        }
        System.out.println(resultado);

         */
    }
    public void participantesPorPaís(String pais){
        /*
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

         */
    }

    @Override
    public String toString() {
        return "Maraton{" +
                "atletas=" + atletas +
                '}';
    }
}
