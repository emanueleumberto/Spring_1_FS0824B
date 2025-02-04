package com.epicode.spring_project.Esercizio.model;

public class Topping extends Article {

    private String name;

    public Topping(int calories, double price, String name) {
        super(calories, price);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}
