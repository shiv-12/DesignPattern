/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpattern;

public class BuilderPattern {

    public static void main(String[] args) {
        User user = new User.Builder(1, "Shivam").age(24).mobile("7898337488").build();
    }

}
