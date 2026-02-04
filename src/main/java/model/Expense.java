package com.example.expense.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;
    private String category;
    private LocalDate date;
    private String note;

    public Expense() {}

    public Expense(Double amount, String category, LocalDate date, String note) {
        this.amount = amount;
        this.category = category;
        this.date = date;
        this.note = note;
    }

    // getters & setters
    public Long getId() { return id; }
    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }
    public String getNote() { return note; }
    public void setNote(String note) { this.note = note; }
}
