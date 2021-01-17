package test.java;

import Main.NetPresentValue;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NetPresentValueTest {

    @ParameterizedTest
    @CsvSource({
            "-50000, 25000, 20000, 15000, .07, 3077.5"
    })
    void calculateNetPresentValueTest(double c0, double c1, double c2, double c3, double rate,
                                      double expected) {
        double[] cashFlows = {c0, c1, c2, c3};
        assertEquals(expected, NetPresentValue.calculateNetPresentValue(cashFlows, rate), 1);
    }

    @ParameterizedTest
    @CsvSource({
            ".05, -10000, 1000, 2000, 3000, 4000, -1351.24",
            ".05, 0, 1000, 2000, 3000, 4000, 8648.76"
    })
    void calculateNetPresentValueTwoTest(double rate, double initCash, double c1, double c2, double c3, double c4,
                                         double expected) {

        double[] cashFlows = {initCash, c1, c2, c3, c4};
        double returnValue = NetPresentValue.calculateNetPresentValue(cashFlows, rate);
        double marginOfError = Math.abs(returnValue * .01);
        assertEquals(expected, returnValue,marginOfError);
    }
}
