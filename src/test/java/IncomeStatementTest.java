package test.java;

import Main.IncomeStatement;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class IncomeStatementTest {
    @ParameterizedTest
    @CsvSource({
            "190, 500, 310",
            "100, 300, 200",
            ".10, 1, .90"
    })
    void calculateNetIncomeTest(double expectedNetIncome, double revenue, double expenses) {
        assertEquals(expectedNetIncome, IncomeStatement.calculateIncome(revenue, expenses), .001);
    }
    @ParameterizedTest
    @CsvSource({
            "190, 500, 310",
            "100, 300, 200",
            ".10, 1, .90"
    })
    void calculateRevenueTest(double netIncome, double expectedRevenue, double expenses) {
        assertEquals(expectedRevenue, IncomeStatement.calculateRevenue(netIncome, expenses), .001);
    }

    @ParameterizedTest
    @CsvSource({
            "190, 500, 310",
            "100, 300, 200",
            ".10, 1, .90"
    })
    void calculateExpensesTest(double netIncome, double revenue, double expectedExpenses) {
        assertEquals(expectedExpenses, IncomeStatement.calculateExpenses(netIncome, revenue), .001);
    }

    @ParameterizedTest
    @CsvSource({
            "100, 50, 25, 25"
    })
    void calculateEarningsBeforeIntrestAndTaxTax(double revenue, double expenses, double depreciation, double expectedEBIT) {
        assertEquals(expectedEBIT, IncomeStatement.calculateEarningsBeforeInterestAndTax(revenue, expenses, depreciation));
    }


    @ParameterizedTest
    @CsvSource({
     "100, 50, 25, 10, 15"
    })
    void calculateEarningsBeforeTaxTest(double revenue, double expenses, double depreciation, double interestExpenses,
                                        double expectedEBT) {
        assertEquals(expectedEBT, IncomeStatement.calculateEarningsBeforeTax(
                revenue, expenses, depreciation, interestExpenses));
    }

    @ParameterizedTest
    @CsvSource({
            "100, 50, 25, 5, 5, 15"
    })
    void calculateNetIncome(double revenue, double expenses, double depreciation, double interest, double taxes,
                            double expectedNetIncome) {
        assertEquals(expectedNetIncome, IncomeStatement.calculateNetIncome(revenue, expenses, depreciation,
                interest, taxes), .01);
    }



}
