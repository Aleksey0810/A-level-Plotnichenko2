package ua.plotnichenko.hw5;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.time.Duration;

public class Task2Test {
    private final int[][] unordered = {{10, 4, 5}, {6, 1, 4}, {17, 8, 5}};
    private final int[][] ordered = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

    @Test
    public void testIsInDescendingOrder() {
        Assertions.assertFalse(Task2.isInDescendingOrder(unordered));
        Assertions.assertTrue(Task2.isInDescendingOrder(ordered));
    }

    @Test
    public void testIsInDescendingOrderTimeout() {

        Assertions.assertTimeout(Duration.ofMillis(250), () -> {
            Thread.sleep(200);
            return "result";
        });
    }
}


