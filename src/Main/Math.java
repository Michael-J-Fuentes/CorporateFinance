package Main;

public class Math {
    /*
    Calculate sum of n numbers
     */
    public static double calculateSumArray(double[] values){
        double total = 0;
        for (double i : values) {
            total += i;
        }
        return total;
    }
    /*
    Calculate the average of n numbers
     */
    public static double calculateAverage(double[] values) {
        return (calculateSumArray(values) / values.length);
    }

    /*
    Calculate the average of two numbers
     */
    public static double calculateAverage(double number1, double number2) {
        return (number1 + number2) / 2;
    }

    /*
    Round to nth digit
     */
    public static double round(double number, int digits) {
        int scale = (int) java.lang.Math.pow(10, digits);
        return (double) java.lang.Math.round(number * scale) / scale;
    }
}
