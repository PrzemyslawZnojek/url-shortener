package com.rhinocode.urlshortener.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rhinocode.urlshortener.entity.User;

public interface IUserRepository extends MongoRepository<User, String>{
}
