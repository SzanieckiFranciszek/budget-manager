package com.dev.budgetmanager.service;

import com.dev.budgetmanager.exception.ExpenseNotFoundException;
import com.dev.budgetmanager.model.Expense;
import com.dev.budgetmanager.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    private final ExpenseRepository expenseRepository;

    @Autowired
    public ExpenseService(ExpenseRepository expenseRepository){
        this.expenseRepository = expenseRepository;

    }

    public Expense getExpenseById(Long expenseId) {
        return expenseRepository.findById(expenseId)
                .orElseThrow(() -> new ExpenseNotFoundException("Expense by id: " + expenseId + " wasn't found in data base."));
    }

    //    #To Do Add business logic before saving
    public Expense saveExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }

    public Expense updateExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    public void removeExpenseById(Long expenseId) {
        expenseRepository.removeExpenseById(expenseId);
    }
}
