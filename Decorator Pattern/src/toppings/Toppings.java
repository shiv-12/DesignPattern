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
public abstract class Toppings extends Pizza {

    private final Pizza pizza;

    public Toppings(String name, double cost, Pizza pizza) {
        super(name, cost);
        this.pizza = pizza;
    }

    public String getName() {
        return super.getName() + " " + pizza.getName();
        // super.getName holds panner and pizza.getName holds bottom pizza name 
        // again pizza refers panner and so on So recursive calling happen here 
    }

    public double getCost() {
        return super.getCost() + pizza.getCost();
    }

}
