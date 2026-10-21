
package no.hvl.dat100.javel.oppgave2;

public class MonthMain {

    public static void main(String[] args) {

        // Hent dataene fra MonthPowerData
        double[][] usage = MonthPowerData.usage;
        double[][] prices = MonthPowerData.prices;

        // a) Skriv ut månedlig strømforbruk
        System.out.println("Månedlig strømforbruk:");
        MonthlyPower.print_PowerUsage(usage);

        // b) Skriv ut månedlige strømpriser
        System.out.println("\nMånedlige strømpriser:");
        MonthlyPower.print_PowerPrices(prices);

        // c) Beregn totalt strømforbruk
        double totalUsage = MonthlyPower.computePowerUsage(usage);
        System.out.printf("\nTotalt strømforbruk: %.2f kWh%n", totalUsage);

        // d) Sjekk om forbruket overstiger grensen
        double threshold = 5000;
        boolean exceeded = MonthlyPower.exceedThreshold(usage, threshold);

        System.out.println("Overstiger forbruket " + threshold
                + " kWh? " + exceeded);

        // e) Beregn samlet spotpris
        double spotPrice = MonthlyPower.computeSpotPrice(usage, prices);
        System.out.printf("Samlet spotpris: %.2f kr%n", spotPrice);

        // f) Beregn strømstøtte
        double powerSupport = MonthlyPower.computePowerSupport(usage, prices);
        System.out.printf("Strømstøtte: %.2f kr%n", powerSupport);

        // g) Beregn Norgespris
        double norgesPrice = MonthlyPower.computeNorgesPrice(usage);
        System.out.printf("Norgespris: %.2f kr%n", norgesPrice);
    }
}
