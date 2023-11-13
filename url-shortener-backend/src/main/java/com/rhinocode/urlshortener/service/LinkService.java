package com.rhinocode.urlshortener.service;

import com.rhinocode.urlshortener.generator.IShortcutGenerator;

public class LinkService implements ILinkService {

    private final IShortcutGenerator generator;

    public LinkService(IShortcutGenerator generator) {
        this.generator = generator;
    }

    @Override
    public String createShortcut(String originLink) {
        return generator.generate(originLink);
    }

    @Override
    public String getOriginLink(String shortcut) {
        return null;
    }
}
