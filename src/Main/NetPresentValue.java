package Main;

import java.lang.Math;

public class NetPresentValue {
    /*
    Calculate Simple present value. cashflowAtDateN is the money received in one year
     */
    public static double calculatePresentValue(double cashFlowAtDateN, double interestRate) {
        return (cashFlowAtDateN) / (1 + interestRate);
    }

    /*
    Calculate net present value
     */
    public static double calculateNetPresentValue(double currentCost, double presentValue) {
        return -currentCost + presentValue;
    }

    /*
    Calculate Future Value of an investment
     */
    public static double calculateFutureValue(double investment, double interestRate, double time) {
        return investment * Math.pow((1 + interestRate),time);
    }

    /*
    Calculate the present value of a investment
     */
    public static double calculatePresentValueSimple(double investment, double interestRate, double time) {
        return (investment) / Math.pow((1 + interestRate), time);
    }

    /*
    Calculate effective Annual interest Rate
     */
    public static double calculateEffectiveAnnualInterestRate(double rate, double yearlyCompoundingPeriods) {
        return Math.pow((1 + (rate / yearlyCompoundingPeriods)), yearlyCompoundingPeriods) - 1;
    }

    /*
    Calculate future value with compounding
     */
    public static double calculateFutureValue(double investment, double rate, double time, double periodsPerYear) {
        return investment * Math.pow((1 + (rate / periodsPerYear)), (time * periodsPerYear));
    }

    /*
    Calculate the present value of perpetuity
     */
    public static double calculatePresentValueOfPerpetuity(double couponAmount, double rate) {
        return couponAmount / rate;
    }

    /*
    Calculate the value of growing perpetuity
     */
    public static double calculatePresentValueOfGrowingPerpetuity(double couponAmount, double rate, double growth) {
        return (couponAmount) / (rate - growth);
    }

    /*
    Calculate growth rate of a perpetuity
     */
    public static double calculateGrowthRateOfPerpetuity(double cashFlow0, double cashFlow1) {
        return (cashFlow1 - cashFlow0 ) / cashFlow0; 
    }

    /*
    Calculate the present value of annuity
     */
    public static double calculatePresentValueOfAnnuity(double couponAmount, double rate, double time) {
        return couponAmount * ((1 / rate ) - (1 - (rate * Math.pow((1+rate), time))));
    }

    /*
    Calculate present value growing annuity
     */
    public static double calculatePresentValueOfGrowingAnnuity(double couponAmount, double rate, double time, double growth) {
        return couponAmount * ((1 / (rate - growth)) - (1/ (rate - growth)) * Math.pow((1 + growth)/(1 + rate),time));
    }

    /*
    Calculate discount rate
     */
    public static double calculateDiscountRate(double presentValue, double futureValue) {
        return (futureValue - presentValue) / presentValue;
    }

    /*
    Calculate discount rate
     */
    public static double calculateDiscountRate(double presentValue, double futureValue, double periods) {
        return Math.pow((futureValue / presentValue), (1 / periods)) - 1;
    }

    /*
    Calculate number of periods
     */
    public static double calculateNumberOfPeriods(double presentValue, double futureValue, double rate) {
        return Math.log(futureValue / presentValue) / Math.log(1 + rate);
    }
}
