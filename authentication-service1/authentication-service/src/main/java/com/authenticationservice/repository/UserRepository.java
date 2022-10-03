package com.authenticationservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.authenticationservice.model.UserDao;

public interface UserRepository extends JpaRepository<UserDao, String> {
    UserDao findByUsername(String username);
}

