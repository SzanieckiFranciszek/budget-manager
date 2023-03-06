package com.dev.budgetmanager.service;

import com.dev.budgetmanager.exception.UserNotFoundException;
import com.dev.budgetmanager.model.User;
import com.dev.budgetmanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    private UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User getUserById(Long userId){
        return userRepository.findUserById(userId)
                .orElseThrow(() -> new UserNotFoundException("User by id: "+userId+" wasn't found in data base." ));
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User updatedUser(User user){
        return userRepository.save(user);
    }
    public void removeUserById(Long userId){
        userRepository.deleteUserById(userId);
    }
}
