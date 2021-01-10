package test.java;
import Main.NetWorkingCapital;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NetWorkingCapitalTest {
    @ParameterizedTest
    @CsvSource({
            "761, 486, 275",
            "707, 455, 252"
    })
    void calculateNetworkingCapital(double currentAssets, double currentLiabilities, double expectedNetworkingCapital) {
        assertEquals(expectedNetworkingCapital,
                NetWorkingCapital.calculateNetWorkingCapital(currentAssets, currentLiabilities), .01);
    }
}
