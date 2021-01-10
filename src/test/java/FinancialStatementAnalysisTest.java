package test.java;
import Main.FinancialStatementAnalysis;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FinancialStatementAnalysisTest {
    @ParameterizedTest
    @CsvSource({
            "761, 486, 1.57"
    })
    void calculateCurrentRatioTest(double totalCurrentAssets, double totalCurrentLiabilities, double expected) {
        assertEquals(expected, FinancialStatementAnalysis.calculateCurrentRatio(
                totalCurrentAssets, totalCurrentLiabilities), .01);
    }

    @ParameterizedTest
    @CsvSource({
            "1000, 700, 300"
    })
    void calculateQuickAssetsTest(double currentAssets, double inventory, double expected) {
        assertEquals(expected, FinancialStatementAnalysis.calculateQuickAssets(currentAssets, inventory), .01);
    }

    @ParameterizedTest
    @CsvSource({
            "492, 486, 1.01"
    })
    void calculateQuickRatio(double quickAssets, double totalCurrentLiabilities, double expectedQuickRatio) {
        assertEquals(expectedQuickRatio, FinancialStatementAnalysis.calculateQuickRatio(
                quickAssets, totalCurrentLiabilities), .01);
    }

    @ParameterizedTest
    @CsvSource({
            "2262, 1810.5, 1.25"
    })
    void calculateTotalAssetTurnOver(double totalOperatingRevenue, double averageTotalAssets, double expected) {
        assertEquals(expected, FinancialStatementAnalysis.calculateTotalAssetTurnover(
                totalOperatingRevenue, averageTotalAssets), .01);
    }

    @ParameterizedTest
    @CsvSource({
            "2262, 282, 8.02"
    })
    void calculateReceivablesTurnover(double totalOperatingRevenue, double averageReceivables, double expected) {
        assertEquals(expected, FinancialStatementAnalysis.calculateReceivableTurnover(
                totalOperatingRevenue, averageReceivables), .01);
    }

    @ParameterizedTest
    @CsvSource({
            "294, 270, 282"
    })
    void calculateAverageReceivablesTest(double begRec, double endRec, double expected) {
        assertEquals(expected, FinancialStatementAnalysis.calculateAverageReceivables(begRec, endRec));
    }

    @ParameterizedTest
    @CsvSource({
            "8.02, 45.511"
    })
    void calculateAverageCollectionPeriodTest(double receivableTurnover, double expected) {
        assertEquals(expected, FinancialStatementAnalysis.calculateAverageCollectionPeriod(receivableTurnover), .01);
    }

    @ParameterizedTest
    @CsvSource({
            "1655, 274.5, 6.03"
    })
    void calculateInventoryTurnTest(double costOfGoodSold, double averageInventory, double expected) {
        assertEquals(expected, FinancialStatementAnalysis.calculateInventoryTurn(costOfGoodSold, averageInventory), .01);
    }

    @ParameterizedTest
    @CsvSource({
            "100, 150, 125"
    })
    void calculateAverageInventoryTest(double begInv, double endInv, double expected) {
        assertEquals(expected, FinancialStatementAnalysis.calculateAverageInventory(begInv, endInv), .01);
    }

    @ParameterizedTest
    @CsvSource({
            "10, 36.5",
            "5, 73"
    })
    void calculateDaysInInventoryTest(double inventoryTurnover, double expected) {
        assertEquals(expected, FinancialStatementAnalysis.calculateDaysInInventory(inventoryTurnover), .01);
    }

    @ParameterizedTest
    @CsvSource({
            "1074, 1879, .57"
    })
    void calculateDebtRatioTest(double totalDebt, double totalAssets, double expected) {
        assertEquals(expected, FinancialStatementAnalysis.calculateDebtRatio(totalDebt, totalAssets), .01);
    }

    @ParameterizedTest
    @CsvSource({
            "1074, 805, 1.33"
    })
    void calculateDebtToEquityRatioTest(double totalDebt, double totalEquity, double expected) {
        assertEquals(expected, FinancialStatementAnalysis.calculateDebtToEquityRatio(totalDebt, totalEquity), .01);
    }

    @ParameterizedTest
    @CsvSource({
            "1879, 805, 2.33"
    })
    void calculateEquityMultiplierTest(double totalAssets, double totalEquity, double expected) {
        assertEquals(expected, FinancialStatementAnalysis.calculateEquityMultiplier(totalAssets, totalEquity), .01);
    }

    @ParameterizedTest
    @CsvSource({
            "219, 49, 4.5"
    })
    void calculateInterestCoverageTest(double totalAssets, double totalEquity, double expected) {
        assertEquals(expected, FinancialStatementAnalysis.calculateInterestCoverage(totalAssets, totalEquity), .5);
    }
}
