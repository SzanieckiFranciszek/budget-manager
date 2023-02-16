package com.dev.budgetmanager.conroller;

import com.dev.budgetmanager.model.User;
import com.dev.budgetmanager.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<User>>getAllUsers(){
        return new ResponseEntity<>(userService.getAllUsers(),HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<User>getUserById(@PathVariable("id") Long userId){
        return new ResponseEntity<>(userService.getUserById(userId),HttpStatus.OK);
    }

}
