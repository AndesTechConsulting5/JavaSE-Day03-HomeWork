package org.andestech.learning.rfb19.g4.home1;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

class App
{
    public static void main( String[] args )
    {
        Customer customer1 = new Customer("Alexander ", "Baryshev ", "Moscow");
        System.out.println("Пользователь1 - " + customer1.getFirstName() + customer1.getSecondName() + customer1.getAddress());

        System.out.println("-------------Проверка баланса---------------");
        Account account1 = new Account(1, 3479874, customer1);
        System.out.println(String.valueOf(account1.getId()) + " " + String.valueOf(account1.getBalance()));
        Account account2 = new Account(2, 55, customer1);
        System.out.println(String.valueOf(account2.getId()) + " " + String.valueOf(account2.getBalance()));

        account2.setId(17);
        account2.setCustomer(customer1);
        account2.setBalance(1);

        account2.setBalance(-1);
    }
}
