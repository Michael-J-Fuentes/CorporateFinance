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
}
