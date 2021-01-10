package Main;

public class FinancialStatementAnalysis {
    /*
    Calculate Current Ratio
     */
    public static double calculateCurrentRatio(double totalCurrentAssets, double totalCurrentLiabilities) {
        return totalCurrentAssets / totalCurrentLiabilities;
    }

    /*
    Calculate quick assets (current assets - inventory)
     */
    public static double calculateQuickAssets(double currentAssets, double inventory) {
        return currentAssets - inventory;
    }
    /*
    Calculate Quick Ratio
     */
    public static double calculateQuickRatio(double quickRatio, double totalCurrentLiabilities) {
        return quickRatio / totalCurrentLiabilities;
    }

    /*
    Calculate Total Asset Turnover, how effectively is the firm using assets
     */
    public static double calculateTotalAssetTurnover(double totalOperatingRevenue, double averageTotalAssets) {
        return totalOperatingRevenue / averageTotalAssets;
    }

    /*
    Calculate receivable turnover, on average how often is the inventory replaced in a year
     */
    public static double calculateReceivableTurnover(double totalOperatingRevenue, double averageReceivables) {
        return totalOperatingRevenue / averageReceivables;
    }

    /*
    Calculate Average Receivables
     */
    public static double calculateAverageReceivables(double beginReceivables, double endingReceivables) {
        return Math.calculateAverage(beginReceivables, endingReceivables);
    }

    /*
    Calculate average collection period
     */
    public static double calculateAverageCollectionPeriod(double receivablesTurnover) {
        return 365 / receivablesTurnover;
    }

    /*
    Calculate Inventory turn over
     */
    public static double calculateInventoryTurn(double costOfGoodsSold, double averageInventory) {
        return costOfGoodsSold / averageInventory;
    }

    /*
    Calculate Average Inventory
     */
    public static double calculateAverageInventory(double beginInventory, double endingInventory) {
        return Math.calculateAverage(beginInventory, endingInventory);
    }

    /*
    Calculate Days in inventory
     */
    public static double calculateDaysInInventory(double inventoryTurn) {
        return 365 / inventoryTurn;
    }

    /*
    Calculate Debt Ratio ( total debt / total assets)
     */
    public static double calculateDebtRatio(double totalDebt, double totalAssets) {
        return totalDebt / totalAssets;
    }

    /*
    Calculate debt to equity Ratio
     */
    public static double calculateDebtToEquityRatio(double totalDebt, double totalEquity) {
        return totalDebt / totalEquity;
    }

    /*
    Calculate equity multiplier
     */
    public static double calculateEquityMultiplier(double totalAssets, double totalEquity) {
        return totalAssets / totalEquity;
    }

    /*
    Calculate Interest covered
     */
    public static double calculateInterestCoverage(double earningsBeforeInterestAndTax, double interestExpense) {
        return earningsBeforeInterestAndTax / interestExpense;
    }
// todo testing ended here
    /*
    Calculate net Profit margin
     */
    public static double calculateNetProfitMargin(double netIncome, double totalOperatingRevenue) {
        return netIncome / totalOperatingRevenue;
    }

    /*
    Calculate Gross Profit Margin
     */
    public static double calculateGrossProfitMargin(double earningsBeforeInterestAndTax, double totalOperatingRevenue) {
        return earningsBeforeInterestAndTax / totalOperatingRevenue;
    }

    /*
    Calculate Net return on assets
     */
    public static double calculateNetReturnOnAssets(double netIncome, double averageTotalAssets) {
        return netIncome / averageTotalAssets;
    }

    /*
    Calculate Gross return on assets
     */
    public static double calculateGrossReturnOnAssets(double earningsBeforeInterestAndTaxes, double averageTotalAssets) {
        return earningsBeforeInterestAndTaxes / averageTotalAssets;
    }

    /*
    Calculate ROA
     */
    public static double calculateROA(double profitMargin, double assetTurnover) {
        return profitMargin * assetTurnover;
    }

    /*
    Calculate ROA net
     */
    public static double calculateNetROA(double netIncome, double totalOperatingRevenue, double averageTotalAssets) {
        return calculateNetProfitMargin(netIncome, totalOperatingRevenue) /
                calculateReceivableTurnover(totalOperatingRevenue, averageTotalAssets);
    }

    /*
    Calculate ROA net
     */
    public static double calculateNetROA(double netProfitMargin, double receivableTurnover) {
        return netProfitMargin / receivableTurnover;
    }

    /*
    Calculate ROA gross
     */
    public static double calculateGrossROA(double earningsBeforeInterestAndTaxes,
                                           double totalOperatingRevenue, double averageTotalAssets) {
        return calculateGrossProfitMargin(earningsBeforeInterestAndTaxes, totalOperatingRevenue) /
                calculateTotalAssetTurnover(totalOperatingRevenue, averageTotalAssets);
    }

    /*
    Calculate Return on Equity
     */
    public static double calculateROE(double netIncome, double averageStockholderEquity) {
        return netIncome / averageStockholderEquity;
    }

    /*
    Calculate Average stockholder equity
     */
    public static double calculateAverageStockholderEquity(double begEquity, double endingEquity) {
        return Math.calculateAverage(begEquity, endingEquity);
    }

    /*
    Calculate ROE
     */
    public static double calculateROE(double profitMargin, double assetTurnover, double equityMultiplier) {
        return profitMargin * assetTurnover * equityMultiplier;
    }

    /*
    Calculate ROE
     */
    public static double calculateROE(double netIncome, double totalOperatingRevenue, double averageTotalAssets,
                                      double averageStockholderEquity) {
        return calculateROE(calculateNetProfitMargin(netIncome, averageStockholderEquity),
                calculateTotalAssetTurnover(totalOperatingRevenue, averageTotalAssets),
                calculateEquityMultiplier(averageTotalAssets, averageStockholderEquity)); 
    }
}
