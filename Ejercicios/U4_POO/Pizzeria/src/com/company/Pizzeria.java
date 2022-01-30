package com.company;

import java.util.Arrays;

public class Pizzeria {
    private Pedido[] pedidos;
    private int capacidad;
    private int cantPedidos = 0;

    public Pizzeria(int capacidad) {
        this.capacidad = capacidad;
        this.pedidos = new Pedido[capacidad];
        cantPedidos++;
    }

    public Pizzeria() {
        this(5);
    }

    public Pedido[] getPedido() {
        return pedidos;
    }
    public void setPedido(Pedido[] pedidos) {
        this.pedidos = pedidos;
    }
    public int getCantPedidos() {
        return cantPedidos;
    }

    // AÑADE UN PEDIDO AL ARRAY Y EVALÚA SI ESTÁ DENTRO DE LA CAPACIDAD DE LA PIZZERIA, SI NO, AUMENTA SU CAPACIDAD
    public void addPedido(Pedido pedido){
        if(cantPedidos<this.pedidos.length){
            this.pedidos[cantPedidos-1] = pedido;
        } else{
            Pedido[] pedidosAumentado = new Pedido[cantPedidos+1];
            for (int i = 0; i <pedidos.length ; i++) {
                pedidosAumentado[i] = pedidos[i];
            }
            pedidosAumentado[cantPedidos] = pedido;
            this.pedidos = pedidosAumentado;
        }
        cantPedidos++;
    }

    @Override
    public String toString() {
        return "+++++++++++++++++ PIZZERÍA +++++++++++++++++" +
                "\nTodos nuestros pedidos: \n" +
                "{" + Arrays.toString(pedidos) +
                "}\n";
    }
}
