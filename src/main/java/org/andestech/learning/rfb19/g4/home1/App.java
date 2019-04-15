package org.andestech.learning.rfb19.g4.home1;

/**
 * Home Work 1
 *
 *
 */
public class App
{
    public static void main( String[] args )

    {
        Customer client1 = new Customer ("Алексей", "Сидоров", "ул.Пушкина, д.1 кв.10");
        Customer client2 = new Customer ("Сергей", "Антонов", "ул.Гурьянова, д.3б кв.5");
        Account account1 = new Account (1, 50, client1);
        Account account2 = new Account (2, 500, client2);

        if (account1.results != 1) {
            System.out.println(client1.getfirstname() + " " + client1.getsecondname() + " " + client1.getaddress() + " " + account1.getid() + " " + account1.getbalance());
        }

    }
}



