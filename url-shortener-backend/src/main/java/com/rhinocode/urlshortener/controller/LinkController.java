package com.rhinocode.urlshortener.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/origin-link/{shortcut}")
    public ResponseEntity<String> getOriginLink(@PathVariable String shortcut) {
        String origin = linkService.getOriginLink(shortcut);
        return ResponseEntity.ok().body(origin);
    }

    @GetMapping("user-links/{userId}")
    public ResponseEntity<List<Link>> getAllUserLinks(@PathVariable String userId) {
        List<Link> userLinks = linkService.getAllUserLinks(userId);
        return ResponseEntity.ok().body(userLinks);
    }
}
