package by.jonline.progwithclass.aggregationandcompositionеtaskfour;

/*Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам.
Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.*/


import java.util.ArrayList;
import java.util.List;

public class BankLogic {

    //пополнение банковского счета
    public void topUpAccount(double value, Account account){
        if(account.isState_of_account()){
            account.setAvailable_balance(account.getAvailable_balance() + value);
        }else {
            System.out.println("account is blocked!");
        }
    }

    //снятие денег со счета
    public void withdrawAccount(double value, Account account){
        if (account.isState_of_account()){
            account.setAvailable_balance(account.getAvailable_balance() - value);
        }else {
            System.out.println("account is blocked!");
        }
    }

    //блокировка счета
    public void blockAccount(Account account){
        if(account.isState_of_account()){
            account.setState_of_account(false);
        }else {
            System.out.println("account is blocked!");
        }
    }

    //разблокировка счета
    public void unblockingAccount(Account account){
        if(!account.isState_of_account()){
            account.setState_of_account(true);
        }else {
            System.out.println("account is not blocked");
        }
    }

    //поиск по номеру счета
    public Account accountSearch(long number, Сlient client){
        for (Account account: client.getAccounts()) {
            if(account.getAccountNumber() == number){
                return account;
            }
        }
        return null;
    }

    //сортировка банковских счетов по сумме счета
    public List<Account> sortAccountByBalance(Сlient client){
        List<Account> sortAcc = new ArrayList<>(client.getAccounts());
        int i = 0;
        while (i < sortAcc.size() - 1){
            if(sortAcc.get(i).getAvailable_balance() > sortAcc.get(i + 1).getAvailable_balance()){
                Account key = sortAcc.get(i);
                sortAcc.set(i, sortAcc.get(i + 1));
                sortAcc.set(i + 1, key);
                if(i != 0){
                    i--;
                }
            }else {
                i++;
            }
        }
        return sortAcc;
    }

    //сортировка банковских счетов по номеру счета
    public List<Account> sortAccountByNumber(Сlient client){
        List<Account> sortAcc = new ArrayList<>(client.getAccounts());
        int i = 0;
        while (i < sortAcc.size() - 1){
            if(sortAcc.get(i).getAccountNumber() > sortAcc.get(i + 1).getAccountNumber()){
                Account key = sortAcc.get(i);
                sortAcc.set(i, sortAcc.get(i + 1));
                sortAcc.set(i + 1, key);
                if(i != 0){
                    i--;
                }
            }else {
                i++;
            }
        }
        return sortAcc;
    }

    //сумма остатка на всех счетах
    public double balanceAllAccounts(Сlient client){
        double result = 0;
        for (Account acc: client.getAccounts()) {
            result += acc.getAvailable_balance();
        }
        return result;
    }

    //сумма остатка на счетах с положительным и отрицательным балансом
    public double[] balancePositiveAndNegativeAccounts(Сlient client){
        double positive_result = 0;
        double negative_result = 0;
        for (Account acc: client.getAccounts()) {
            if(acc.getAvailable_balance() > 0){
                positive_result += acc.getAvailable_balance();
            }else {
                negative_result += acc.getAvailable_balance();
            }
        }
        return new double[]{positive_result, negative_result};
    }
}
