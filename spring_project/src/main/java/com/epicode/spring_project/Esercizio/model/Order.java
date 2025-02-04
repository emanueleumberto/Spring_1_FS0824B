package com.epicode.spring_project.Esercizio.model;

import com.epicode.spring_project.Esercizio.Enumeration.Stato;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class Order {

    private static int count = 1;
    private int numeroOrdine;
    private Stato stato;
    private int numCoperti;
    private LocalTime oraAcquisizione;
    private List<Article> listaProdotti;
    private Table tavolo;
    @Value("${menu.coperto}")
    private double costoCoperto;

    public Order(int numCoperti, Table tavolo) {
        this.numeroOrdine = count++;
        this.stato = Stato.IN_CORSO;
        this.numCoperti = numCoperti;
        this.oraAcquisizione = LocalTime.now();
        this.listaProdotti = new ArrayList<Article>();
        this.tavolo = tavolo;
    }

    public Order() {
        this.numeroOrdine = count++;
        this.stato = Stato.IN_CORSO;
        this.oraAcquisizione = LocalTime.now();
        this.listaProdotti = new ArrayList<Article>();
    }

    public void aggiungiProdotti(Article prodotto) {
        this.listaProdotti.add(prodotto);
    }

    public double totaleOrdine() {
        return 0.00;
    }

    public void stampaOrdine() {
        System.out.println("Ordine: " + this.numeroOrdine);
        System.out.println("Stato: " + this.stato);
        System.out.println("Numero coperti: " + this.numCoperti);
        System.out.println("Ora: " + this.oraAcquisizione);
        System.out.println("Lista Prodotti: " + this.listaProdotti.size());
        this.listaProdotti.forEach(ele -> {
            if(ele instanceof Pizza) {
                Pizza p = (Pizza) ele;
                System.out.println(p.getName());
            }
        });
    }

}
