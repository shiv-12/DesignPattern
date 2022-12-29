/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permission;

import data.User;

/**
 *
 * @author HP
 */
public class PlaceOrderPermission implements Permission {
private final User user;

    public PlaceOrderPermission(User user) {
        this.user = user;
    }

    @Override
    public boolean isPermitted() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
