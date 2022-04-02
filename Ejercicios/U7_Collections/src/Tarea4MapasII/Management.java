package Tarea4MapasII;

import java.io.*;
import java.util.Collection;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Management {
    private Map<String, Employee> employees;

    public Management() {
        this.employees = new TreeMap<>();
    }

    public Map<String, Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Map<String, Employee> employees) {
        this.employees = employees;
    }

    // --------------------------------------
    // |          MÉTODOS PROPIOS           |
    // --------------------------------------
    public void showOptions() { // menú de opciones
        System.out.println("Opción 1: VISUALIZAR LISTADO");
        System.out.println("Opción 2: BORRAR EMPLEADO/S");
        System.out.println("Opción 3: VISUALIZAR EMPLEADO");
        System.out.println("Opción 4: MODIFICAR EMPLEADO");
        System.out.println("Opción 5: INSERTAR EMPLEADO/S");
        System.out.println("Opción 6: SALIR DEL PROGRAMA");
    }

    public Employee createEmployee(Map<String,Employee> employees) {
        Scanner sc = new Scanner(System.in);
        String name;
        String id;
        Integer age;
        Integer height;
        Double salary;

        System.out.println("Indique el nombre del empleado");
        name = sc.nextLine();
        System.out.println("Indique el dni del empleado");
        id = sc.nextLine();
        System.out.println("Indique la edad del empleado");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Indique la estatura del empleado");
        height = sc.nextInt();
        sc.nextLine();
        System.out.println("Indique el salario del empleado");
        salary = sc.nextDouble();

        if(employees.containsKey(id)){
            System.out.println("Ya hay un empleado con este DNI, se eliminará el antiguo y se insertará este");
        }
        return new Employee(name,id,age,height,salary);
    }

    public void saveEmployees(Map<String,Employee> employees) {
        ObjectOutputStream out= null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("employees.dat"));

            Collection<Employee> lista = employees.values();
            for(Employee e : lista) {
                out.writeObject(e);
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

    public void loadEmployees(Map<String,Employee> employees) {
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new FileInputStream("employees.dat"));
            while (true) {
                Employee e = (Employee) in.readObject();
                employees.put(e.getDni(),e);
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

    public void showEmployeesMap(Map<String, Employee> map){
        Collection<Employee> employees = map.values();
        for (Employee e: employees) {
            System.out.println(e);
        }
    }

    public void deleteEmployee(){
        Scanner sc = new Scanner(System.in);
        String id;

        System.out.println("Indique el DNI del empleado que desea ver");
        id = sc.nextLine();

        if(employees.containsKey(id)){
            employees.remove(id);
            System.out.println("Empleado eliminado");
        } else{
            System.out.println("El empleado no existe");
        }
    }

    public void showEmployee(){
        Scanner sc = new Scanner(System.in);
        String id;

        System.out.println("Indique el DNI del empleado que desea ver");
        id = sc.nextLine();

        if(employees.containsKey(id)){
            System.out.println(employees.get(id));
        } else{
            System.out.println("El empleado no existe");
        }
    }

    public void updateEmployee(){
        Scanner sc = new Scanner(System.in);
        String id;
        String name;
        Integer age;
        Integer height;
        Double salary;

        System.out.println("Indique el DNI del empleado que desea modificar");
        id = sc.nextLine();

        if(employees.containsKey(id)){
            System.out.println("Nuevo nombre del empleado:");
            name = sc.nextLine();
            System.out.println("Nueva edad del empleado:");
            age = sc.nextInt();
            System.out.println("Nueva estatura del empleado:");
            height = sc.nextInt();
            System.out.println("Nuevo sueldo del empleado:");
            salary = sc.nextDouble();
            sc.nextLine();

            employees.put(id, new Employee(name, id, age, height, salary));
        } else{
            System.out.println("El empleado no existe");
        }
    }

    @Override
    public String toString() {
        return "Management{" +
                "employees=" + employees +
                '}';
    }
}
