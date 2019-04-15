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

        Customer customer = new Customer("name", "second_name", "Address");
        Account account = new Account(1L, 1000.99, customer);
        System.out.println(account.getBalance());
        account.setBalance(-100L);


    }
}
