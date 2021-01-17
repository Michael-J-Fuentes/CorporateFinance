package Main;

public class IncomeStatement {
    /*
    Calculate Income from revenue and expenses
     */
    public static double calculateIncome(double revenue, double expenses) {
        return revenue - expenses;
    }

    /*
    Calculate revenue from income and expenses
     */
    public static double calculateRevenue(double income, double expenses) {
        return income + expenses;
    }

    /*
    Calculate expenses from income and revenue
     */
    public static double calculateExpenses(double income, double revenue) {
        return revenue - income;
    }

    /*
    Calculate earnings before tax and interest (EBIT)
     */
    public static double calculateEarningsBeforeInterestAndTax(double revenue, double expenses, double depreciation) {
        return calculateIncome(revenue, expenses) - depreciation;
    }

    /*
    Calculate Earnings before tax (EBT)
     */
    public static double calculateEarningsBeforeTax(double revenue, double expenses, double depreciation,
                                                    double interest) {
        return calculateEarningsBeforeInterestAndTax(revenue, expenses, depreciation) - interest;
    }

    /*
    Calculate Net Income
     */
    public static double calculateNetIncome(double revenue, double expenses, double depreciation, double interest,
                                            double taxes) {
        return calculateEarningsBeforeTax(revenue, expenses, depreciation, interest) - taxes;
    }

    /*
    Calculate dividend payout ratio
     */
    public static double calculateDividendPayoutRatio(double cashDividend, double netIncome) {
        return cashDividend / netIncome;
    }



}
