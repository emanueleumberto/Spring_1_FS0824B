package com.epicode.spring_project.Esercizio.model;

public class Drink extends Article {

    private String name;

    public Drink(int calories, double price, String name) {
        super(calories, price);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}
