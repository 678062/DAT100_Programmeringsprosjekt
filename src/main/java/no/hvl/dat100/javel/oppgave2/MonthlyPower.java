package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {
        for (int i = 0; i < usage.length; i++) {
            System.out.print("Day " + (i + 1) + ":");

            for (int j = 0; j < usage[i].length; j++) {
                System.out.printf("%.2f kWh ", usage[i][j]);
            }

            System.out.println();
        }
    }

    // b) Skriv ut strømpris for hver dag i måneden
    public static void print_PowerPrices(double[][] prices) {
        for (int i = 0; i < prices.length; i++) {
            System.out.print("Day " + (i + 1) + ":");

            for (int j = 0; j < prices[i].length; j++) {
                System.out.printf("%.2f kr ", prices[i][j]);
            }

            System.out.println();
        }
    }

    // c) Beregn totalt strømforbruk for måneden
    public static double computePowerUsage(double[][] usage) {
        double sum = 0;

        for (int i = 0; i < usage.length; i++) {
            for (int j = 0; j < usage[i].length; j++) {
                sum += usage[i][j];
            }
        }

        return sum;
    }

    // d) Sjekk om forbruket overstiger grensen
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {
        boolean exceeded = false;
        double usage = 0;
        int i = 0;
        int j = 0;

        while (i < powerusage.length && !exceeded) {
            while (j < powerusage[i].length && !exceeded) {
                usage += powerusage[i][j];

                if (usage > threshold) {
                    exceeded = true;
                }

                j++;
            }

            i++;
            j = 0;
        }

        return exceeded;
    }

    // e) Beregn samlet spotpris for måneden
    public static double computeSpotPrice(double[][] usage, double[][] prices) {
        double price = 0;

        for (int i = 0; i < usage.length; i++) {
            for (int j = 0; j < usage[i].length; j++) {
                price += usage[i][j] * prices[i][j];
            }
        }

        return price;
    }

    // f) Beregn strømstøtte for måneden
    public static double computePowerSupport(double[][] usage, double[][] prices) {
        double support = 0;
        double threshold = 0.75;
        double supportRate = 0.90;

        for (int i = 0; i < usage.length; i++) {
            for (int j = 0; j < usage[i].length; j++) {
                if (prices[i][j] > threshold) {
                    support += usage[i][j]
                            * (prices[i][j] - threshold)
                            * supportRate;
                }
            }
        }

        return support;
    }

    // g) Beregn Norgespris for måneden
    public static double computeNorgesPrice(double[][] usage) {
        double price = 0;
        double norgesPrice = 0.50;

        for (double[] day : usage) {
            for (double hour : day) {
                price += hour * norgesPrice;
            }
        }

        return price;
    }
}
