package test.java;
import Main.OperatingCashFlows;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperatingCashFlowsTest {
    @ParameterizedTest
    @CsvSource({
            "100, 15, 10, 95"
    })
    void calculateOperatingCashFlows(double ebit, double taxes, double depreciation, double expected) {
        assertEquals(expected, OperatingCashFlows.calculateOperatingCashFlows(ebit, taxes, depreciation), .01);
    }
}
