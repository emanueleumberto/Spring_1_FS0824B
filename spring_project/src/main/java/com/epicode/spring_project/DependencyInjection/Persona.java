package com.epicode.spring_project.DependencyInjection;

public class Persona {

    private String fullName;
    private IAddress address;
    private String phone;

    public Persona(String fullName, IAddress address, String phone) {
        this.fullName = fullName;
        this.address = address;
        this.phone = phone;
    }

    public void setAddress(IAddress address) {
        this.address = address;
    }
}
