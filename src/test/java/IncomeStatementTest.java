package test.java;

import Main.IncomeStatement;
import org.junit.jupiter.api.Test;
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



}
