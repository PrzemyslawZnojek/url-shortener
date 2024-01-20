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
    private final ILinkRepository linkRepository;

    public LinkService(IShortcutGenerator generator, ILinkRepository linkRepository) {
        this.generator = generator;
        this.linkRepository = linkRepository;
    }

    @Override
    public Link createShortcut(LinkCreateDTO linkCreateDTO) {
        Link link = new Link(generator.generate(), linkCreateDTO.origin(), linkCreateDTO.userId(), Instant.now(), Instant.now());
        return linkRepository.save(link);
    }

    @Override
    public String getOriginLink(String shortcut) {
        return null;
    }
}
