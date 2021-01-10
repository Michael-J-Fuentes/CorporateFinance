package test.java;

import Main.BalanceSheet;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BalanceSheetTest {
    @ParameterizedTest
    @CsvSource({
            "0, 0, 0",
            "1000, 500, 500",
            "570, 70, 500"
    })
    void calculateAssetsTest(double assets, double liability, double equity) {
        assertEquals(assets, BalanceSheet.calculateAssets(equity, liability));
    }

    @ParameterizedTest
    @CsvSource({
            "0, 0, 0",
            "1000, 500, 500",
            "570, 70, 500"
    })
    void calculateLiabilities(double assets, double liabilities, double equity) {
        assertEquals(liabilities, BalanceSheet.calculateLiabilities(assets, equity));
    }

    @ParameterizedTest
    @CsvSource({
            "0, 0, 0",
            "1000, 500, 500",
            "570, 70, 500"
    })
    void calculateEquity(double assets, double liabilities, double equity) {
        assertEquals(equity, BalanceSheet.calculateEquity(assets, liabilities));
    }
}
