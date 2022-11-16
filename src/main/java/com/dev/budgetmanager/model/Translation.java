package com.dev.budgetmanager.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Translation {

    @Id
    private Long id;
    private String name;
    private int amount;
    private String translationType;
    private Timestamp date;
    @ManyToMany
    private Set<TranslationCategory> translationCategoryId;
    @ManyToOne
    private User userId;
    private String notes;
    private Timestamp insertDate;

}
