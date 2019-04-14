package org.andestech.learning.rfb19.g4.home1;

// Создать поля id, balance, customer (поле типа Customer).
public class Account {

	private int id;
	private int balance;
	private Customer customer = new Customer();

	public Account(int id, int balance, String hfdfghfg){

	}

	public Account(int id, int balance, Customer customer) {
		this.id = id;
		this.balance = balance;
		this.customer = customer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {

		if (balance < 0 || balance > 1000)
		{
			System.out.println("Min balance = 1, Max balance = 1000");
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
