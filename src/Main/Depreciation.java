package Main;

public class Depreciation {
    public static double calculateStraightLineDepreciationPerYear(double priceOfAsset, double salvageValue,
                                                                  double estimatedUsefulLife) {
        return (priceOfAsset - salvageValue) / estimatedUsefulLife;
    }

// methods for calculating depreciation using modified accelerated recovery system
    /*
    Returns an double array containing the depreciation amount per year
     */
    public static double[] calculateModifiedDepreciation(double priceOfAsset, double[] depreciationSchedule) {
        double[] costPerYearArray = new double[depreciationSchedule.length];
        for (int i = 0; i < costPerYearArray.length; i++) {
            costPerYearArray[i] = depreciationSchedule[i] * priceOfAsset;
        }
        return costPerYearArray;
    }
}
