package com.ndbarbearia.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ndbarbearia.barberservice.models.User;
import com.ndbarbearia.barberservice.repositories.UserRepository;

@Service
public class CreateUser implements Command<User>{

    
    @Autowired
    private UserRepository userRepository;

    @Override
    public User execute(User user) {
        return this.userRepository.save(user);
    }

}
