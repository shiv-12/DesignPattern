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
public class Address {

    private final String addressLine1;
    private final String addressLine2;
    private final String addressLine3;
    private final String cityName;
    private final String state;
    private final String pinCode;
    private final String country;

    public Address(String addressLine1, String addressLine2, String addressLine3, String cityName, String state, String pinCode, String country) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressLine3 = addressLine3;
        this.cityName = cityName;
        this.state = state;
        this.pinCode = pinCode;
        this.country = country;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public String getAddressLine3() {
        return addressLine3;
    }

    public String getCityName() {
        return cityName;
    }

    public String getState() {
        return state;
    }

    public String getPinCode() {
        return pinCode;
    }

    public String getCountry() {
        return country;
    }

}
