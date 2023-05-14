package com.greenStitchAssignment.GreenStitchAssignment.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greenStitchAssignment.GreenStitchAssignment.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    public Optional<User> findByEmail(String email);

    public Optional<User> findByUsername(String username);

    public Optional<User> findByUsernameIgnoreCase(String username);
}
