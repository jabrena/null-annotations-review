package info.jab.ms.nullaway;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class ExampleTest {

    @Test
    public void testPrintLength() {
        Example example = new Example();

        // This should not cause any NullAway warnings
        assertDoesNotThrow(() -> example.printLength("Test string"));

        // This should not cause any NullAway warnings due to @Nullable annotation
        assertDoesNotThrow(() -> example.printLength(null));
    }
}
