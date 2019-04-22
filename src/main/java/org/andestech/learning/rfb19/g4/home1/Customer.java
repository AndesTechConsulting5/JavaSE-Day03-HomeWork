package org.andestech.learning.rfb19.g4.home1;

class Customer {
    private String firstName;
    private String secondName;
    private String address;

    //геттер
    public String getFirstName() {
        return firstName;
    }
    public String getSecondName() {
        return secondName;
    }
    public String getAddress() {
        return address;
    }

    //сеттер
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setSecondName(String secondName){
        this.secondName = secondName;
    }
    public void setAddress(String address){
        this.address = address;
    }

    // Конструктор
    public Customer(String firstName, String secondName, String address) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.address = address;
    }
}
