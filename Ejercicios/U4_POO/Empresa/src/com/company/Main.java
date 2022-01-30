package com.company;

public class Main {

    public static void main(String[] args) {
        // CREACIÓN EMPLEADOS - CREATE EMPLOYEES
        Empleado empleado1 = new Empleado("Pepe López", "1232443434", "98767734", TipoEmpleado.DIRECTIVO);
        Empleado empleado2 = new Empleado("Ana Mora", "9876543210", "677349400");

        // CREACIÓN DEPARTAMENTOS - CREATE DEPARTMENTS
        Departamento dep1 = new Departamento("RRHH", "1111");
        Departamento dep2 = new Departamento("Mantenimiento", "Gines", "2222");

        // CREACIÓN EMPRESA - CREATE COMPANY
        Empresa empresa1 = new Empresa("MiEmpresa");

        // AÑADIR EMPLEADO A DEPARTAMENTO - ADD EMPLY TO DEPTMENT
        dep1.addEmpleado(empleado1);
        dep1.addEmpleado(empleado1);
        dep1.addEmpleado(empleado2);

        // ELIMINAR EMPLEADO DE DEPARTAMENTO - DELETE EMPLY FROM DEPTMENT
        dep1.deleteEmpleado(empleado1);

        // AÑADIR DEPARTAMENTO A EMPRESA - ADD DEPTMENT TO COMPANY
        empresa1.addDepartamento(dep1);
        System.out.println(empresa1);

        // CONOCER CANTIDAD EMPLEADOS CREADOS - KNOW NUMBER OF EMPLOYEES CREATED
        System.out.println(Empleado.getCantEmpleados());

        // CONOCER CANTIDAD DEPARTAMENTOS CREADOS - KNOW NUMBER OF DEPARTMENTS CREATED
        System.out.println(Departamento.getCantDepartamentos());


    }
}
