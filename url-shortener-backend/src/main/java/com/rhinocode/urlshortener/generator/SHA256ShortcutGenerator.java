package com.rhinocode.urlshortener.generator;

import org.springframework.stereotype.Component;

import java.security.SecureRandom;

@Component
public class SHA256ShortcutGenerator implements IShortcutGenerator{
    private static final int SHORTCUT_LENGTH = 7;
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    @Override
    public String generate() {
        SecureRandom random = new SecureRandom();
        StringBuilder randomStringBuilder = new StringBuilder();

        for (int i = 0; i < SHORTCUT_LENGTH; i++) {
            int randomIndex = random.nextInt(ALPHABET.length());
            randomStringBuilder.append(ALPHABET.charAt(randomIndex));
        }

        return randomStringBuilder.toString();
    }
}
