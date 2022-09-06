package com.test.nmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.nmt.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
