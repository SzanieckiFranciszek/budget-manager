package com.dev.budgetmanager.exception;

public class ExpenseNotFoundException extends RuntimeException {
    public ExpenseNotFoundException(String exceptionMessage) {
        super(exceptionMessage);
    }
}
