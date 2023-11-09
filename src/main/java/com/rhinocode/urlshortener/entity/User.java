package com.rhinocode.urlshortener.entity;

import java.time.Instant;

public class User {
    private Long id;
    private String email;
    private String hashedPassword;
    private Instant insertedAt;
    private Instant updatedAt;
}
