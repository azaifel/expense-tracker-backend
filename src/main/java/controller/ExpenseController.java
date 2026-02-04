package com.example.expense.controller;

import com.example.expense.model.Expense;
import com.example.expense.repository.ExpenseRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {

    private final ExpenseRepository repository;

    public ExpenseController(ExpenseRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Expense create(@RequestBody Expense expense) {
        return repository.save(expense);
    }

    @GetMapping
    public List<Expense> list() {
        return repository.findAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
