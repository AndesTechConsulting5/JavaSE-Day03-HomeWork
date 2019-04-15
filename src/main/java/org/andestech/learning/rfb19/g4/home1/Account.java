package org.andestech.learning.rfb19.g4.home1;

public class Account {
    private long id;
    private double balance;
    private Customer customer;

    public Account() {
    }

    public Account(long id, double balance, Customer customer) {
        this.id = id;
        this.balance = balance;
        this.customer = customer;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {

        if(balance < 0 || balance > 100000000){
            System.out.println("Incorrect balance");
            return;
        }

        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
