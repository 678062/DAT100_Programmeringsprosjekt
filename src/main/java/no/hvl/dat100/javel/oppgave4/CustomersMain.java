package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();

        //Definerer kundene
        Customers custom = new Customers (5);

        Customer alice = new Customer("Alice Smith", "alice@example.com", 1001, PowerAgreementType.SPOTPRICE);
        Customer bob = new Customer("Bob Johnson", "bob@example.com", 1002,PowerAgreementType.NORGESPRICE);
        Customer charlie = new Customer("Charlie Rose", "charlie@example.com", 1003, PowerAgreementType.POWERSUPPORT);
        Customer diana = new Customer("Diana Prince", "diana@example.com", 1004, PowerAgreementType.NORGESPRICE);
        Customer ethan = new Customer("Ethan Hunt", "ethan@example.com", 1005, PowerAgreementType.POWERSUPPORT);

        //Oppgave a
        custom.addCustomer(alice);
        custom.addCustomer(bob);
        custom.addCustomer(charlie);
        custom.addCustomer(diana);
        custom.addCustomer(ethan);

        //Oppgave b
        System.out.println("antall kunder: " + custom.countNonNull());

        //oppgave c
        System.out.println("Kunde: " + custom.getCustomer(1003));

        // Oppgave d
        Customers test = new Customers(2);

        System.out.println("Legg til Alice: "
                + test.addCustomer(alice)); // true

        System.out.println("Legg til Bob: "
                + test.addCustomer(bob)); // true

        System.out.println("Legg til Charlie: "
                + test.addCustomer(charlie)); // false

        System.out.println("Antall kunder: "
                + test.countNonNull()); // 2

        // Oppgave e
        Customer removed = test.removeCustomer(1001);

        System.out.println("Fjernet kunde: " + removed); // Alice

        System.out.println("Antall kunder etter fjerning: "
                + test.countNonNull()); // 1

        System.out.println("Fjern ukjent kunde: "
                + test.removeCustomer(9999)); // null

        // Oppgave f
        Customer[] customerArray = test.getCustomers();

        System.out.println("Kunder i tabellen:");

        for (int i = 0; i < customerArray.length; i++) {
            if (customerArray[i] != null) {
                System.out.println(customerArray[i]);
            }
        }
    }
}
