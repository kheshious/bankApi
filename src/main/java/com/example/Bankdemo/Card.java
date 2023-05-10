package com.example.Bankdemo;
import javax.persistence.*;

@Entity
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cardName;
    private String cardNumber;
    private String cvv;
    private String expiryDate;
    private String cardHolder;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;
}