package ua.plotnichenko.hw4;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class Task1Test {
    public int[] average = {8, 9, 7, 5, 3, 2, 5, 8, 5, 2};

    @Test
    public void testArrayAverage() {
        Assertions.assertEquals(5, Task1.getArrayAverage(average));
    }

    @Test
    public void testAverageGeometric() {
        Assertions.assertEquals(6038000.0, Task1.getArrayAverageGeometric(average));
    }
}