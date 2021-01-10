package Assets;
// todo implement
public class TaxBrackets {
    public static final Tax[] taxBrackets = new Tax[7];

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
