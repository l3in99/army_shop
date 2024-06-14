package com.example.army_shop.model;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class armyshop {
    @Id
    int id;
    int year;
    int month;
    
}
