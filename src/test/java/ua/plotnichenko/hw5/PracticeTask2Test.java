package ua.plotnichenko.hw5;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class PracticeTask2Test {
    private final int[] allGirls = {150, 170, 195, 160};
    private final int[] allBoys = {122, -135, 145, -154, 160, -183};

    @Test
    public void testAvgBoysHeight() {
        Assertions.assertEquals(157.33333333333334, PracticeTask2.calcBoysAvgHeight(allBoys));
    }

    @Test
    public void testAvgGirlsHeight() {
        Assertions.assertEquals(170, PracticeTask2.calcGirlsAvgHeight(allGirls));
    }
}