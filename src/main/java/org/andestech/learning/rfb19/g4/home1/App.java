package org.andestech.learning.rfb19.g4.home1;

/**
 * Home Work 1
 *
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Customer customer1 = new Customer("Mikhail", "Svetlov");
        Customer customer2 = new Customer("Mikhail", "Svetlov", "3rd Stroiteley st., Moscow");

        System.out.println("Customer3: name " + customer1.getFirstName() + " surname " + customer1.getSecondName() + " address " + customer1.getAddress());
        System.out.println("Customer4: name " + customer2.getFirstName() + " surname " + customer2.getSecondName() + " address " + customer2.getAddress());

        Account account1 = new Account(1, customer1);
        Account account2 = new Account(2, 1_000, customer1);

        System.out.println("Account1: id " + account1.getId() + " customer " + account1.getCustomer() + " balance " + account1.getBalance());
        System.out.println("Account2: id " + account2.getId() + " customer " + account2.getCustomer() + " balance " + account2.getBalance());

        account2.setBalance(-1);
        System.out.println("Account4: id " + account2.getId() + " customer " + account2.getCustomer().getFirstName() + " " + account2.getCustomer().getSecondName() + " balance " + account2.getBalance());

        account2.setBalance(1_000_000);
        System.out.println("Account4: id " + account2.getId() + " customer " + account2.getCustomer().getFirstName() + " " + account2.getCustomer().getSecondName() + " balance " + account2.getBalance());

    }
}
