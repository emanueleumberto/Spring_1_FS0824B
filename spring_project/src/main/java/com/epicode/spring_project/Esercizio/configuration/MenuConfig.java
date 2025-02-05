package com.epicode.spring_project.Esercizio.configuration;

import com.epicode.spring_project.Esercizio.model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MenuConfig {

    @Bean(name = "topping_tomato")
    public Topping toppingTomato() {
        return new Topping(0, 0, "Tomato");
    }

    @Bean(name = "topping_cheese")
    public Topping toppingCheese() {
        return new Topping(92, 0.69, "Cheese");
    }

    @Bean(name = "topping_salami")
    public Topping toppingSalami() {
        return new Topping(86, 0.99, "Salami");
    }

    @Bean(name = "pizza_margherita")
    public Pizza pizzaMargheritaBean() {
        Pizza p = new Pizza(1104, 4.99, "Pizza Margherita");
        p.addTopping(toppingTomato());
        p.addTopping(toppingCheese());
        return p;
    }

    @Bean(name = "pizza_salami")
    public Pizza pizzaSalamiBean() {
        Pizza p = new Pizza(1160, 5.99, "Salami Pizza");
        p.addTopping(toppingTomato());
        p.addTopping(toppingCheese());
        p.addTopping(toppingSalami());
        return p;
    }

    @Bean(name = "water")
    public Drink waterDrink() {
        return new Drink(0, 1.29, "Water");
    }

    @Bean(name = "lemonade")
    public Drink lemonadeDrink() {
        return new Drink(128, 1.29, "Lemonade");
    }

    @Bean(name = "menu")
    public Menu menuBean() {
        Menu menu = new Menu();
        menu.getMenuList().add(pizzaMargheritaBean());
        menu.getMenuList().add(pizzaSalamiBean());
        menu.getMenuList().add(toppingTomato());
        menu.getMenuList().add(toppingCheese());
        menu.getMenuList().add(toppingSalami());
        menu.getMenuList().add(waterDrink());
        menu.getMenuList().add(lemonadeDrink());
        return menu;
    }

    @Bean(name = "tavolo1")
    public Table getTavolo1() {
        return new Table(1, 4, true);
    }

    @Bean(name = "tavolo2")
    public Table getTavolo2() {
        return new Table(2, 6, true);
    }

    @Bean(name = "tavolo3")
    public Table getTavolo3() {
        return new Table(3, 2, true);
    }

    @Bean(name = "order")
    @Scope("prototype")
    public Order getOrder1() {
        return new Order();
    }


}
