package com.dev.budgetmanager.conroller;

import com.dev.budgetmanager.model.Budget;
import com.dev.budgetmanager.service.BudgetService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/budget")
public class BudgetController {

    private final BudgetService budgetService;

    public BudgetController(BudgetService budgetService) {
        this.budgetService = budgetService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Budget>> getAllBudgets() {
        return new ResponseEntity<>(budgetService.getAllBudgets(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getBudgetById(@PathVariable("id") Long budgetId) {
        return new ResponseEntity<>(budgetService.getBudgetById(budgetId), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Budget> addBudget(@RequestBody Budget budget) {
        return new ResponseEntity<>(budgetService.saveBudget(budget), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Budget> updateBudgetById(@RequestBody Budget budget) {
        return new ResponseEntity<>(budgetService.updateBudget(budget), HttpStatus.OK);
    }

    @DeleteMapping("/remove/{id}")
    public ResponseEntity<?> removeBudgetById(@PathVariable("id") Long budgetId) {
        budgetService.removeBudgetById(budgetId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
