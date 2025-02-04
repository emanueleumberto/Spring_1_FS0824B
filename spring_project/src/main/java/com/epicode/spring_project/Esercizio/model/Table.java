package com.epicode.spring_project.Esercizio.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Table {

    private int numTable;
    private int numMaxCoperti;
    private boolean stato;

}
