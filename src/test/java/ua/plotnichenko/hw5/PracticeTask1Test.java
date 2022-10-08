package ua.plotnichenko.hw5;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class PracticeTask1Test {
    double[] prices = {1234, 100.4, 222.22, 1111, 111, 15.9, 8.5, 12345.99, 12.50, 66.3, 650.6, 65.4};

    @Test
    public void testSumProductPriceMoreThanThousand() {
        Assertions.assertEquals(13000, PracticeTask1.calcSumConditionally(new double[]
                {1234, 100.4, 222.22, 1111, 111, 15.9, 8.5, 12345.99, 12.50, 66.3, 650.6, 65.4}));

    }

    @Test
    public void testSumProductPriceMoreThanThousand2() {
        Assertions.assertEquals(14690.99, PracticeTask1.calcSumConditionally(new double[]
                {1234, 100.4, 222.22, 1111, 111, 15.9, 8.5, 12345.99, 12.50, 66.3, 650.6, 65.4}));

    }
}

