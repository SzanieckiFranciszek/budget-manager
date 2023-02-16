package com.dev.budgetmanager.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Budget {
    @Id
    private Long id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "budget_category_id")
    private BudgetCategory budgetCategoryId;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userId;

    public User getUserId() {
        return userId;
    }

    public BudgetCategory getBudgetCategoryId() {
        return budgetCategoryId;
    }
}
