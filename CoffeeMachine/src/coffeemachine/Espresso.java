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
public class Espresso implements Coffee {

    @Override
    public void brew() {
        System.out.println("Espresso brew");
    }

    @Override
    public void boil() {
        System.out.println("Espresso boil");
    }

}
