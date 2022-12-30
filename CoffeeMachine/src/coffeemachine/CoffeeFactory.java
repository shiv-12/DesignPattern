/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeemachine;

/**
 *
 * @author HP
 */
public class CoffeeFactory implements CoffeeAbstractFactory{

    public Coffee getCoffeeObject(String coffeeName) {
        Coffee coffee;
        if (coffeeName.equals("Cappuccino")) {
            coffee = new Cappuccino();
        } else if (coffeeName.equals("Espresso")) {
            coffee = new Espresso();
        } else {
            coffee = new Robusta();
        }
        return coffee;
    }
}
