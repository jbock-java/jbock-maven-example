package net.jbock.cp;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ArgsTest {

    @Test
    void testPrint() {
        Args result = ArgsParser.parse(List.of("1", "2", "-rbs12")).orElseThrow(l -> new RuntimeException());
        assertNotNull(result);
        assertTrue(result.recursive());
        assertTrue(result.backup());
        assertEquals(Optional.of("12"), result.suffix());
        assertEquals(Path.of("1"), result.source());
        assertEquals(Path.of("2"), result.dest());
    }
}
