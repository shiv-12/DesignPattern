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
public abstract class Coffee {

    private final Beans bean;
    private final Sugar sugar;
    private final Milk milk;
    private final IngredientFactory ingredientFactory;

    public Coffee(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        this.bean = ingredientFactory.getBean();
        this.sugar = ingredientFactory.getSugar();
        this.milk = ingredientFactory.getMilk();
    }

    abstract void brew();

    abstract void boil();
}

// also the child classes of Coffee should pass ingredientFactory instead of those 3 arguments (milk sugar bean)