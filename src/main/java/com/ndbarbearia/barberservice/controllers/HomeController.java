package com.ndbarbearia.barberservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HomeController {

   
    @GetMapping("/")
    public String home(){
        return "Barber Service está online...";
    }
    
}
