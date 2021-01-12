package Assets;
// todo implement
public class TaxBrackets {
    public static final Tax[] taxBrackets = new Tax[7];
    public static void setup() {
        taxBrackets[0] = new Tax(9700,.10);
        taxBrackets[1] = new Tax(39475,.12);
        taxBrackets[2] = new Tax(84200,.22);
        taxBrackets[3] = new Tax(160725, .24);
        taxBrackets[4] = new Tax(204100, .32);
        taxBrackets[5] = new Tax(510300, .35);
        taxBrackets[6] = new Tax(Integer.MAX_VALUE, .37);
    }

    /*
    Calculate person taxes owed
     */
    // todo not given good output
    public static double calculateTaxes(double amountEarned) {
        setup();
        double taxes = 0;
        for (int i = 1; i < taxBrackets.length; i++) {
            if (amountEarned > taxBrackets[i].getMaxAmount()) {
                double amountAtCurrentBracket = amountEarned - taxBrackets[i-1].getMaxAmount();
                taxes += calculateTaxAtRate(amountAtCurrentBracket, taxBrackets[i].getTaxRate());

            } else {
                break;
            }
        }
        return taxes;
    }

    private static double calculateTaxAtRate(double amount, double rate) {
        return amount * rate;
    }
}

class Tax{
    private double maxAmount;
    private double taxRate;

    public Tax(double maxAmount, double taxRate) {
        this.maxAmount = maxAmount;
        this.taxRate = taxRate;
    }

    public double getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(double maxAmount) {
        this.maxAmount = maxAmount;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }
}
