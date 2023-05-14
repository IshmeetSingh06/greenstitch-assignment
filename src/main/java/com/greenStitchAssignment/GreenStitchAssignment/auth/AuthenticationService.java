package com.greenStitchAssignment.GreenStitchAssignment.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.greenStitchAssignment.GreenStitchAssignment.config.JwtTokenUtil;
import com.greenStitchAssignment.GreenStitchAssignment.entity.User;
import com.greenStitchAssignment.GreenStitchAssignment.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

        @Autowired
        private final UserRepository repository;

        @Autowired
        private final JwtTokenUtil jwtService;

        @Autowired
        private final AuthenticationManager authenticationManager;

        @Autowired
        private final PasswordEncoder passwordEncoder;

        public AuthenticationResponse register(RegisterRequest request) {
                System.out.println(request);
                var user = User.builder()
                                .username(request.getUsername())
                                .email(request.getEmail())
                                .password(passwordEncoder.encode(request.getPassword()))
                                .role(request.getRole())
                                .build();

                repository.save(user);
                var jwtToken = jwtService.generateToken(user);
                // var refreshToken = jwtService.generatRefreshToken(user);
                // saveUserToken(savedUser, jwtToken);
                return AuthenticationResponse.builder()
                                .accessToken(jwtToken)
                                // .refreshToken(refreshToken)
                                .build();
        }

        public AuthenticationResponse authenticate(AuthenticationRequest request) {

                authenticationManager.authenticate(
                                new UsernamePasswordAuthenticationToken(
                                                request.getEmail(),
                                                request.getPassword()));
                var user = repository.findByEmail(request.getEmail())
                                .orElseThrow();
                System.out.println(user + "hi");
                var jwtToken = jwtService.generateToken(user);
                // var refreshToken = jwtService.generateRefreshToken(user);
                // revokeAllUserTokens(user);
                // saveUserToken(user, jwtToken);
                return AuthenticationResponse.builder()
                                .accessToken(jwtToken)
                                // .refreshToken(refreshToken)
                                .build();
        }
}
