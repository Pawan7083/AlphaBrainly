
package com.learn.entities;

public class User {
    private int id;
    private String name;
    private String password;
    private String email;
    private String phone;
    private String address;
    private String landMark;
    private String city;
    private String state;
    private String pinCode;

    public User() {
    }

    public User(int id, String name, String password, String email, String phone, String address, String landMark, String city, String state, String pinCode) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.landMark = landMark;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
    }
    
    
}
