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
        Customer customer1 = new Customer();
        Customer customer2 = new Customer("Mikhail");
        Customer customer3 = new Customer("Mikhail", "Svetlov");
        Customer customer4 = new Customer("Mikhail", "Svetlov", "3rd Stroiteley st., Moscow");

        System.out.println("Customer1: name " + customer1.getFirstName() + " surname " + customer1.getSecondName() + " address " + customer1.getAddress());
        System.out.println("Customer2: name " + customer2.getFirstName() + " surname " + customer2.getSecondName() + " address " + customer2.getAddress());
        System.out.println("Customer3: name " + customer3.getFirstName() + " surname " + customer3.getSecondName() + " address " + customer3.getAddress());
        System.out.println("Customer4: name " + customer4.getFirstName() + " surname " + customer4.getSecondName() + " address " + customer4.getAddress());

        Account account1 = new Account();
        Account account2 = new Account(1);
        Account account3 = new Account(2, 500.0);
        Account account4 = new Account(3, 1_000, customer1);

        System.out.println("Account1: id " + account1.getId() + " customer " + account1.getCustomer() + " balance " + account1.getBalance());
        System.out.println("Account2: id " + account2.getId() + " customer " + account2.getCustomer() + " balance " + account2.getBalance());
        System.out.println("Account3: id " + account3.getId() + " customer " + account3.getCustomer() + " balance " + account3.getBalance());
        System.out.println("Account4: id " + account4.getId() + " customer " + account4.getCustomer() + " balance " + account4.getBalance());

        account4.setBalance(-1);
        System.out.println("Account4: id " + account4.getId() + " customer " + account4.getCustomer().getFirstName() + " " + account4.getCustomer().getSecondName() + " balance " + account4.getBalance());

        account4.setBalance(1_000_000);
        System.out.println("Account4: id " + account4.getId() + " customer " + account4.getCustomer().getFirstName() + " " + account4.getCustomer().getSecondName() + " balance " + account4.getBalance());

    }
}
