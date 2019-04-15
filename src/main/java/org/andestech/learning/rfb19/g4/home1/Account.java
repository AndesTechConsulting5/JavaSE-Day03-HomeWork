package org.andestech.learning.rfb19.g4.home1;

import java.sql.SQLOutput;

public class Account {

    private int id;

    private int balance;

    private Customer customer;

    public Account(){}

    public Account(int id, int balance, Customer customer) {
        this.id = id;
        this.setBalance(balance);
        this.customer = customer;
    }

    public int getId() {
        System.out.println("id = " + id);
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBalance() {
        System.out.println("Balance = " + balance);
        return balance;
    }

    public void setBalance(int balance){

        System.out.println("set balance = " + balance);

        if(balance < 0 || balance > 1_000_000){
            System.out.println("Balance should be more than 0 and less than 1 000 000");
        } else {
            this.balance = balance;
        }
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}
