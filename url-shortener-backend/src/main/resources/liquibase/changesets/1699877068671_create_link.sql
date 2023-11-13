-- liquibase formatted sql

-- changeset pznojek:1699877068671_create_link

-- create table

create table link (
	ID UUID NOT NULL UNIQUE primary key,
	LONG_VERSION TEXT NOT NULL,
    SHORT_VERSION VARCHAR(7) NOT NULL
);