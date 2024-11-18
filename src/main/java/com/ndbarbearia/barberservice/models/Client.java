package com.ndbarbearia.barberservice.models;

import jakarta.persistence.Column;

public class Client extends User {

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false, unique = true)
    private String email;

}
