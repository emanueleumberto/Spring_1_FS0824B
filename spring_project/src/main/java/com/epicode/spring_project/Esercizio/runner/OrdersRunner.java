package com.epicode.spring_project.Esercizio.runner;

import com.epicode.spring_project.Esercizio.model.Menu;
import com.epicode.spring_project.Esercizio.model.Order;
import com.epicode.spring_project.Esercizio.model.Table;
import com.epicode.spring_project.Esercizio.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class OrdersRunner implements CommandLineRunner {

    @Autowired private OrdersService ordersService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("OrdersRunner...");

        // Soluzione Esercizio
        Menu menu = ordersService.createMenu();
        //menu.printMenu();

        Table t1 = ordersService.createTable();
        System.out.println(t1);

        Order o1 = ordersService.createOrder(4, t1);
        o1.aggiungiProdotti(ordersService.createPizzaMargherita());
        o1.stampaOrdine();

    }
}
