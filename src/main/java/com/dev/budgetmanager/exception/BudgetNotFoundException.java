package com.dev.budgetmanager.exception;

public class BudgetNotFoundException extends RuntimeException {
    public BudgetNotFoundException(String exceptionMessage) {
        super(exceptionMessage);
    }
}
