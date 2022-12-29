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
public class User {

    private final int userid;
    private final String name;
    private final Address address;
    private final String phoneno;
    private final String email;

    public User(int userid, String name, Address address, String phoneno, String email) {
        this.userid = userid;
        this.name = name;
        this.address = address;
        this.phoneno = phoneno;
        this.email = email;
    }

    public int getUserid() {
        return userid;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public String getEmail() {
        return email;
    }

}
