package org.andestech.learning.rfb19.g4.home1;

//import org.omg.Messaging.SYNC_WITH_TRANSPORT;

class Account {
    private int id;
    private float balance;
    private Customer customer;

    // Конструктор
    public Account (int id, float balance, Customer customer){
        this.id = id;
        this.balance = setBalance(balance);
        this.customer = customer;
    }

    //геттер
    public int getId(){return id;}
    public Customer getCustomer(){return customer;}
    public float getBalance(){return balance;}

    // ограничения для баланса
        private boolean validBalance(double newBalance){
        if (newBalance >= 0 && newBalance <= 100){
            System.out.println("Корректный баланс");
            return true;
        } else {
            System.out.println("Баланс НЕ корректный");
            return false;
        }
    }

    //Сеттер
    public void setId (int id) {this.id=id;}
    public float setBalance (float balance){
        if(validBalance(balance)){
        this.balance=balance;}
        return getBalance();
    }
    public void setCustomer (Customer customer) {this.customer=customer;}
}
