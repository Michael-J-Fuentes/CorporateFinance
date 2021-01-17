package Main;

public class BalanceSheet {
    /*
    Calculates Assets from equity and liability
     */
    public static double calculateAssets(double equity, double liability) {
        return liability + equity;
    }

    /*
    Calculate Liabilities from assets and equity
     */
    public static double calculateLiabilities(double assets, double equity) {
        return assets - equity;
    }

    /*
    Calculate equity from assets and liabilities
     */
    public static double calculateEquity(double assets, double liability) {
        return assets - liability;
    }

    /*
    Calculate current assets
     */
    public static double calculateCurrentAssets(double accountsReceivable, double inventory) {
        return accountsReceivable + inventory;
    }
    /*
    Calculate total Assets
    todo should cash and other assets be added
     */
    public static double calculateAssets(double accountsReceivable, double inventory, double fixedAssets) {
        return calculateCurrentAssets(accountsReceivable, inventory) + fixedAssets;
    }
    /*
    Calculate current liabilities
     */
    public static double calculateCurrentLiabilities(double accountsPayable, double notesPayable) {
        return accountsPayable + notesPayable;
    }

    /*
    Calculate total liabilities
     */
    public static double calculateLiabilities(double accountsPayable, double notesPayable, double longTermDebt) {
        return calculateCurrentLiabilities(accountsPayable, notesPayable) + longTermDebt;
    }

    /*
    returns true if the accounting balance sheet is balanced
     */
    public static boolean isBalanced(double totalAssets, double totalLiabilities, double equity) {
        return (totalAssets ) == (totalLiabilities + equity);
    }
// TODO: 1/17/2021 page 49
    /*
    Calculate pro forma balance sheet
     */

    /*
    Calculate external funds needed
     */
    public static double calculateExternalFundsNeeded(double assets, double sales, double debt, double netProfitMargin,
                                                      double dividendPayoutRatio, double projectedChangeInSales,
                                                      double projectedSales) {
        return ((assets / sales) * projectedChangeInSales) - ((debt / sales) * projectedChangeInSales) -
                ((netProfitMargin * projectedSales) * (1 - dividendPayoutRatio));
    }

    /*
    Calculate projected retained earnings
     */
    public static double calculateProjectedRetainedEarnings(double presentRetainedEarnings, double projectedNetIncome,
                                                            double cashDividends) {
        return presentRetainedEarnings + projectedNetIncome - cashDividends;
    }

    /*
    Calculate growth rate in sales
     */
    // TODO: 1/17/2021 fix page 52, unused parameters 
    public static double calculateGrowthRate(double totalAssetsToSalesRatio, double netProfitMarginOnSales, 
                                             double dividendPayoutRatio, double debtEquityRatio, double salesThisYear, 
                                             double projectedSales, double retainedEarnings, double netIncome) {
        return (netProfitMarginOnSales * (1 - dividendPayoutRatio) * (1 + debtEquityRatio)) / 
                ((totalAssetsToSalesRatio) - (netProfitMarginOnSales * (1 - dividendPayoutRatio) * (1 + debtEquityRatio))); 
    }



}
