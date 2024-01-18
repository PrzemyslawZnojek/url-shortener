package com.rhinocode.urlshortener.entity;

import java.time.Instant;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "links")
public class Link {

    @Id
    private String id;
    @Indexed(unique = true, direction = IndexDirection.DESCENDING)
    private String shortcut;
    private String origin;
    @Indexed
    private String userId;
    private Instant insertedAt;
    private Instant updatedAt;

    public Link(String shortcut, String origin, String userId, Instant insertedAt, Instant updatedAt) {
        this.shortcut = shortcut;
        this.origin = origin;
        this.userId = userId;
        this.insertedAt = insertedAt;
        this.updatedAt = updatedAt;
    }
}
