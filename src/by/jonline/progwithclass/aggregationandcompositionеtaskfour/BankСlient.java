package by.jonline.progwithclass.aggregationandcompositionеtaskfour;

/*Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам.
Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class BankСlient {

    private String surname;
    private String name;
    private long passport_id;
    private BankAccount[] accounts;

    public BankСlient(String surname, String name, long passport_id, BankAccount[] accounts) {
        this.surname = surname;
        this.name = name;
        this.passport_id = passport_id;
        this.accounts = accounts;
    }

    public BankСlient(String surname, String name, long passport_id, BankAccount accounts) {
        ArrayList<BankAccount> acc= new ArrayList<>();
        acc.add(accounts);
        this.surname = surname;
        this.name = name;
        this.passport_id = passport_id;
        this.accounts = acc.toArray(new BankAccount[0]);
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public long getPassport_id() {
        return passport_id;
    }

    public BankAccount[] getAccounts() {
        return accounts;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassport_id(long passport_id) {
        this.passport_id = passport_id;
    }
    //add bank account
    public void addAccount(BankAccount account){
        ArrayList<BankAccount> accounts = new ArrayList<>(Arrays.asList(getAccounts()));
        accounts.add(account);
        this.accounts = accounts.toArray(new BankAccount[0]);
    }
    //remove bank account
    public void removeAccount(BankAccount account){
        ArrayList<BankAccount> accounts = new ArrayList<>(Arrays.asList(getAccounts()));
        accounts.remove(account);
        this.accounts = accounts.toArray(new BankAccount[0]);
    }

    //search by account number
    public BankAccount accountSearch(long number){
        for (BankAccount account: accounts) {
            if(account.getACCOUNT_NUMBER() == number){
                return account;
            }
        }
        return null;
    }

    //sorting bank accounts by date
    public BankAccount[] sortAccountByDate(){
        BankAccount[] sortAcc = getAccounts();
        Arrays.sort(sortAcc, new SortByDate());
        return sortAcc;
    }

    //sorting bank accounts by account amount
    public BankAccount[] sortAccountByBalance(){
        BankAccount[] sortAcc = getAccounts();
        Arrays.sort(sortAcc, new SortByBalans());
        return sortAcc;
    }

    //sorting bank accounts by account number
    public BankAccount[] sortAccountByNumber(){
        BankAccount[] sortAcc = getAccounts();
        Arrays.sort(sortAcc, new SortByNumber());
        return sortAcc;
    }

    //balance amount on all accounts
    public double balanceAllAccounts(){
        double result = 0;
        for (BankAccount acc: accounts) {
            result += acc.getAvailable_balance();
        }
        return result;
    }

    //the amount of the balance on accounts with positive and negative balance
    public double[] balancePositiveAndNegativeAccounts(){
        double positive_result = 0;
        double negative_result = 0;
        for (BankAccount acc: accounts) {
            if(acc.getAvailable_balance() > 0){
                positive_result += acc.getAvailable_balance();
            }else {
                negative_result += acc.getAvailable_balance();
            }
        }
        return new double[]{positive_result, negative_result};
    }



    private static class SortByDate implements Comparator<BankAccount> {
        public int compare(BankAccount a, BankAccount b){
            String firstAccount = a.getOPENING_DATE();
            String secondAccount = b.getOPENING_DATE();
            return firstAccount.compareTo(secondAccount);
        }
    }

    private static class SortByBalans implements Comparator<BankAccount> {
        public int compare(BankAccount a, BankAccount b){
            return Double.compare(a.getAvailable_balance(), b.getAvailable_balance());
        }
    }

    private static class SortByNumber implements Comparator<BankAccount> {
        public int compare(BankAccount a, BankAccount b){
            return Long.compare(a.getACCOUNT_NUMBER(), b.getACCOUNT_NUMBER());
        }
    }

}
