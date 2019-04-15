package org.andestech.learning.rfb19.g4.home1;

public class Customer {
    private String firstName;
    private String secondName;
    private String address;

    public Customer(String firstName, String secondName, String address) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.address = address;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getSecondName() {
        return this.secondName;
    }
}
