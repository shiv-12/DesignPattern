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
public class CappuccinoIngredientFactory implements IngredientFactory {

    @Override
    public Beans getBean() {
        return new AmericanBean();
    }

    @Override
    public Milk getMilk() {
        return new CowMilk();
    }

    @Override
    public Sugar getSugar() {
        return new RagulerSugar();
    }

}
