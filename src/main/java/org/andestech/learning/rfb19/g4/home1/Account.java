package org.andestech.learning.rfb19.g4.home1;

class Account
{
    private int id;
    private double balance;
    private Customer Customer;
    int results;


//    public void getreuslts()
//    {
//        this.results = results;
//    }

    public int getid()
    {
        return id;
    }

    public void setid(int id)
    {
        this.id = id;
    }

    public double getbalance()
    {
        return balance;
    }

    public void setbalance(double balance)
    {
        this.balance = balance;
    }

    public Customer getcustomer()
    {
        return Customer;
    }

    public void setcustomer(Customer customer)
    {
        this.Customer = customer;
    }
    public Account(int id, double balance, Customer Customer)
    {
        this.id = id;
        this.Customer = Customer;
        this.balance = balance;
        this.results = results;

        if (balance < 0 || balance > 999999)
        {
            System.out.println("Не корректный баланс: !!!");
            results = 1;
        }

    }


}
