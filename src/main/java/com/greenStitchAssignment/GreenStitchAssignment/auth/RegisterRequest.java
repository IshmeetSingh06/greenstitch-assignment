package com.greenStitchAssignment.GreenStitchAssignment.auth;

import com.greenStitchAssignment.GreenStitchAssignment.entity.Role;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

    private String username;
    private String email;
    private String password;

    @Builder.Default()
    private Role role = Role.USER;
}
