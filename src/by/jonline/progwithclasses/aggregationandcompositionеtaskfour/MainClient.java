package by.jonline.progwithclasses.aggregationandcompositionеtaskfour;

/*Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам.
Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.*/

import java.util.Arrays;

public class MainClient {
    public static void main(String[] args) throws InterruptedException, AccountIsBlocked, InsufficientFunds {
        BankAccount account1 = new BankAccount(45221256);
        Thread.sleep(1000);
        BankAccount account2 = new BankAccount(43521555);
        Thread.sleep(1000);
        BankAccount account3 = new BankAccount(42511111);
        account1.topUPAccount(1255);
        account2.topUPAccount(1358.52);
        account3.withdrawAccount(1544.14);
        BankСlient client = new BankСlient("Ivanov", "Ivan", 1325887492, account1);
        client.addAccount(account2);
        client.addAccount(account3);
        System.out.println(client.accountSearch(43521555));
        System.out.println(Arrays.toString(client.sortAccountByBalance()));
        System.out.println(Arrays.toString(client.sortAccountByDate()));
        System.out.println(client.balanceAllAccounts());
        System.out.println(Arrays.toString(client.balancePositiveAndNegativeAccounts()));


    }
}
