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
public class Cappuccino implements Coffee {

     @Override
    public void brew() {
        System.out.println("Cappuccino brew");
    }

    @Override
    public void boil() {
        System.out.println("Cappuccino boil");
    }
    
}
