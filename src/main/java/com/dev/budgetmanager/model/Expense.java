package com.dev.budgetmanager.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Expense {

    @Id
    private Long id;
    private String name;
    private int amount;
    private Timestamp date;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "expense_category_id")
    private ExpenseCategory expenseCategoryId;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User userId;
    private String notes;
    private Timestamp insertDate;

}
