package org.andestech.learning.rfb19.g4.home1;

public class Customer {

    private String firstName;

    private String secondName;

    private String address;

    public Customer(){}

    public Customer(String firstName, String secondName, String address) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.address = address;
    }

    public String getFirstName() {
        System.out.println("First Name = " + firstName);
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        System.out.println("Second Name = " + secondName);
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getAddress() {
        System.out.println("Address = " + address);
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
