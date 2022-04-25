package Examen1920Morning;

import java.io.*;
import java.util.*;

public class Concurso {
    private String nombreConcurso;
    private String localidad;
    private Map<String,TreeSet<Perro>> perros;

    public Concurso(String nombreConcurso, String localidad) {
        this.nombreConcurso = nombreConcurso;
        this.localidad = localidad;
        this.perros = new TreeMap<>();
    }

    public String getNombreConcurso() {
        return nombreConcurso;
    }

    public void setNombreConcurso(String nombreConcurso) {
        this.nombreConcurso = nombreConcurso;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Map<String, TreeSet<Perro>> getPerros() {
        return perros;
    }

    public void setPerros(Map<String, TreeSet<Perro>> perros) {
        this.perros = perros;
    }

    // -------- MÉTODOS PROPIOS ----------
    public void addDog(String raza, Perro perro){
        if(perro.getRaza().equalsIgnoreCase(raza)){ // comparo la raza del perro con la raza a la que lo quiero inscribir
            if (!perros.containsKey(raza)) { // compruebo que en el mapa no tengo la clave -esa raza-
                perros.put(raza,new TreeSet<Perro>()); // añado la raza (clave) y un conjunto vacío
            }
            perros.get(raza).add(perro); // ya he creado esa raza, por lo que puedo ahora añadir el perro

        } else{
            System.out.println("El perro que inscribe no es de la raza correspondiente"); // si la raza del perro no coincide con la que se pretende inscribir
        }

    }

    public void disqualifyDog(Perro perro){
        if(perros.containsKey(perro.getRaza())){ // compruebo que exista esa raza
            if(perros.get(perro.getRaza()).contains(perro)){ // lo trato como un set, compruebo que existe el perro
                perros.get(perro.getRaza()).remove(perro); // lo trato como un set y lo elimino
            } else{
                System.out.println("El perro no está inscrito"); // verifico que el perro no está contenido
            }
        } else{
            System.out.println("La raza no está registrada"); // verifico no está esa raza
        }
    }

    public void perrosporPeso(String raza){ // orden por defecto. Añado Comparable en la clase
        if (perros.containsKey(raza)) { // compruebo que está esa raza
            System.out.println(perros.get(raza)); // ya lo imprime ordenado
        } else {
            System.out.println("No hay perros inscritos de esta raza"); // compruebo que no está
        }
    }

    public void perrosporEdad(String raza){ // segunda ordenación
        if (perros.containsKey(raza)) { // compruebo que está la raza
            List<Perro> lista = new ArrayList<>(perros.get(raza)); // creo una lista desde el mapa con los valores de una raza

            Collections.sort(lista, new Comparator<Perro>() { // hago el sort con el Comparator
                @Override
                public int compare(Perro perro, Perro t1) {
                    return t1.getEdad()-perro.getEdad(); // hago la comparación
                }
            });

            System.out.println(lista);
        } else {
            System.out.println("No hay perros inscritos de esta raza"); // no contiene nada
        }
    }

    public void ownerDogs(Integer num_socio){
        Collection<TreeSet<Perro>> col = perros.values(); // hago un Collection que es genérico, de lo valores del mapa
        int cantPerros = 0;

        Iterator it = col.iterator();
        while (it.hasNext()){ // recorro todas las razas
            TreeSet<Perro> p = (TreeSet<Perro>) it.next(); // me da una raza
            for (Perro p1:p) { // en cada raza, busco el perro
                if(p1.getPropietario().getNum_socio().equals(num_socio)){ // cuidado, porque compara Integer y necesita equals también
                    System.out.println(p1); // me da un perro
                    cantPerros++;
                }
            }
        }

        if(cantPerros<=0){ // controlador de cantidad de perros
            System.out.println("Este socio no tiene perros inscritos");
        }
    }

    public void guardarPerros() { // guardo en el archivo
        ObjectOutputStream out = null;

        try {
            out = new ObjectOutputStream(new FileOutputStream("perros.dat"));

            Collection<TreeSet<Perro>> collection = perros.values();
            Iterator<TreeSet<Perro>> it = collection.iterator();

            while (it.hasNext()) {
                Set<Perro> set = (Set<Perro>) it.next(); // guardo raza
                for (Perro perro : set) {
                    out.writeObject(perro); // guardo perro
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void cargarPerros() { // cargo los datos desde el archivo antes de trabajar para tenerlos disponibles
        ObjectInputStream in = null;

        try {
            in = new ObjectInputStream(new FileInputStream("perros.dat"));

            while (true) {
                Perro p = (Perro) in.readObject();
                addDog(p.getRaza(), p);
            }
        } catch (EOFException e) {
            System.out.println("Fin de fichero");
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Concurso{" +
                "nombreConcurso='" + nombreConcurso + '\'' +
                ", localidad='" + localidad + '\'' +
                ", perros=" + perros +
                '}';
    }
}
