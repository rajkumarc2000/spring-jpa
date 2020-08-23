package com.example.springjpa.service;

import com.example.springjpa.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepoInterface extends JpaRepository<User, Long> {
    
}