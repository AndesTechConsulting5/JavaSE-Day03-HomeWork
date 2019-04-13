package org.andestech.learning.rfb19.g4.home1;

public class Account {

    private int id;
    private double balance;
    private Customer customer = new Customer();


    public Account() {

    }

    public Account(int id, double balance, Customer customer) {
        this.id = id;
        this.customer = customer;

        // ограничение по балансу
        System.out.println("Ограничение по балансу 0 - 1_400_000");
        if (balance < 0 || balance > 1_400_000) {
            throw new IllegalArgumentException("Неправильный баланс: " + balance);
        }
        this.balance = balance;
    }


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
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}
