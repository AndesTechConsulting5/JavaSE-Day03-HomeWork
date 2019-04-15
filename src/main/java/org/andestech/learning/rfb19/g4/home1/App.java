package org.andestech.learning.rfb19.g4.home1;
import
/**
 * Home Work 1
 *
 *
 */
public class App
{
    public static void main( String[] args )

    {
        /*      System.out.println(Customer.print(5,6));*/

/*        Customer cus1 = new Customer();
       cus1.setAddress("BOMJ");
       cus1.setFirstName("Sidor");
       cus1.setSecondName("Sidorov");

        System.out.println("Cus1  " + cus1.getAddress());
        cus1.setAddress("ул Ленина д23");
        System.out.println("After update" + cus1.getAddress());*/

        Account Acc1 = new Account();


        /*Acc1.setId(1);
        Acc1.setBalance(-10);
        Acc1.setCustomer(cus1);*/

        //Acc1.Customer=cus1;

        System.out.println(" Fir NA: "+ Acc1.Customer.getFirstName() + ";\n Sec NA: " + Acc1.Customer.getSecondName() + ";\n Addres: " + Acc1.Customer.getAddress() +
                ";\n ID:  " + Acc1.getId() + ";\n Ballance: " + Acc1.getBalance() );
    }
}
