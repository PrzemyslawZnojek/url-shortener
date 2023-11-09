package com.rhinocode.urlshortener.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private UUID id;
    private String email;
    private String hashedPassword;
    private Instant insertedAt;
    private Instant updatedAt;

    protected User() {}

    public User(String email, String hashedPassword, Instant insertedAt, Instant updatedAt) {
        this.email = email;
        this.hashedPassword = hashedPassword;
        this.insertedAt = insertedAt;
        this.updatedAt = updatedAt;
    }
}
