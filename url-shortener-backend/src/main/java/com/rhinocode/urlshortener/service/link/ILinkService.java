package com.rhinocode.urlshortener.service.link;

import com.rhinocode.urlshortener.dto.LinkCreateDTO;
import com.rhinocode.urlshortener.entity.Link;

public interface ILinkService {
    Link createShortcut(LinkCreateDTO linkCreateDTO);
    String getOriginLink(String shortcut);
}
