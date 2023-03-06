package com.dev.budgetmanager.service;

import com.dev.budgetmanager.exception.BudgetNotFoundException;
import com.dev.budgetmanager.model.Budget;
import com.dev.budgetmanager.repository.BudgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BudgetService {
    private final BudgetRepository budgetRepository;

    @Autowired
    public BudgetService(BudgetRepository budgetRepository) {
        this.budgetRepository = budgetRepository;
    }

    public Budget getBudgetById(Long budgetId) {
        return budgetRepository.findById(budgetId)
                .orElseThrow(() -> new BudgetNotFoundException("Budget by id: " + budgetId + " wasn't found in data base."));
    }

//    #To Do Add business logic before saving
    public Budget saveBudget(Budget budget) {
        return budgetRepository.save(budget);
    }

    public List<Budget> getAllBudgets() {
        return budgetRepository.findAll();
    }

    public Budget updateBudget(Budget budget) {
        return budgetRepository.save(budget);
    }

    public void removeBudgetById(Long budgetId) {
        budgetRepository.removeBudgetById(budgetId);
    }
}
