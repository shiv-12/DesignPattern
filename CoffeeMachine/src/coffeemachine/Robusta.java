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
public class Robusta extends Coffee{

    public Robusta(IngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    @Override
    public void brew() {
        System.out.println("Robusta brew");
    }

    @Override
    public void boil() {
        System.out.println("Robusta boil");
    }
    
}
