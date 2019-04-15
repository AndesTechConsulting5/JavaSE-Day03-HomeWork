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
        Customer gromovCustomer = new Customer("Ivan","Gromov","Moscow");
        Customer petrovCustomer = new Customer("Petr", "Petrov", "Piter");
        Account firstAccount = new Account(1, 200, gromovCustomer);
        Account petrovAccount = new Account(2, 2_000_000, petrovCustomer);
        System.out.println(petrovCustomer.getFirstName());
        System.out.println(petrovCustomer.getSecondName());
        System.out.println(petrovAccount.getBalance());
        System.out.println(petrovAccount.customer.getSecondName());



    }
}
