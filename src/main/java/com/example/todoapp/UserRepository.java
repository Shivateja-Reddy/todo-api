package com.example.todoapp;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity , Long>{

    UserEntity findByUsername(String username);

}
