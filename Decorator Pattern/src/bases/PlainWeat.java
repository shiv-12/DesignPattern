/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bases;

/**
 *
 * @author HP
 */
public class PlainWeat implements Pizza {

    private String name = "PlainWeat";
    private double cost = 80.0;

    @Override
    public String getName() {
        return this.name;

    }

    @Override
    public double getCost() {
        return this.cost;

    }

}
