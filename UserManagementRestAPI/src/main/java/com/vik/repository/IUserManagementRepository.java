package com.vik.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vik.entity.User;

public interface IUserManagementRepository extends JpaRepository<User, Integer> {

    // Find user by email (for login)
    User findByEmail(String email);

    // Optional return type (recommended for null safety)
    Optional<User> findById(Integer id);

    // Check if email already exists (for registration validation)
    boolean existsByEmail(String email);
}
