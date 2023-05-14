package com.greenStitchAssignment.GreenStitchAssignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greenStitchAssignment.GreenStitchAssignment.entity.User;
import com.greenStitchAssignment.GreenStitchAssignment.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public ResponseEntity<List<User>> fetchUsersList() {
        return ResponseEntity.ok(userService.fetchUsersList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> fetchUserById(@PathVariable("id") Long userId) {
        var foundUser = userService.fetchUserById(userId);
        return ResponseEntity.ok(foundUser);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUserById(@PathVariable("id") Long userId) {
        userService.deleteUserById(userId);
        return ResponseEntity.status(400).body("User deleted Successfully");
    }

}
