package org.andestech.learning.rfb19.g4.home1;

class App
{
    public static void main( String[] args )
    {
        Customer customer1 = new Customer("Alexander ", "Baryshev ", "Moscow");
        System.out.println("Пользователь1 - " + customer1.getFirstName() + customer1.getSecondName() + customer1.getAddress());

        Account account1 = new Account(10, 101, customer1);
        //account1.getBalance();
        System.out.println(String.valueOf(account1.getId()) + " " + String.valueOf(account1.getBalance()));
        System.out.println(account1.validBalance());

        Account account2 = new Account(10, 100, customer1);
        //account1.getBalance();
        System.out.println(String.valueOf(account2.getId()) + " " + String.valueOf(account2.getBalance()));
        System.out.println(account2.validBalance());

        customer1.setFirstName("Semen ");
        customer1.setSecondName("Slepakov ");
        customer1.setAddress("Krasnodar");
        System.out.println("Пользователь2 - " + customer1.getFirstName() + customer1.getSecondName() + customer1.getAddress());

        account2.setId(17);
        account2.setCustomer(customer1);
        account2.setBalance(-1);
        System.out.println("Проверка Сетера " + account2.getBalance() + " "+ account2.validBalance());

    }
}
