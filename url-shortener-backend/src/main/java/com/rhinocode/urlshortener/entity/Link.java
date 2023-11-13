package com.rhinocode.urlshortener.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class Link {

    @Id
    @GeneratedValue
    private UUID id;

    private String shortVersion;
    private String longVersion;


}
