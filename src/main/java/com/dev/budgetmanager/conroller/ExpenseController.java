package com.dev.budgetmanager.conroller;

import com.dev.budgetmanager.model.Expense;
import com.dev.budgetmanager.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/expense")
public class ExpenseController {

    private ExpenseService expenseService;

    @Autowired
    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Expense>> getAllExpenses() {
        return new ResponseEntity<>(expenseService.getAllExpenses(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getExpenseById(@PathVariable("id") Long expenseId) {
        return new ResponseEntity<>(expenseService.getExpenseById(expenseId),HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Expense> addExpense(@RequestBody Expense expense) {
        //return only Expense Id, no object Expense
        return new ResponseEntity<>(expenseService.saveExpense(expense), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Expense> updateExpenseById(@RequestBody Expense expense) {
        return new ResponseEntity<>(expenseService.updateExpense(expense), HttpStatus.OK);
    }

    @DeleteMapping("/remove/{id}")
    public ResponseEntity<?> removeExpenseById(@PathVariable("id") Long expenseId) {
        expenseService.removeExpenseById(expenseId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
