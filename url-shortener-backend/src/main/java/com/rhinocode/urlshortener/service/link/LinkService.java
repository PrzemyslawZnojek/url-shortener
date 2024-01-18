package com.rhinocode.urlshortener.service.link;

import com.rhinocode.urlshortener.dto.LinkCreateDTO;
import com.rhinocode.urlshortener.entity.Link;
import com.rhinocode.urlshortener.generator.IShortcutGenerator;
import com.rhinocode.urlshortener.repository.ILinkRepository;

import java.time.Instant;

import org.springframework.stereotype.Service;

@Service
public class LinkService implements ILinkService {

    private final IShortcutGenerator generator;
    private final ILinkRepository repository;

    public LinkService(IShortcutGenerator generator, ILinkRepository repository) {
        this.generator = generator;
        this.repository = repository;
    }

    @Override
    public Link createShortcut(LinkCreateDTO linkCreateDTO) {
        Link link = new Link(generator.generate(), linkCreateDTO.origin(), linkCreateDTO.userId(), Instant.now(), Instant.now());
        return repository.save(link);
    }

    @Override
    public String getOriginLink(String shortcut) {
        return null;
    }
}
