/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator.pattern;

import bases.Pizza;
import bases.PlainWeat;
import bases.ThinCrust;
import toppings.Cheese;
import toppings.Paneer;

/**
 *
 * @author HP
 */
public class DecoratorPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pizza pizza = new Paneer(new Paneer(new Cheese(new PlainWeat())));
        System.out.println("your pizza - " + pizza.getName());
        System.out.println("your total cost will be - " + pizza.getCost());
    }

}
