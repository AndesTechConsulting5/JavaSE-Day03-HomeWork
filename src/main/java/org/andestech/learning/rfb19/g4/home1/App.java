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
        customerSasha.getCustomerInfo(); //info about new customer
        //create new account for Sasha with negative balance
        Account accountSasha = new Account(1, -1, customerSasha);
        accountSasha.setBalance(1_000_001); //set Sasha balance = 1 000 001
        accountSasha.getBalance(); //get Sasha balance
        accountSasha.setBalance(549); //set Sasha balance = 549
        accountSasha.getBalance(); // get Sasha balance
        accountSasha.getAccountInfo(); //get info about Sasha account

        System.out.println();

        //create new zero customer 001
        Customer customer001 = new Customer();
        customer001.getCustomerInfo();
        customer001.setFirstName("Pavel"); //set 001 first name
        customer001.setSecondName("Sorokin"); //set 001 second name
        customer001.setAddress("Lenina"); //set 001 address
        customer001.getCustomerInfo(); //get info about customer 001
        //create new zero account for customer 001
        Account account001 = new Account();
        account001.getAccountInfo(); //get account info customer 001
        account001.setBalance(100500); //set account 001 balance = 100500


    }
}
