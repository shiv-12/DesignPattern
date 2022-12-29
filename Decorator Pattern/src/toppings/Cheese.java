/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toppings;

import bases.Pizza;

/**
 *
 * @author HP
 */
public class Cheese extends Toppings {

    private String name = "Olive";
    private double cost = 20.0;

    public Cheese(Pizza pizza) {
        this.name = this.name + " " + pizza.getName();
        this.cost = this.cost + pizza.getCost();

    }

    @Override
    public String getName() {
        return this.name;

    }

    @Override
    public double getCost() {
        return this.cost;

    }

}
