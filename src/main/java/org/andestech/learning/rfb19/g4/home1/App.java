package org.andestech.learning.rfb19.g4.home1;

/**
 * Home Work 1
 *
 *
 */
public class App 
{
    public static void main( String[] args ) {

        // empty classes
        Account Account_empty = new Account();
        Customer Customer_empty = new Customer();

        System.out.println( Account_empty.getBalance() );
        System.out.println( Account_empty.getId() );

        // classes initialized
        Customer newClient = new Customer ("NameTest", "SurnameTest", "Moscow");
        Account newAccount = new Account (77, 1300.0, newClient );

        // getting data
        double balance = newAccount.getBalance();
        int id = newAccount.getId();

        System.out.println("balance ---> " + balance + " RUR");
        System.out.println("Your id ---> " + id );

        newAccount.setBalance( 150 );
        newAccount.setId( 88 );


        balance = newAccount.getBalance();
        id = newAccount.getId();

        System.out.println("balance ---> " + balance + " RUR");
        System.out.println("Your id ---> " + id );

    }
}
