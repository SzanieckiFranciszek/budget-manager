package com.dev.budgetmanager.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class UserRole {
    @Id
    private Long id;
    private String name;
}
