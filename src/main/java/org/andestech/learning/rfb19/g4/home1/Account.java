package org.andestech.learning.rfb19.g4.home1;

public class Account {

    //private

    private int id;
    private double balance;
    //private Customer customer = new Customer();


    // CONSTANTS
    private static final double MAX_VAL = 1500, MIN_VAL = 10;

    // default
    public Account(){}

    // Constructor
    public Account( int id, double balance, Customer customer) {

        this.id = id;
        //this.balance = balance;
        //this.customer = customer;





        if (balance < MIN_VAL || balance > MAX_VAL) {

            System.out.println("[WARNING] Balance is out of range 100..1500");
        } else {
            this.balance = balance;
        }

    }


    // SETTER
    public void setId( int id ){
        this.id = id;
    }

    public void setBalance( double balance ){

        if (balance < MIN_VAL || balance > MAX_VAL) {

            System.out.println("[WARNING] Balance is out of range 100..1500");
        } else {
            this.balance = balance;
        }
    }

    /*
    public void setCustomer( Customer customer ){
        this.customer = customer;
    }
    */


    // GETTER
    public int getId( ){
        return id;
    }

    public double getBalance( ){
        return balance;
    }

    /*
    public Customer getCustomer( ){
        return customer;
    }
    */

    }

