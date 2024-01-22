package com.rhinocode.urlshortener.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.rhinocode.urlshortener.entity.Link;

public interface ILinkRepository extends CrudRepository<Link, String>{
    Link findFirstByShortcut(String shortcut);
    List<Link> findByUserId(String userId);
}
