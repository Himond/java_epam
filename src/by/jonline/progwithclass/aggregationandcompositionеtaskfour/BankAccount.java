package by.jonline.progwithclass.aggregationandcompositionеtaskfour;

/*Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам.
Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.*/

import java.util.Date;

public class BankAccount {

    private final long ACCOUNT_NUMBER;
    private final Date OPENING_DATE;
    private double available_balance;
    private boolean state_of_account;
    private final double CREDIT_LIMIT = 2000;

    public BankAccount(long account_number) {
        this.ACCOUNT_NUMBER = account_number;
        this.available_balance = 0;
        this.OPENING_DATE = new Date();
        this.state_of_account = true;
    }

    public long getACCOUNT_NUMBER() {
        return ACCOUNT_NUMBER;
    }

    public double getCREDIT_LIMIT() {
        return CREDIT_LIMIT;
    }

    public String getOPENING_DATE() {
        return OPENING_DATE.toString();
    }

    public double getAvailable_balance() {
            return available_balance;
    }

    public boolean isState_of_account() {
        return state_of_account;
    }

    //bank account replenishment
    public void topUPAccount(double value){
        if(isState_of_account()){
            this.available_balance += value;
        }else {
            System.out.println("account is blocked!");
        }
    }

    //withdrawing money from an account
    public void withdrawAccount(double value){
        if (isState_of_account()){
            if (available_balance > (0 - CREDIT_LIMIT) && (available_balance - value) > (0 - CREDIT_LIMIT)){
                this.available_balance -= value;
            }else {
                System.out.println("insufficient funds in the account");
            }
        }else {
            System.out.println("account is blocked!");
        }
    }

    //account blocking
    public void blockAccount(){
        if(isState_of_account()){
            this.state_of_account = false;
        }else {
            System.out.println("account is blocked!");
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "ACCOUNT_NUMBER=" + ACCOUNT_NUMBER +
                ", OPENING_DATE=" + OPENING_DATE +
                ", available_balance=" + available_balance +
                ", state_of_account=" + state_of_account +
                ", CREDIT_LIMIT=" + CREDIT_LIMIT +
                '}';
    }
}
