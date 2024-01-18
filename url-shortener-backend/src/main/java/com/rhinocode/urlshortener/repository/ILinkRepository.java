package com.rhinocode.urlshortener.repository;

import org.springframework.data.repository.CrudRepository;

import com.rhinocode.urlshortener.entity.Link;

public interface ILinkRepository extends CrudRepository<Link, String>{
}
