package com.hcsc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcsc.entity.UserRegistration;

public interface UserRegistrationRepo extends JpaRepository<UserRegistration, Integer> {

}
