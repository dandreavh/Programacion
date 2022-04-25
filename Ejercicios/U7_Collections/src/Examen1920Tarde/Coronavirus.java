package Examen1920Tarde;

import java.io.*;
import java.util.*;

public class Coronavirus {
    String nombre;
    String localidad_origen;
    Map<Character, TreeSet<Paciente>> pacientes;

    public Coronavirus() {
        this.nombre = "COVID-19";
        this.localidad_origen = "Wuhan";
        this.pacientes = new HashMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad_origen() {
        return localidad_origen;
    }

    public void setLocalidad_origen(String localidad_origen) {
        this.localidad_origen = localidad_origen;
    }

    public Map<Character, TreeSet<Paciente>> getPacientes() {
        return pacientes;
    }

    public void setPacientes(Map<Character, TreeSet<Paciente>> pacientes) {
        this.pacientes = pacientes;
    }

    // ------------------------
    //     métodos propios
    // ------------------------

    public void addPaciente(Character cepa, Paciente paciente){
        if(cepa.equals(paciente.getCepa())){ // deben coincidir
            if(!pacientes.containsKey(cepa)){ // miro si es el primer paciente en esa cepa
                pacientes.put(cepa, new TreeSet<>());
            }
            pacientes.get(cepa).add(paciente);
        } else{
            System.out.println("No coincide la cepa con la cepa del paciente");
        }
    }

    public void darDeAltaPaciente(Paciente paciente){
        if(pacientes.containsKey(paciente.getCepa())){ // existe si existe esa cepa
            if(pacientes.get(paciente.getCepa()).contains(paciente)){ // comprueba si dentro de esa cepa esta el paciente
                pacientes.get(paciente.getCepa()).remove(paciente);
            } else{
                System.out.println("No se ha encontrado el paciente");
            }

        } else{
            System.out.println("No existen pacientes de esta cepa");
        }
    }

    public void pacientesDeUnDoctor(Integer num_colegiado){
        Collection<TreeSet<Paciente>> conjunto = pacientes.values();
        int cantPacientes = 0;

        Iterator it = conjunto.iterator();
        while (it.hasNext()) {
            Set<Paciente> p = (Set<Paciente>) it.next();
            for (Paciente pac : p) {
                if (pac.getMedico().getNum_colegiado().equals(num_colegiado)) {
                    System.out.println(p);
                    cantPacientes++;
                }
            }
        }

        if (cantPacientes <= 0) {
            System.out.println("Este médico no lleva ningún paciente");
        }
    }

    public void pacientesporPeso(Character cepa){
        if (pacientes.containsKey(cepa)) {
            System.out.println(pacientes.get(cepa));
        } else {
            System.out.println("No hay pacientes con esta cepa");
        }
    }

    public void pacientesporEdad(Character cepa){
        if (pacientes.containsKey(cepa)) {
            List<Paciente> lista = new ArrayList<>(pacientes.get(cepa));

            Collections.sort(lista, new Comparator<Paciente>() {
                @Override
                public int compare(Paciente paciente, Paciente t1) {
                    return t1.getEdad()-paciente.getEdad();
                }
            });

            System.out.println(lista);
        } else {
            System.out.println("No hay pacientes con esta cepa");
        }
    }

    public void cargarPacientes(){
        ObjectInputStream in = null;
        Paciente p; // leo pacientes
        try {
            in = new ObjectInputStream(new FileInputStream("pacientes.dat"));
            while (true){ // La parte más importante, leo hasta que salta la excepción
                p = (Paciente) in.readObject();  // estoy leyendo objetos Paciente
                addPaciente(p.getCepa(), p); // llamo a la función que tengo creada
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

    public void guardarPacientes(){ // los cargo en el mapa de la aplicación para trabajar con ellos
        ObjectOutputStream out = null;
        Collection<TreeSet<Paciente>> conjunto = pacientes.values(); // creo un conjunto con los valores que tenga en el mapa
        try {
            out = new ObjectOutputStream(new FileOutputStream("pacientes.dat"));

            Iterator it = conjunto.iterator(); // hago el recorrido de cada
            while (it.hasNext()) {
                Set<Paciente> pac = (Set<Paciente>) it.next();

                for (Paciente p : pac) {
                    out.writeObject(p);
                }
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

    @Override
    public String toString() {
        return "Coronavirus{" +
                "nombre='" + nombre + '\'' +
                ", localidad_origen='" + localidad_origen + '\'' +
                ", pacientes=" + pacientes +
                '}';
    }
}
