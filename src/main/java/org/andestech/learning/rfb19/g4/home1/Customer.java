package org.andestech.learning.rfb19.g4.home1;

public class Customer {

    private String firstname, secondname, address;

    public String getfirstname()
    {
        return firstname;
    }

    public void setfirstname(String firstname)
    {
        this.firstname = firstname;
    }

    public String getsecondname()
    {
        return secondname;
    }

    public void setsecondname(String secondname)
    {
        this.secondname = secondname;
    }

    public String getaddress()
    {
        return address;
    }

    public void setaddress(String address)
    {
        this.address = address;
    }
    public Customer(String firstname, String secondname, String address)
    {
        this.firstname = firstname;
        this.secondname = secondname;
        this.address = address;
    }
}
