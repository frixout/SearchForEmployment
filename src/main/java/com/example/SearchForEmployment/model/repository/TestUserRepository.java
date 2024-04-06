package com.example.SearchForEmployment.model.repository;

import com.example.SearchForEmployment.model.entity.TestUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestUserRepository extends JpaRepository<TestUser, Long> {
    TestUser findByEmail(String email);
}
