package org.andestech.learning.rfb19.g4.home1;

public class Customer {
    private String firstName, secondName, address;

    public Customer() {
        firstName  = "Ivanov";
        secondName = "Ivan";
        address   = "Ул. Пушкина д. Колотушкина";
    };

    public static int print(int a, int b){
        return a+b;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
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
