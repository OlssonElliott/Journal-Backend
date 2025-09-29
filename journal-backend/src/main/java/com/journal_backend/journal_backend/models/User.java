package com.journal_backend.journal_backend.models;

import org.springframework.data.annotation.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {
    @Id
    String id;
    String username;
    String email;
    String password;

}
