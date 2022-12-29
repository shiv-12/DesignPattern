/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpattern;

/**
 *
 * @author HP
 */
public class User {

    private final int id;
    private final String name;
    private final int age;          // this is optional
    private final String mobile;    // this is optional

    private User(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
        this.mobile = builder.mobile;
    }

    public static class Builder {

        private final int id;
        private final String name;
        private int age;          // this is optional
        private String mobile;    // this is optional

        public Builder(int id, String name) {
            this.id = id;
            this.name = name;
            this.age = 0;
            this.mobile = "";
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder mobile(String mobile) {
            this.mobile = mobile;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }

}
