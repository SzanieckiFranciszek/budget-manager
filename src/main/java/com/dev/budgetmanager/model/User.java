package com.dev.budgetmanager.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    @ManyToOne
    @JoinColumn(name = "user_role_id_id")
    private UserRole userRoleId;
    private int activeStatus;
    private String insertDate;

    public UserRole getUserRoleId() {
        return userRoleId;
    }
}
