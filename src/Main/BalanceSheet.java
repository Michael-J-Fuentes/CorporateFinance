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


}
