package com.company.Actividad1;

public class CuentaCorriente {
    private double saldo;
    private int limiteDesc;
    private String nombre;
    private String dni;
 // +++++++++++++++++++++ CONSTRUCTORES ++++++++++++++++++++++++++++++
    public CuentaCorriente(String nombre, String dni) {
        this.saldo = 0;
        this.limiteDesc = -50;
        this.nombre = nombre;
        this.dni = dni;
    }
    // +++++++++++++++++++++ GETTERS & SETTERS ++++++++++++++++++++++++++++++
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public int getLimiteDesc() {
        return limiteDesc;
    }
    public void setLimiteDesc(int limiteDesc) {
        this.limiteDesc = limiteDesc;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    // +++++++++++++++++++++ MÉTODOS ++++++++++++++++++++++++++++++

    public boolean sacarDinero(double peticion){
/*
solo se podrá sacar dinero hasta el límite de descubierto.
El método debe indicar, por pantalla, un mensaje que indique si ha sido posible llevar a cabo la operación.
Además, deberá devolver un valor booleano que indique lo mismo.
 */
    }

    public void ingresarDinero(double cantidad){

    }

    public void mostrarInformacion(){

    }

    // +++++++++++++++++++++ PARA IMPRIMIR ++++++++++++++++++++++++++++++
    @Override
    public String toString() {
        return "Cuenta Corriente{" +
                "saldo= " + saldo +
                ", limiteDesc= " + limiteDesc +
                ", nombre= '" + nombre + '\'' +
                ", dni= '" + dni + '\'' +
                '}';
    }
}
