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
public interface IngredientFactory {

    public Beans getBean();

    public Milk getMilk();

    public Sugar getSugar();
}

// Go to the Coffee now and add this factory