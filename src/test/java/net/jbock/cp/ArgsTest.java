package net.jbock.cp;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArgsTest {

    @Test
    void testPrint() {
        Args result = ArgsParser.parse(List.of("1", "2", "-rbs12")).getRight().orElseThrow();
        assertEquals("{ recursive: true, backup: true, suffix: Optional[12], source: 1, dest: 2 }", result.toString());
    }
}
