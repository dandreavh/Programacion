package Tarea4MapasII;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        Map<String, Employee> employeesMap = new TreeMap<>();
        Management function = new Management();

        function.loadEmployees(employeesMap); // cargo los datos

        do{
            function.showOptions();
            System.out.println("Indique una opción");
            option = sc.nextInt();

            switch (option){
                case 1: // visualizar listado
                    System.out.println("Listado de empleados");
                    function.showEmployeesMap(employeesMap);
                    break;
                case 2: // borrar empleado
                    System.out.println("Eliminando este empleado");
                    function.deleteEmployee();
                    break;
                case 3: // visualizar empleado
                    System.out.println("Detalles del empleado");
                    function.showEmployee();
                    break;
                case 4: // modificar empleado
                    System.out.println("Modificación de datos");
                    function.updateEmployee();
                    break;
                case 5: // insertar empleado
                    System.out.println("Insertar nuevo empleado");
                    Employee e = function.createEmployee(employeesMap);
                    employeesMap.put(e.getDni(), e);
                    break;
                case 6: // salir del programa con guardado de datos
                    System.out.println("Cerrando sesión; sus datos serán guardados");
                    function.saveEmployees(employeesMap);
                    System.out.println(employeesMap);
                    break;
                default: // opción errónea
                    System.out.println("Opción incorrecta, lea nuevamente las opciones");
                    break;
            }
        } while (option!=6);
    }
}
