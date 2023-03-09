package com.dev.budgetmanager.repository;

import com.dev.budgetmanager.model.BudgetCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BudgetCategoryRepository  extends JpaRepository<BudgetCategory,Long> {
}