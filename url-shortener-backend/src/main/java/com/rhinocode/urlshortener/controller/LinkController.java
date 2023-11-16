package com.rhinocode.urlshortener.controller;

import com.rhinocode.urlshortener.service.ILinkService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinkController {

    private final ILinkService linkService;

    public LinkController(ILinkService linkService) {
        this.linkService = linkService;
    }

    @GetMapping("/create-shortcut")
    public String createShortcut(@RequestParam(value = "Link") String link) {
        return linkService.createShortcut(link);
    }
}
