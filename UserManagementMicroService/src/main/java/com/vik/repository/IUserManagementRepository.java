package com.vik.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vik.entity.User;

public interface IUserManagementRepository extends JpaRepository<User, Integer> {

	public User findByEmail(String email);
}
