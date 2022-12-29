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
public class Paneer extends Toppings {

    private String name = "Panner";
    private double cost = 30.0;

    public Paneer(Pizza pizza) {
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
