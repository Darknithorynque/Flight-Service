package com.example.demo.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String toRoute;
    private String fromRoute;
    private String date;
    private boolean isFull;
    private int flightPrice;

}
