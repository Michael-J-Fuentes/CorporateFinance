package test.java;

import Main.Shares;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SharesTest {
    @ParameterizedTest
    @CsvSource({
            "86,29,2.97",
            "100,50,2"
    })
    void calculateEarningsPerShareTest(double netIncome, int outstandingShares, double expectedEarningsPerShare) {
        assertEquals(expectedEarningsPerShare, Shares.calculateEarningPerShare(netIncome, outstandingShares), .01);
    }

    @ParameterizedTest
    @CsvSource({
            "86,29,2.97",
            "100,50,2"
    })
    void calculateOutstandingSharesTest(double netIncome, int expectedOutstandingShares, double earningsPerShare) {
        assertEquals(expectedOutstandingShares, Shares.calculateOutstandingShares(netIncome, earningsPerShare), .01);
    }

    @ParameterizedTest
    @CsvSource({
            "86,29,2.97",
            "100,50,2"
    })
    void calculateNetIncomeTest(double expectedNetIncome, int outstandingShares, double earningsPerShare) {
        assertEquals(expectedNetIncome, Shares.calculateNetIncome(outstandingShares, earningsPerShare), .50);
    }

    @ParameterizedTest
    @CsvSource({
            "43, 29, 1.48"
    })
    void calculateDividendsPerShareTest(double dividends, double totalSharesOutstanding, double dividendsPerShare) {
        assertEquals(dividendsPerShare, Shares.calculateDividendsPerShare(dividends, totalSharesOutstanding), .01);
    }

    @ParameterizedTest
    @CsvSource({
            "43, 29, 1.48"
    })
    void calculateOutstandingSharesTest(double dividends, double expectedTotalSharesOutstanding, double dividendsPerShare) {
        assertEquals(expectedTotalSharesOutstanding, Shares.calculateOutstandingShares(dividends, dividendsPerShare));
    }

    @ParameterizedTest
    @CsvSource({
            "42.92, 29, 1.48"
    })
    void calculateDividends(double expectedDividends, double totalSharesOutstanding, double dividendsPerShare) {
        assertEquals(expectedDividends, Shares.calculateDividends(dividendsPerShare, totalSharesOutstanding), .01);
    }

}
