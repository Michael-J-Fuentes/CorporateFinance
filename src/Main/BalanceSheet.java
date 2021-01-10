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
    public static double calculateAssetsCurrent(double accountsReceivable, double inventory) {
        return accountsReceivable + inventory;
    }
    /*
    Calculate total Assets
     */
    public static double calculateAssets(double accountsReceivable, double inventory, double fixedAssets) {
        return calculateAssetsCurrent(accountsReceivable, inventory) + fixedAssets;
    }
    /*
    Calculate current liabilities
     */
    public static double calculateLiabilitiesCurrent(double accountsPayable, double notesPayable) {
        return accountsPayable + notesPayable;
    }

    /*
    Calculate total liabilities
     */
    public static double calculateLiabilities(double accountsPayable, double notesPayable, double longTermDebt) {
        return calculateLiabilitiesCurrent(accountsPayable, notesPayable) + longTermDebt;
    }

    /*
    returns true if the accounting balance sheet is balanced
     */
    public static boolean isBalanced(double totalAssets, double totalLiabilities, double equity) {
        return (totalAssets ) == (totalLiabilities + equity);
    }

}
