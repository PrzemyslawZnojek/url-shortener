package com.rhinocode.urlshortener.generator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ContextConfiguration(classes = {SHA256ShortcutGenerator.class})
@ExtendWith(SpringExtension.class)
class SHA256ShortcutGeneratorTest {

    @Autowired
    IShortcutGenerator generator;

    @Test
    void should_generate_shortcut_with_length_7() {
        String shortcut = generator.generate();

        System.out.println(shortcut);

        assertEquals(7, shortcut.length());
    }
}
