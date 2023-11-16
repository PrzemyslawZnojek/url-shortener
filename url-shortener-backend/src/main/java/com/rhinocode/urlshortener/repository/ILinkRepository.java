package com.rhinocode.urlshortener.repository;

import com.rhinocode.urlshortener.entity.Link;

public interface ILinkRepository {
    Link createLink(Link link);
}
