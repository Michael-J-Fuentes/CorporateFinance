package test.java;

import Assets.DepreciationSchedule;
import Main.Depreciation;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class DepreciationTest {
    @ParameterizedTest
    @CsvSource({
            "10000, 2000, 5, 1600"
    })
    void calculateStraightLineDepreciationPerYearTest(double priceOfAsset, double salvageValue, double lifeOfAsset,
                                                  double expectedDepreciationPerYear) {
        assertEquals(expectedDepreciationPerYear, Depreciation.calculateStraightLineDepreciationPerYear(
                priceOfAsset, salvageValue, lifeOfAsset), .01);
    }

    public double sumArray(double[] myArray) {
        double total = 0;
        for (double i : myArray) {
            total += i;
        }
        return total;
    }
    // test to ensure asset is depreciated to zero
    @ParameterizedTest
    @CsvSource({
            "1000",
            "150",
            "1000000"
    })
    void checkTotalDepreciationEqualsPriceThreeYears(double price) {
        double total = sumArray(
                Depreciation.calculateModifiedDepreciation(price, DepreciationSchedule.DepreciationScheduleThreeYears));
        assertEquals(0, price - total, .001);
    }

    @ParameterizedTest
    @CsvSource({
            "1000",
            "150",
            "1000000"
    })
    void checkTotalDepreciationEqualsPriceFiveYears(double price) {
        double total = sumArray(
                Depreciation.calculateModifiedDepreciation(price, DepreciationSchedule.DepreciationScheduleFiveYears));
        assertEquals(0, price - total, .001);
    }

    @ParameterizedTest
    @CsvSource({
            "1000",
            "150",
            "1000000"
    })
    void checkTotalDepreciationEqualsPriceSevenYears(double price) {
        double total = sumArray(
                Depreciation.calculateModifiedDepreciation(price, DepreciationSchedule.DepreciationScheduleSevenYears));
        assertEquals(0, price - total, .001);
    }

    @ParameterizedTest
    @CsvSource({
            "1000",
            "150",
            "1000000"
    })
    void checkTotalDepreciationEqualsPriceTenYears(double price) {
        double total = sumArray(
                Depreciation.calculateModifiedDepreciation(price, DepreciationSchedule.DepreciationScheduleTenYears));
        assertEquals(0, price - total, .001);
    }

    @ParameterizedTest
    @CsvSource({
            "1000",
            "150",
            "1000000"
    })
    void checkTotalDepreciationEqualsPriceFifteenYears(double price) {
        double total = sumArray(
                Depreciation.calculateModifiedDepreciation(price, DepreciationSchedule.DepreciationScheduleFifteenYears));
        assertEquals(0, price - total, .001);
    }

    @ParameterizedTest
    @CsvSource({
            "1000",
            "150",
            "1000000"
    })
    void checkTotalDepreciationEqualsPriceTwentyYears(double price) {
        double total = sumArray(
                Depreciation.calculateModifiedDepreciation(price, DepreciationSchedule.DepreciationScheduleTwentyYears));
        assertEquals(0, price - total, .001);
    }

    @ParameterizedTest
    @CsvSource({
            "1000, 333.3, 74.1"
    })
    void calculateDepreciationArray(double price, double firstYear, double lastYear) {
        double[] depArray = Depreciation.calculateModifiedDepreciation(price, DepreciationSchedule.DepreciationScheduleThreeYears);
        assertEquals(firstYear, depArray[0], .10);
        assertEquals(lastYear, depArray[depArray.length-1], .10);
    }


}
