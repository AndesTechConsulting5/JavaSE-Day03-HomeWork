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
        Customer client1 = new Customer ("Иван", "Петров", "ул.Ленина, д.1");
        Account account1 = new Account (1, 1024.47, client1);
    }
}
