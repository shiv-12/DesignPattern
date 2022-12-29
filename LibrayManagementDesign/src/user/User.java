/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

/**
 *
 * @author HP
 */
public abstract class User {

    private final int memberId;
    private final String memberName;
  

    public User(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

}
