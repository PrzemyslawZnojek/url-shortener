package com.rhinocode.urlshortener.generator;

import com.google.common.hash.Hashing;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;

@Component
public class SHA256ShortcutGenerator implements IShortcutGenerator{
    @Override
    public String generate(String phrase) {
        return Hashing.sha256()
                .hashString(phrase, StandardCharsets.UTF_8)
                .toString()
                .substring(0,6);
    }
}
