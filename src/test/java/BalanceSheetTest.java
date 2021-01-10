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
    void calculateLiabilitiesTest(double assets, double liabilities, double equity) {
        assertEquals(liabilities, BalanceSheet.calculateLiabilities(assets, equity));
    }

    @ParameterizedTest
    @CsvSource({
            "0, 0, 0",
            "1000, 500, 500",
            "570, 70, 500"
    })
    void calculateEquityTest(double assets, double liabilities, double equity) {
        assertEquals(equity, BalanceSheet.calculateEquity(assets, liabilities));
    }

    @ParameterizedTest
    @CsvSource({
            "100, 100, 200"
    })
    void calculateCurrentAssetTest(double accountsReceivable, double inventory, double expectedCurrentAssets) {
        assertEquals(expectedCurrentAssets, BalanceSheet.calculateAssetsCurrent(accountsReceivable, inventory));
    }

    @ParameterizedTest
    @CsvSource({
            "100, 100, 50, 250"
    })
    void calculateAssetsTest(double accountsReceivable, double inventory, double fixedAssets, double expected) {
        assertEquals(expected, BalanceSheet.calculateAssets(accountsReceivable, inventory, fixedAssets), .01);
    }

    @ParameterizedTest
    @CsvSource({
            "100, 100, 200"
    })
    void calculateLiabilitiesCurrentTest(double accountsPayable,  double notesPayable, double expected) {
        assertEquals(expected, BalanceSheet.calculateLiabilitiesCurrent(accountsPayable, notesPayable));
    }

    @ParameterizedTest
    @CsvSource({
            "100, 200, 500, 800"
    })
    void calculateLiabilities(double accountsPayable, double notesPayable, double longTermDebt, double expected){
        assertEquals(expected, BalanceSheet.calculateLiabilities(accountsPayable, notesPayable, longTermDebt));
    }

    @ParameterizedTest
    @CsvSource({
            "100, 50, 50, true",
            "100, 70, 30, true",
            "90, 85, 10, false"
    })
    void isBalancedTest(double assets, double liabilities, double equity, boolean expected) {
        assertEquals(expected, BalanceSheet.isBalanced(assets, liabilities, equity));
    }

}
