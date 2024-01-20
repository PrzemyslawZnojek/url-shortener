package com.rhinocode.urlshortener.entity;

import java.time.Instant;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {

    @Id
    private String id;
    @Indexed(unique = true, direction = IndexDirection.DESCENDING)
    private String email;
    private String password;
    private Instant insertedAt;
    private Instant updatedAt;

    public User(String email, String password, Instant insertedAt, Instant updatedAt) {
        this.email = email;
        this.password = password;
        this.insertedAt = insertedAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Instant getInsertedAt() {
        return insertedAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }
}
