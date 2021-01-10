package Assets;

public class DepreciationSchedule {
    public static final double[] DepreciationScheduleThreeYears = {.3333, .4445, .1481, .0741};
    public static final double[] DepreciationScheduleFiveYears = {.20, .32, .1920, .1152, .1152, .0576};
    public static final double[] DepreciationScheduleSevenYears = {.1429, .2449, .1749, .1249, .0893, .0892,
            .0893, .0446};
    public static final double[] DepreciationScheduleTenYears = {.10, .18, .1440, .1152, .0922, .0737, .0655, .0655,
            .0656, .0655, .0328};
    public static final double[] DepreciationScheduleFifteenYears = {.05, .095, .0855, .077, .0693, .0623, .059, .059, .0591,
            .059, .0591, .059, .0591, .059, .0591, .0295};
    public static final double[] DepreciationScheduleTwentyYears = {.0375, .07219, .06677, .06177, .05713, .05285, .04888,
            .04522, .04462, .04461, .04462, .04461, .04462, .04461, .04462, .04461, .04462, .04461, .04462, .04461, .02231};
    public static void printSum(double[] myArray) {
        double total = 0;
        for (double i : myArray) {
            total += i;
        }
        System.out.println(total);
    }

    public static void main(String[] args) {
        System.out.println(DepreciationScheduleFiveYears.length);
        System.out.println(DepreciationScheduleTwentyYears.length);
        printSum(DepreciationScheduleFiveYears);
    }
}
