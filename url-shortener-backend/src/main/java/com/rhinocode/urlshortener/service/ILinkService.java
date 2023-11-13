package com.rhinocode.urlshortener.service;

public interface ILinkService {
    String createShortcut(String originLink);
    String getOriginLink(String shortcut);
}
