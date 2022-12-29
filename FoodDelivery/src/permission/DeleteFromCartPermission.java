/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permission;

import data.FoodItem;
import data.User;

/**
 *
 * @author HP
 */
public class DeleteFromCartPermission implements Permission{

    private final User user;
     private final FoodItem foodItem;

    public DeleteFromCartPermission(User user, FoodItem foodItem) {
        this.user = user;
        this.foodItem = foodItem;
    }
   
    
    @Override
    public boolean isPermitted() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
