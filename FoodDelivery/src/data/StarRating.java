/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author HP
 */
public enum StarRating {
    // this is enum class 
    one(1), two(2), three(3), four(4), five(5);

    private final int val;

    private StarRating(int val) {
        this.val = val;
    }

    public int getVal() {
        return this.val;
    }
}
