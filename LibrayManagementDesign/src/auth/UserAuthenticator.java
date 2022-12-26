/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auth;

public class UserAuthenticator {

    private UserAuthenticator() {
    }

    public static boolean isAdmin(String token) {
        return true;

    }

    public static boolean isMember(String token) {
        return true;
    }

}
