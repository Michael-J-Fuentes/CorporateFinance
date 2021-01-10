package Main;

public class Shares {
    /*
    Calculate earnings per share
     */
    public static double calculateEarningPerShare(double netIncome, int totalOutStandingShares) {
        return netIncome / totalOutStandingShares;
    }

    /*
    Calculate outstanding shares
     */
    public static int calculateOutstandingShares(double netIncome, double earningsPerShare) {
        return  (int) Math.round((netIncome / earningsPerShare));
    }

    /*
    Calculate net income
     */
    public static double calculateNetIncome(int sharesOutstanding, double earningsPerShare) {
        return sharesOutstanding * earningsPerShare;
    }

    /*
    Calculate Dividends per share
     */
    public static double calculateDividendsPerShare(double dividends, double totalSharesOutstanding) {
        return dividends / totalSharesOutstanding;
    }

    /*
    Calculate total out standing shares
     */
    public static double calculateOutStandingShares(double dividends, double dividendsPerShare) {
        return dividends / dividendsPerShare;
    }

    /*
    Calculate dividends
     */
    public static double calculateDividends(double dividendsPerShare, double totalSharesOutstanding) {
        return dividendsPerShare * totalSharesOutstanding;
    }
}
