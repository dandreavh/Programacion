package com.company;

import java.util.Arrays;

public class Pizza {
    private Ingrediente[] ingredientes;
    private Size size;
    private int cantIngredientes = 0;

    public Pizza(Size size) {
        this.ingredientes = new Ingrediente[0];
        this.size = size;
    }
    public Pizza() {
        this(Size.FAMILIAR);
    }

    public Ingrediente[] getIngredientes() {
        return ingredientes;
    }
    public void setIngredientes(Ingrediente[] ingredientes) {
        this.ingredientes = ingredientes;
    }
    public Size getSize() {
        return size;
    }
    public void setSize(Size size) {
        this.size = size;
    }

    // DEVUELVE LA CANTIDAD DE INGREDIENTES QUE TIENE
    public int getCantIngredientes() {
        return cantIngredientes;
    }

    // MUESTRA LOS TAMAÑOS DISPONIBLES DE LAS PIZZAS
    public void showSizes(){
        System.out.println("Tamaño: " + Size.MEDIANA);
        System.out.println("Tamaño: " + Size.FAMILIAR);
    }

    // AÑADIR INGREDIENTES EN UN ARRAY Y EVALÚA QUE NO HAYA MÁS DE 3
    public boolean addIngredient(Ingrediente ingrediente){
        if(ingredientes.length<3){
            ingredientes = Arrays.copyOf(ingredientes, ingredientes.length+1);
            ingredientes[ingredientes.length-1] = ingrediente;
            cantIngredientes++;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Pizza\n" +
                Arrays.toString(ingredientes) +
                "\nTamaño: " + size;
    }

}
