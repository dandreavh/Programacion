package com.company;

import java.util.Calendar;

public class Pedido {
    private Pizza pizza;
    private Calendar fecha;

    public Pedido(Pizza pizza) {
        this.pizza = pizza;
        this.fecha = Calendar.getInstance();

    }
    public Pedido() {
        this.fecha = Calendar.getInstance();
        Pizza pizzaEst = new Pizza();
        pizzaEst.addIngredient(new Ingrediente("Jamón ibérico", 867));
        pizzaEst.addIngredient(new Ingrediente());
        this.pizza = pizzaEst;
    }

    public Pizza getPizza() {
        return pizza;
    }
    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }
    public Calendar getFecha() {
        return fecha;
    }
    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "\n ++++++ PEDIDO ++++++ \n"
                + pizza +
                ", Fecha: " + fecha.get(Calendar.DATE) + "/" + fecha.get(Calendar.MONTH)+1 + "/" + fecha.get(Calendar.YEAR);
    }
}
