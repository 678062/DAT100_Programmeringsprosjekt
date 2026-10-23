package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave2.MonthlyPower;

import java.util.Arrays;

public class Invoice {

    private Customer c; // customer associated with this invoice
    private String month; // month that the invoice covers
    private double[][] usage; // power usage this month (per day and per hour)
    private double[][] prices; // power prices for this month

    private double amount; // power price for this month


    public Invoice(Customer c, String month, double[][] usage, double[][] power_prices) {

        this.c = c;
        this.month = month;
        this.usage = usage;
        this.prices = power_prices;
        this.amount = 0;

    }

    public void computeAmount() {
        amount = 0;

        for (int day = 0; day < usage.length; day++) {
            for (int hour = 0; hour < usage[day].length; hour++) {
                amount += usage[day][hour] * prices[day][hour];
            }

        }
    }
            public void printInvoice() {
                double totalUsage = 0;

                for (int day = 0; day < usage.length; day++) {
                    for (int hour = 0; hour < usage[day].length; hour++) {
                        totalUsage += usage[day][hour];
                    }
                }

                System.out.println("Customer number " + c.getCustomerNumber());
                System.out.println("Name  " + c.getName());
                System.out.println("Email " + c.getEmail());
                System.out.println("Agreement " + c.getAgreement());

                System.out.println();
                System.out.println("Month: " + month);
                System.out.printf("Usage: %10.2f kWh%n", totalUsage);
                System.out.printf("Amount: %9.2f NOK%n", amount);
                System.out.println();


            }


}