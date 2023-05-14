package com.greenStitchAssignment.GreenStitchAssignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greenStitchAssignment.GreenStitchAssignment.entity.User;
import com.greenStitchAssignment.GreenStitchAssignment.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

    @Autowired
    private final UserRepository repository;

    public List<User> fetchUsersList() {
        return repository.findAll();
    }

    public User fetchUserById(Long userId) {
        return repository.findById(userId).get();
    }

    public void deleteUserById(Long userId) {
        repository.deleteById(userId);
    }

}
