package com.ndbarbearia.barberservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ndbarbearia.barberservice.models.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{
    
}
