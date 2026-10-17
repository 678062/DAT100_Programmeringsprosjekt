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
        Customer alice = new Customer("Alice Smith", "alice@example.com", 1001, PowerAgreementType.SPOTPRICE);
        Customer bob = new Customer("Bob Johnson", "bob@example.com", 1002,PowerAgreementType.NORGESPRICE);
        Customer charlie = new Customer("Charlie Rose", "charlie@example.com", 1003, PowerAgreementType.POWERSUPPORT);
        Customer diana = new Customer("Diana Prince", "diana@example.com", 1004, PowerAgreementType.NORGESPRICE);
        Customer ethan = new Customer("Ethan Hunt", "ethan@example.com", 1005, PowerAgreementType.POWERSUPPORT);

        //Oppgave a
        System.out.println(count);

        //Oppgave b
        System.out.println("Antall kunder: ");
    }
}
