package by.jonline.progwithclass.aggregationandcompositionеtaskfour;

/*Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам.
Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.*/

public class MainClient {
    public static void main(String[] args) throws InterruptedException {

        BankLogic logic = new BankLogic();
        BankView view = new BankView();

        Account account1 = new Account(45221256);
        Account account2 = new Account(43521555);
        Account account3 = new Account(42511111);
        Account account4 = new Account(53225415);


        Сlient client = new Сlient("Ivanov", "Ivan", 1325887492);

        client.addAccount(account1);
        client.addAccount(account2);
        client.addAccount(account3);
        client.addAccount(account4);

        logic.topUpAccount(2105.23, logic.accountSearch(42511111, client));
        logic.topUpAccount(1320.12, logic.accountSearch(45221256, client));
        logic.withdrawAccount(895.1, logic.accountSearch(43521555, client));
        logic.withdrawAccount(1100.85, logic.accountSearch(53225415, client));

        view.print("Сортировка по номеру счета: ", logic.sortAccountByNumber(client));
        view.print("Сортировка по балансу: ", logic.sortAccountByBalance(client));
        view.print("Сумма остатка на всех счетах: ", logic.balanceAllAccounts(client));
        view.print("Сумма остатка на счетах с положительным и отрицательным балансом: ", logic.balancePositiveAndNegativeAccounts(client));

        logic.blockAccount(logic.accountSearch(42511111, client));
        logic.withdrawAccount(255, logic.accountSearch(42511111, client));

    }
}
