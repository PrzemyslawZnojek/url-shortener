package com.rhinocode.urlshortener.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rhinocode.urlshortener.dto.LinkCreateDTO;
import com.rhinocode.urlshortener.entity.Link;
import com.rhinocode.urlshortener.service.link.ILinkService;

@RestController
@RequestMapping("/link")
public class LinkController {

    private final ILinkService linkService;

    public LinkController(ILinkService linkService) {
        this.linkService = linkService;
    }

    @PostMapping("/create-shortcut")
    public ResponseEntity<Link> createShortcut(@RequestBody LinkCreateDTO linkCreateDTO) {
        Link shortcut = linkService.createShortcut(linkCreateDTO);
        return ResponseEntity.ok().body(shortcut);
    }
}
