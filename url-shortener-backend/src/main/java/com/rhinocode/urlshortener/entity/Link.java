package com.rhinocode.urlshortener.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Link {

    private UUID id;
    private String shortcut;
    private String origin;
}
