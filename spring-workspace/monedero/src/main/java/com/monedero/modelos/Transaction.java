package com.monedero.modelos;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double amount;
    private String type; // DEPOSIT, WITHDRAWAL
    private LocalDateTime date;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    // getters and setters
}

