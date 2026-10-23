package no.hvl.dat100.javel.oppgave1;

public class DailyPower {

    // a) print power prices during a day
    public static void printPowerPrices(double[] prices) {

        for (int i = 0; i < prices.length; i++){
            System.out.print(prices[i] + "NOK ");
        }
    }

    // b) print power usage during a day
    public static void printPowerUsage(double[] usage) {

        for (int i = 0; i < usage.length; i++){
            System.out.print(usage[i] + "kWt ");
        }
    }

    // c) compute power usage for a single day
    public static double computePowerUsage(double[] usage) {

        double sum = 0;

        for (int t = 0; t < usage.length; t++) {
            sum = sum + usage[t];
        }
        double total = sum;
        System.out.println(sum + " kW");
        return sum;
    }

    // d) compute spot price for a single day
    public static double computeSpotPrice(double[] usage, double[] prices) {

        double price = 0;

        for (int i = 0; i < usage.length; i++) {
            price = price + usage[i] * prices[i];
        }
        System.out.print(price + "kr ");
        return price;
    }

    // e) compute power support for a given usage and price
    private static final double THRESHOLD = 0.9375;
    private static final double PERCENTAGE = 0.9;

    private static double getSupport(double usage, double price) {

        double support = 0;

        if (price > THRESHOLD){
            support = PERCENTAGE * (price - THRESHOLD) * usage;
        }

        return support;
    }

    // f) compute power support for a single day
    public static double computePowerSupport(double[] usage, double[] prices) {

        double support = 0;

        for (int i = 0; i < usage.length; i++) {
            support = support + getSupport(usage[i], prices[i]);
        }
        System.out.print(support);
        return support;
    }

    // g) compute norges pris for a single day
    private static final double NORGESPRIS_KWH = 0.5;

    public static double computeNorgesPrice(double[] usage) {

        double price = 0;

        for (int t = 0; t < usage.length; t++) {
            price = price + usage[t] * NORGESPRIS_KWH;
        }
        System.out.print(price + "kr");
        return price;
    }

    // h) compute peak usage during a single day
    public static double findPeakUsage(double[] usage) {

        double temp_max = 0;

        for (int i = 0; i < usage.length; i++){
            if (usage[i] > temp_max){
                temp_max = usage[i];
            }
        }
        System.out.print(temp_max + "kWh");
        return temp_max;
    }

    // i)
    public static double findAvgPower(double[] usage) {

        double average = 0;
        double sum = 0;

        for (int i = 0; i < usage.length; i++){
            sum = sum + usage[i];
        }
        average = sum / usage.length;
        System.out.print(average + " kWh");
        return average;
    }
}