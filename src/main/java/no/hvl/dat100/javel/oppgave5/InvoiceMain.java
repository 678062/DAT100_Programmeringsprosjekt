package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave2.MonthPowerData;

public class InvoiceMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 5");
        System.out.println("==============");
        System.out.println();

        Customer c1 = new Customer(
                "Charlie Rose",
                "charlie@example.com",
                1003,
                PowerAgreementType.POWERSUPPORT
        );

        Customer c2 = new Customer(
                "Diana Prince",
                "diana@example.com",
                1004,
                PowerAgreementType.NORGESPRICE
        );

        Customer c3 = new Customer(
                "Ethan Hunt",
                "ethan@example.com",
                1005,
                PowerAgreementType.SPOTPRICE
        );


        Invoice i1 = new Invoice(
                c1,
                "January",
                MonthPowerData.powerusage_month,
                MonthPowerData.powerprices_month
        );

        Invoice i2 = new Invoice(
                c2,
                "January",
                MonthPowerData.powerusage_month,
                MonthPowerData.powerprices_month
        );

        Invoice i3 = new Invoice(
                c3,
                "January",
                MonthPowerData.powerusage_month,
                MonthPowerData.powerprices_month
        );

        Invoice[] invoices = {i1, i2, i3};


        Invoices.processInvoices(invoices);


    }
}
