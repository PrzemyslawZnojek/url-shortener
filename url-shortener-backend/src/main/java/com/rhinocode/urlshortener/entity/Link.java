package com.rhinocode.urlshortener.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Link {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(unique = true, length = 7, nullable = false)
    private String shortcut;

    private String origin;


}
