package org.andestech.learning.rfb19.g4.home1;

public class Customer {

    // private
    private String firstName;
    private String secondName;
    private String address;


    public Customer(){

    }


    public Customer( String firstName, String secondName, String address){

        this.firstName = firstName;
        this.secondName = secondName;
        this.address = address;
    }

    // SETTER

    public void setFirstName(){
        this.firstName = firstName;
    }

    public void setSecondName(){
        this.secondName = secondName;
    }

    public void setAddress(){
        this.address = address;
    }


    //GETTER
    public String getFirstName(){
        return firstName;
    }

    public String getSecondName(){
        return secondName;
    }

    public String getAddress(){
        return address;
    }


}
