package org.andestech.learning.rfb19.g4.home1;

/**
 * Home Work OVODENKO
 *
 *
 */
public class App 
{
    public static void main( String[] args ) {

        // empty classes
        Account Account_empty = new Account();
        //Customer Customer_empty = new Customer();

        System.out.println( Account_empty.getBalance() );
        System.out.println( Account_empty.getId() );

        /*
        System.out.println( Customer_empty.getAddress() );
        System.out.println( Customer_empty.getFirstName() );
        System.out.println( Customer_empty.getSecondName() );
         */

        // classes initialized
        Customer newClient = new Customer ("NameTest", "SurnameTest", "Moscow");
        Account newAccount = new Account (77, 700.0, newClient );

        // getting data
        double balance = newAccount.getBalance();
        int id = newAccount.getId();

        System.out.println("balance ---> " + balance + " RUR");
        System.out.println("Your id ---> " + id );

        newAccount.setBalance( 500 );
        newAccount.setId( 88 );

        balance = newAccount.getBalance();
        id = newAccount.getId();

        System.out.println("balance ---> " + balance + " RUR");
        System.out.println("Your id ---> " + id );

        System.out.println("---Check out of range below-----");

        newAccount.setBalance( 150000 );
        balance = newAccount.getBalance();
        System.out.println("balance setted to---> " + balance + " RUR");

        newAccount.setBalance( 5 );
        balance = newAccount.getBalance();
        System.out.println("balance setted to---> " + balance + " RUR");


    }
}
