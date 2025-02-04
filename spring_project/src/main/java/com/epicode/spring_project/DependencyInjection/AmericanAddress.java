package com.epicode.spring_project.DependencyInjection;

public class AmericanAddress extends Address implements IAddress {

    private String city;
    private String state;
    private String street;

    public AmericanAddress(String city, String state, String street) {
        this.city = city;
        this.state = state;
        this.street = street;
    }
}
