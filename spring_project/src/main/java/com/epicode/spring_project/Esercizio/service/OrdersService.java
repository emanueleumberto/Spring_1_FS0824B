package com.epicode.spring_project.Esercizio.service;

import com.epicode.spring_project.Esercizio.model.*;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class OrdersService {

    @Autowired @Qualifier("menu") ObjectProvider<Menu> menuProvider;
    @Autowired @Qualifier("tavolo1") ObjectProvider<Table> table1Provider;
    @Autowired @Qualifier("tavolo2") ObjectProvider<Table> table2Provider;
    @Autowired @Qualifier("order1") ObjectProvider<Order> order1Provider;
    @Autowired @Qualifier("pizza_margherita") ObjectProvider<Pizza> pizza_margheritaProvider;
    @Autowired @Qualifier("pizza_salami") ObjectProvider<Pizza> pizza_salamiProvider;
    @Autowired @Qualifier("water") ObjectProvider<Drink> waterProvider;
    @Autowired @Qualifier("lemonade") ObjectProvider<Drink> lemonadeProvider;

    public Pizza createPizzaMargherita() {
        return pizza_margheritaProvider.getObject();
    }

    public Pizza createPizzaSalami() {
        return pizza_salamiProvider.getObject();
    }

    public Drink createWater() {
        return waterProvider.getObject();
    }

    public Drink createLemonade() {
        return lemonadeProvider.getObject();
    }

    public Menu createMenu() {
        return menuProvider.getObject();
    }

    public Table createTable1() {
        return table1Provider.getObject();
    }

    public Table createTable2() {
        return table2Provider.getObject();
    }

    public Order createOrder(int numCoperti, Table tavolo) {
        Order o = order1Provider.getObject();
        o.setTavolo(tavolo);
        o.setNumCoperti(numCoperti);
        return o;
    }

}
