package by.jonline.progwithclass.aggregationandcompositionеtaskfour;

/*Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам.
Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.*/

import java.util.Date;
import java.util.Objects;

public class Account {

    private final long accountNumber;
    private final Date openingDate;
    private double available_balance;
    private boolean state_of_account;

    public Account(long account_number) {
        this.accountNumber = account_number;
        this.openingDate = new Date();
        this.state_of_account = true;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public Date getOpeningDate() {
        return openingDate;
    }

    public double getAvailable_balance() {
        return available_balance;
    }

    public void setAvailable_balance(double available_balance) {
        this.available_balance = available_balance;
    }

    public boolean isState_of_account() {
        return state_of_account;
    }

    public void setState_of_account(boolean state_of_account) {
        this.state_of_account = state_of_account;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account that = (Account) o;
        return accountNumber == that.accountNumber && Double.compare(that.available_balance, available_balance) == 0 && state_of_account == that.state_of_account && Objects.equals(openingDate, that.openingDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, openingDate, available_balance, state_of_account);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", openingDate=" + openingDate +
                ", available_balance=" + available_balance +
                ", state_of_account=" + state_of_account +
                '}';
    }
}
