package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // CREACIÓN INGREDIENTES CON NOMBRE Y CALORÍAS O, POR DEFECTO, EL DE QUESO CON 250
        Ingrediente ingre1 = new Ingrediente();
        Ingrediente ingre2 = new Ingrediente("Bacon",150);
        Ingrediente ingre3 = new Ingrediente("Champiñones",50);
        Ingrediente ingre4 = new Ingrediente("Pollo",780);

        // CREACIÓN DE PIZZAS CON UN TAMAÑO DETERMINADO O EL, POR DEFECTO, FAMILIAR
        Pizza pizza1 = new Pizza();
        Pizza pizza2 = new Pizza(Size.MEDIANA);

        // AÑADIR INGREDIENTES A LAS PIZZAS
        pizza1.addIngredient(ingre1);
        pizza1.addIngredient(ingre2);

        pizza2.addIngredient(ingre3);
        pizza2.addIngredient(ingre4);
        pizza2.addIngredient(ingre1);

        // CREACIÓN PEDIDO CON UNA PIZZA CREADA O LA, POR DEFECTO, ESTRELLA
        Pedido ped1 = new Pedido(pizza1);
        Pedido ped2 = new Pedido(pizza2);
        Pedido pedidoEstrella = new Pedido();

        // CREACIÓN PIZZERÍA CON UNA CAPACIDAD DETERMINADA O, 5 POR DEFECTO
        Pizzeria pizzeria1 = new Pizzeria();
        Pizzeria pizzeria2 = new Pizzeria(3);

        // AÑADIR PEDIDOS EN PIZZERÍA
        pizzeria1.addPedido(ped1);
        pizzeria1.addPedido(ped2);
        pizzeria1.addPedido(pedidoEstrella);
        pizzeria1.addPedido(ped1);
        pizzeria1.addPedido(ped2);
        pizzeria1.addPedido(pedidoEstrella);

        // PETICIONES MOSTRAR
        // - Cuántos ingredientes tiene una Pizza
        System.out.println("Cantidad de ingredientes: " + pizza1.getCantIngredientes());
        // - Información de la pizza (tamaño e ingredientes)
        System.out.println("Información de la pizza:\n" + pizza1);
        // - Mostrar todos los pedidos realizados a la pizzería
        System.out.println(pizzeria1);
        // - Mostrar la cantidad de pedidos que se han realizado
        System.out.println("Cantidad de pedidos: " + pizzeria1.getCantPedidos());

    }
}
