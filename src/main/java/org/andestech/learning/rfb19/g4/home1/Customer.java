package org.andestech.learning.rfb19.g4.home1;

public class Customer {

    public String firstName;
    public String secondName;
    public String address;

    public Customer(){

    }
    public Customer(String firstName, String secondName, String address) {

        this.firstName = firstName;
        this.secondName = secondName;
        this.address = address;
    }

    public java.lang.String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
