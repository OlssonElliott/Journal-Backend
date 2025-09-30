package com.journal_backend.journal_backend.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.journal_backend.journal_backend.dto.LoginRequest;
import com.journal_backend.journal_backend.dto.LoginResponse;
import com.journal_backend.journal_backend.models.User;
import com.journal_backend.journal_backend.repositories.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthService {
    
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

        public Optional<LoginResponse> authenticate(LoginRequest request) {
        return userRepository.findByUsername(request.getUsername())
                .filter(user -> passwordEncoder.matches(request.getPassword(), user.getPassword()))
                .map(user -> new LoginResponse(user.getId(), generateToken(user)));
    }
        private String generateToken(User user) {
        // JWT eller annat; returnera något enkelt tills vidare.
        return UUID.randomUUID().toString();
    }
}
