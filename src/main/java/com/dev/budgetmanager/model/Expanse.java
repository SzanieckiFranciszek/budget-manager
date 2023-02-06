package com.dev.budgetmanager.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Expanse {

    @Id
    private Long id;
    private String name;
    private int amount;
    private String expanseType;
    private Timestamp date;
    @ManyToOne
    @JoinColumn(name = "expanse_category_id_id")
    private ExpanseCategory expanseCategoryId;
    @ManyToOne
    @JoinColumn(name = "user_id_id")
    private User userId;
    private String notes;
    private Timestamp insertDate;

    public User getUserId() {
        return userId;
    }

    public ExpanseCategory getExpanseCategoryId() {
        return expanseCategoryId;
    }

}
