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
public class EspressoIngredientFactory implements IngredientFactory{

    @Override
    public Beans getBean() {
        return new FrenchBean();
    }

    @Override
    public Milk getMilk() {
        return new PowderedMilk();
    }

    @Override
    public Sugar getSugar() {
        return new BrownSugar();
    }
    
}
