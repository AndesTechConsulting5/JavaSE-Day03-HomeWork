package org.andestech.learning.rfb19.g4.home1;

/**
 * Home Work 1
 *
 *
 */
public class App 
{
    public static void main( String[] args ){

        //create new customer Sasha
        Customer customerSasha = new Customer("Sasha", "Gribok","ul. Mira");

        //create new account for Sasha with negative balance
        Account accountSasha = new Account(1, -1, customerSasha);

        accountSasha.getBalance(); // get Sasha balance


        //create new zero customer 001
        Customer customer001 = new Customer();

        customer001.setFirstName("Pavel"); //set 001 first name
        customer001.setSecondName("Sorokin"); //set 001 second name
        customer001.setAddress("Lenina"); //set 001 address

        //create new zero account for customer 001
        Account account001 = new Account();
        account001.setBalance(100500); //set account 001 balance = 100500
        account001.getBalance(); //get account001 balance

    }
}
