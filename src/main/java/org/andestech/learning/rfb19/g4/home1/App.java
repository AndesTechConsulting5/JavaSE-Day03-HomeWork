package org.andestech.learning.rfb19.g4.home1;

/**
 * Home Work 1
 *
 *
 */
public class App 
{
    public static void main( String[] args ) {
        //
        Customer newClient = new Customer ("Name", "Surname", "Moscow");

        Account newAccount = new Account (1, 140.0, newClient );

        double balance = newAccount.getBalance();

        System.out.println("balance is " + balance);

    }
}
