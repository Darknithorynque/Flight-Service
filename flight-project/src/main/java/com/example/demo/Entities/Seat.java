package com.example.demo.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
// it cause unused imports; use getter, setter but also search about it
// seat payment proccess
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String seatNumber;
    private Long flightId;
    private int ticketPrice;
    private String seatType;
    private boolean isFull;
}