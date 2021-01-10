package test.java;
import Main.Math;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathTest {
//    @ParameterizedTest
//    @CsvSource({
//            "10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 550"
//    })
    @Test
    void calculateSumArray() {
        double[] myNumbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        double expected = 550;
        assertEquals(expected, Math.calculateSumArray(myNumbers), .01);
    }

    @Test
    void calculateAverage() {
        double[] myNumbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        double expected = 55;
        assertEquals(expected, Math.calculateAverage(myNumbers), .01);
    }

    @Test
    void calculateAverageTest() {
        assertEquals(80, Math.calculateAverage(125,35));
    }
}
