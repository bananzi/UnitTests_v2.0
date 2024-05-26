package org.example;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MyTest {

    @Test
    void testInvalidFilePath() {
        String path = "qq";

        FileNotFoundException thrown = assertThrows(FileNotFoundException.class, () -> App.scanFile(path));

        assertEquals("qq (o such file or directory)", thrown.getMessage());
    }
}