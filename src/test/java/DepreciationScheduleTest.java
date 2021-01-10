package test.java;

import Assets.DepreciationSchedule;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class DepreciationScheduleTest {
    public double sumArray(double[] myArray) {
        double total = 0;
        for (double i : myArray) {
            total += i;
        }
        return total;
    }
    @Test
    void checkThreeYearDepreciationSum() {
        assertEquals(1.0, sumArray(DepreciationSchedule.DepreciationScheduleThreeYears), .001);
    }

    @Test
    void checkFiveYearDepreciationSum() {
        assertEquals(1.0, sumArray(DepreciationSchedule.DepreciationScheduleFiveYears), .001);
    }

    @Test
    void checkSevenYearDepreciationSum() {
        assertEquals(1.0, sumArray(DepreciationSchedule.DepreciationScheduleSevenYears), .001);
    }

    @Test
    void checkTenYearDepreciationSum() {
        assertEquals(1.0, sumArray(DepreciationSchedule.DepreciationScheduleTenYears), .001);
    }

    @Test
    void checkFifteenYearDepreciationSum() {
        assertEquals(1.0, sumArray(DepreciationSchedule.DepreciationScheduleFifteenYears), .001);
    }

    @Test
    void checkTwentyYearDepreciationSum() {
        assertEquals(1.0, sumArray(DepreciationSchedule.DepreciationScheduleTwentyYears), .001);
    }


}
