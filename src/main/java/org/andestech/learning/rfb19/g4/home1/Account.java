package org.andestech.learning.rfb19.g4.home1;

public class Account {
    private int id;
    private double balance;
    Customer customer;

    private static final double MAX_BALANCE = 1_000_000;
    private static final double MIN_BALANCE = 10;
    private static int count = 0;



    public Account(int id, float balance, Customer customer) {
        if (balance > MAX_BALANCE) {
            System.out.println("Баланс превышен, нельзя указать баланс более 1 млн, баланс установлен в 1 млн");
            this.balance = MAX_BALANCE;

        } else
            if (balance < MIN_BALANCE) {
                System.out.println("Нельзя установить отрицательный баланс");

            } else  this.balance = balance;
        this.id = id;
        this.customer = customer;
        count++; //счетчик созданных счетов
    }

    public static int getCount() {
        return count;
    }

    public double getBalance() {
        return balance;
    }

    private static boolean isNewBalanceValid (double balance ) {
        if (balance < MAX_BALANCE && balance > MIN_BALANCE) {
            return true;
        } else {
            System.out.println("некорректный баланс");
            return false;
        }
    }

    public void setBalance(double balance) {
        if (balance > MAX_BALANCE) {
            System.out.println("Баланс превышен, вы можете пополнить максимум на " +( (int)(MAX_BALANCE) - this.balance) + " единиц");
            return;
        } else
        if (balance < MIN_BALANCE) {
            System.out.println("Нельзя установить отрицательный баланс");
            return;
        }
            this.balance = balance;
    }

    public String getFIO() {
        return customer.getFirstName();

    }

    public  void  changeBalance(double delta) {
        if (balance < delta) {
            System.out.println("недостаточно средств");
        } else if (balance+delta > 1_000_000) {
            System.out.println("баланс превысит 1млн, не надо так");
        } else
            setBalance(this.balance + delta);
    }

    public static void changeBalance2 (Account account, double delta) {
        account.balance += delta;
    }
}
