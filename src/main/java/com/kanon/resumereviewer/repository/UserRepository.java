package com.kanon.resumereviewer.repository;

import com.kanon.resumereviewer.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    // If a user with that email exists → return the User.
    // If no user exists → return an empty Optional instead of null.
    Optional<User> findByEmail(String email);
}