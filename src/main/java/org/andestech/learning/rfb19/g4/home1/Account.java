package org.andestech.learning.rfb19.g4.home1;

public class Account {
    private int id;
    private double balance;
    private Customer customer;
    private final double LIMIT_LOW = 0;
    private final double LIMIT_HIGH = 100_000;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < LIMIT_LOW || balance > LIMIT_HIGH) return;
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Account(int id, double balance, Customer customer) {
        this.id = id;
        this.setBalance(balance);
        this.customer = customer;
    }

    public Account(int id, Customer customer) {
        this(id, 0, customer);
    }
}
