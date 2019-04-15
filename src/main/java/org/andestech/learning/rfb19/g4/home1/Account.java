package org.andestech.learning.rfb19.g4.home1;

public class Account {

        private int id;
        private int balance;
        private Customer customer = new Customer();

    public Account( int id, int balance, Customer customer){
            this.id = id;
            this.balance = balance;
            this.customer = customer;
        }

        public int getId () {
            return id;
        }

        public void setId ( int id){
            this.id = id;
        }

        public int getBalance () {
            return balance;
        }

        public void setBalance ( int balance){

            if (balance < 0 || balance > 1000000) {
                System.out.println("Минимальный баланс = 1, Максимальный баланс = 1000000");
            }
            this.balance = balance;
        }

        public Customer getCustomer () {
            return customer;
        }

        public void setCustomer (Customer customer){
            this.customer = customer;
        }
    }
