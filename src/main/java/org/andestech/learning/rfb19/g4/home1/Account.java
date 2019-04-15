package org.andestech.learning.rfb19.g4.home1;

public class Account {
    private int id;
    private double balance ;
    Customer Customer;

    public Account() {
        id = 2;
        balance = -10;
        Customer = new Customer() ;
        if (balance < 0 || balance > 1_000_000) {
            System.out.println("balance За границами лимита 0 1_000_000  (" + balance + ")!!!");
            return;
        }
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

    public org.andestech.learning.rfb19.g4.home1.Customer getCustomer() {
        return Customer;
    }

    public void setCustomer(org.andestech.learning.rfb19.g4.home1.Customer customer) {
        Customer = customer;
    }
}
