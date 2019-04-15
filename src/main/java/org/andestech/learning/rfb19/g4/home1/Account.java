package org.andestech.learning.rfb19.g4.home1;

public class Account {
    private int id;
    private float balance;
    Customer customer;

    public Account(int id, float balance, Customer customer) {
        if (balance > 1_000_000) {
            System.out.println("Баланс превышен, нельзя указать баланс более 1 млн, баланс установлен в 1 млн");
            this.balance = 1_000_000;

        } else
            if (balance < 0) {
                System.out.println("Нельзя установить отрицательный баланс");

            } else  this.balance = balance;
        this.id = id;
        this.customer = customer;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        if (balance > 1_000_000) {
            System.out.println("Баланс превышен, вы можете пополнить максимум на " +( (int)(1_000_000) - this.balance) + " единиц");
            return;
        } else
        if (balance < 0) {
            System.out.println("Нельзя установить отрицательный баланс");
            return;
        }
            this.balance = balance;
    }

    public String getFIO() {
        return customer.getFirstName();

    }
}
