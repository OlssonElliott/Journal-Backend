package com.journal_backend.journal_backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;


@Configuration
@EnableWebSecurity
public class Security {
    
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
        .cors(withDefaults())
        .csrf().disable()
        .authorizeHttpRequests(auth -> auth 
            .requestMatchers("/").permitAll()
            .anyRequest().permitAll()
        )
        .formLogin(withDefaults())
        .build();
    }
}
