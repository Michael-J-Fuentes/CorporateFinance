package test.java;
import Assets.TaxBrackets;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxBracketTest {
    @ParameterizedTest
    @CsvSource({
            "50000, 4315"
    })
    void calculateTaxTest(double amountEarned, double expectedTax) {
        assertEquals(expectedTax, TaxBrackets.calculateTaxes(amountEarned), .01);
    }
}
