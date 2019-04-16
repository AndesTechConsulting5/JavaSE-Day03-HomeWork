package org.andestech.learning.rfb19.g4.home1;

class Account {
    private int id;
    private float balance;
    private Customer customer;// поправить

    // Конструктор
    public Account (int id, float balance, Customer customer)
    {
        this.id = id;
        this.balance = balance;
        this.customer = customer;
    }

    //геттер
    public int getId(){return id;}
    public Customer getCustomer1(){return customer;}

    // ограничения для баланса

    public float getBalance() {return balance;}

    public boolean validBalance(){
        if (balance >= 0 && balance <= 100) {return true;}
        else{
            System.out.println("Не верное значение баланса " + balance);
            {return false;}
        }
    }

    //Сеттер
    public void setId (int id) {this.id=id;}
    public void setBalance (float balance){this.balance=balance;}
    public void setCustomer (Customer customer) {this.customer=customer;}


    public static void main (String[] args){
    }
}
