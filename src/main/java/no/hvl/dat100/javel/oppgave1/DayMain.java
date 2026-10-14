package no.hvl.dat100.javel.oppgave1;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();

        //Oppgave a
        System.out.println("Dette er strømprisen per time:");
        DailyPower.printPowerPrices(powerprices_day);

        System.out.println(""); //bare for å lage mellomrom mellom svarene

        //Oppgave b
        System.out.println("Dette er strømforbruket per time:");
        DailyPower.printPowerUsage(powerusage_day);

        System.out.println(""); //bare for å lage mellomrom mellom svarene

        //Oppgave c
        System.out.println("Totalt strømbruk for en dag: ");
        DailyPower.computePowerUsage(powerprices_day);
        DailyPower.computePowerUsage(powerusage_day);

    }
}
