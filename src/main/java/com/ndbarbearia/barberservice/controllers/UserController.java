package com.ndbarbearia.barberservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ndbarbearia.barberservice.models.User;
import com.ndbarbearia.useCases.CreateUser;


@RestController
@RequestMapping("/users")
public class UserController {
    
    private final CreateUser createUserUseCase;

    @Autowired
    public UserController(CreateUser createUserUseCase) {
        this.createUserUseCase = createUserUseCase;
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User newUser){
        User createdUser = this.createUserUseCase.execute(newUser);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }
}
