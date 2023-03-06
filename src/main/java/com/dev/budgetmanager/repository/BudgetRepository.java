package com.dev.budgetmanager.repository;

import com.dev.budgetmanager.model.Budget;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BudgetRepository extends JpaRepository<Budget, Long> {
    void removeBudgetById(Long budgetId);
}