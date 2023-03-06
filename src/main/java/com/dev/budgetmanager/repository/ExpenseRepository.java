package com.dev.budgetmanager.repository;

import com.dev.budgetmanager.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense,Long> {
    void removeExpenseById(Long expenseId);
}