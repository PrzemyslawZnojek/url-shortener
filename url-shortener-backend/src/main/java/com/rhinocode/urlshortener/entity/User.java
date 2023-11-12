package com.rhinocode.urlshortener.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private UUID id;

    @NotBlank(message = "Email is mandatory")
    @Email(message = "Invalid Email form", regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}",
            flags = Pattern.Flag.CASE_INSENSITIVE)
    private String email;
    private String hashedPassword;
    private Instant insertedAt;
    private Instant updatedAt;

    User() {}

    public User(String email, String hashedPassword) {
        this.email = email;
        this.hashedPassword = hashedPassword;
        this.insertedAt = Instant.now();
        this.updatedAt = Instant.now();
    }
}
