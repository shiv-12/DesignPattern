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
public class CoffeeServer {

    public final CoffeeAbstractFactory factory;

    public CoffeeServer(CoffeeAbstractFactory factory) {
        this.factory = factory;
    }

    public Coffee serve(String coffeeName) {
        Coffee coffee = this.factory.getCoffeeObject(coffeeName);//new CoffeeFactory().getCoffeeObject(coffeeName); 
        coffee.boil();
        coffee.brew();
        return coffee;
    }
}
