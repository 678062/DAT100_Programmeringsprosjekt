package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();

        Customer kunde = new Customer(
                "Alice Smith",
                "alice@example.com",
                1001,
                PowerAgreementType.SPOTPRICE
        );

        // Test toString()
        System.out.println(kunde);

        // Test get-metodene
        System.out.println("\nTester get-metodene:");
        System.out.println(kunde.getName());
        System.out.println(kunde.getEmail());
        System.out.println(kunde.getCustomer_id());
        System.out.println(kunde.getAgreement());

        // Test set-metodene
        kunde.setName("Bob Smith");
        kunde.setEmail("bob@example.com");
        kunde.setCustomer_id(1002);
        kunde.setAgreement(PowerAgreementType.SPOTPRICE);

        // Skriv ut kunden etter endringene
        System.out.println("\nEtter endringene:");
        System.out.println(kunde);
    }
}
