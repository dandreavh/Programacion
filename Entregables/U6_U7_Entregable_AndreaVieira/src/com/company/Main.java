package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Alumno> mapaAlumnos = new TreeMap<>();
        Set<Alumno> setAlumnos = new TreeSet<>();
        int opcion;

        cargarFicheros(mapaAlumnos, setAlumnos);

        do{
            menu();
            System.out.println("Indique una opción");
            opcion = sc.nextInt();

            switch (opcion){
                case 1: // INSERTAR ALUMNO
                    Alumno alumno = crearAlumno();
                    if(mapaAlumnos.containsKey(alumno.getDni()) && setAlumnos.contains(alumno)){
                        System.out.println("El alumno ya existe");
                    } else{
                        mapaAlumnos.put(alumno.getDni(), alumno);
                        setAlumnos.add(alumno);
                    }
                    System.out.println(mapaAlumnos);
                    System.out.println(setAlumnos);
                    guardarAlumnos(mapaAlumnos);
                    break;
                case 2: // BORRAR ALUMNO
                    borrarAlumno(mapaAlumnos, setAlumnos);
                    System.out.println(mapaAlumnos);
                    System.out.println(setAlumnos);
                    break;
                case 3: // MOSTRAR ALUMNOS
                    mostrarAlumnos(setAlumnos);
                    break;
                case 4: // MOSTRAR ALUMNOS DE UN CURSO
                    mostrarPorCurso(setAlumnos);
                    break;
                case 5: // MODIFICAR ALUMNO
                    modificarAlumno(mapaAlumnos, setAlumnos);
                    break;
                case 6: // salir del programa con guardado de datos
                    System.out.println("Cerrando sesión. Sus datos serán guardados");
                    guardarAlumnos(mapaAlumnos);
                    System.out.println(mapaAlumnos);
                    break;
                default: // opción errónea
                    System.out.println("Opción incorrecta, lea nuevamente las opciones");
                    break;
            }
        } while (opcion!=6);
    }

    public static void menu() { // menú de opciones
        System.out.println("Opción 1: INSERTAR ALUMNO");
        System.out.println("Opción 2: BORRAR ALUMNO");
        System.out.println("Opción 3: MOSTRAR ALUMNOS");
        System.out.println("Opción 4: MOSTRAR ALUMNOS DE UN CURSO");
        System.out.println("Opción 5: MODIFICAR ALUMNO");
        System.out.println("Opción 6: SALIR DEL PROGRAMA");
    }

    public static void cargarFicheros(Map<String, Alumno> alumnosMap, Set<Alumno> setAlumnos){
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new FileInputStream("alumnos.dat"));
            while (true) {
                Alumno a = (Alumno) in.readObject();
                alumnosMap.put(a.getDni(),a);
                setAlumnos.add(a);
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

    public static Alumno crearAlumno(){
        Scanner sc = new Scanner(System.in);
        String nombre;
        String apellidos;
        String dni;
        String direccion;
        String email;
        String curso;
        String dual;

        System.out.println("Indique el nombre");
        nombre = sc.nextLine();
        System.out.println("Indique los apellidos");
        apellidos = sc.nextLine();
        System.out.println("Indique el dni");
        dni = sc.nextLine();
        System.out.println("Indique la direccion");
        direccion = sc.nextLine();
        System.out.println("Indique el email");
        email = sc.nextLine();
        System.out.println("Indique el curso");
        curso = sc.nextLine();
        System.out.println("Indique si es dual [s/n]");
        dual = sc.nextLine();

        return new Alumno(nombre, apellidos, dni, direccion, email, curso, dual);
    } // inserta en el main

    public static void borrarAlumno(Map<String, Alumno> mapaAlumnos, Set<Alumno> setAlumnos){
        Scanner sc = new Scanner(System.in);
        String dni;

        System.out.println("Indique el DNI del alumno que desea eliminar");
        dni = sc.nextLine();

        for (Alumno a:setAlumnos) {
            if(a.getDni().equalsIgnoreCase(dni) || mapaAlumnos.containsKey(dni)){
                mapaAlumnos.remove(dni);
                setAlumnos.remove(a);
                System.out.println("Alumno eliminado");
            } else{
                System.out.println("El alumno no existe");
            }
        }
    }

    public static void mostrarAlumnos(Set<Alumno> setAlumnos){
        Iterator<Alumno> it = setAlumnos.iterator();
        while(it.hasNext()){
            Alumno a = it.next();
            System.out.println(a);
        }
    }

    public static void mostrarPorCurso(Set<Alumno> setAlumnos){
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        Alumno a;
        String curso;
        System.out.println("Indique el curso que quiere visualizar");
        curso = sc.nextLine();

        Iterator it = setAlumnos.iterator();

        while (it.hasNext()){
            a = (Alumno) it.next();

            if(a.getCurso().equalsIgnoreCase(curso)){
                System.out.println(a);
                contador++;
            }
        }

        if(contador<1){
            System.out.println("No hay alumnos de este curso");
        }
    }

    public static void modificarAlumno(Map<String, Alumno> mapaAlumnos, Set<Alumno> setAlumnos){
        Scanner sc = new Scanner(System.in);
        String nombre;
        String apellidos;
        String dni;
        String direccion;
        String email;
        String curso;
        String dual;

        System.out.println("Indique el DNI del alumno del que quiere modificar los datos");
        dni = sc.nextLine();

        if(mapaAlumnos.containsKey(dni)){
            System.out.println("Indique el nombre");
            nombre = sc.nextLine();
            System.out.println("Indique los apellidos");
            apellidos = sc.nextLine();
            System.out.println("Indique la direccion");
            direccion = sc.nextLine();
            System.out.println("Indique el email");
            email = sc.nextLine();
            System.out.println("Indique el curso");
            curso = sc.nextLine();
            System.out.println("Indique si es dual [s/n]");
            dual = sc.nextLine();

            mapaAlumnos.put(dni, new Alumno(nombre,apellidos,direccion,dni,email,curso, dual));
            setAlumnos.add(new Alumno(nombre,apellidos,direccion,dni,email,curso, dual));
        } else{
            System.out.println("El alumno no existe con este DNI en el sistema");
        }
    }

    public static void guardarAlumnos(Map<String, Alumno> mapaAlumnos){
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("alumnos.dat"));

            Collection<Alumno> lista = mapaAlumnos.values();
            for(Alumno a : lista) {
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
}
