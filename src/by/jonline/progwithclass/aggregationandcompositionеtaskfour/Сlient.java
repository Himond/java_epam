package by.jonline.progwithclass.aggregationandcompositionеtaskfour;

/*Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам.
Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.*/


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Сlient {

    private String surname;
    private String name;
    private long passport_id;
    private List<Account> accounts;

    public Сlient(String surname, String name, long passport_id) {
        this.surname = surname;
        this.name = name;
        this.passport_id = passport_id;
        this.accounts = new ArrayList<>();
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPassport_id() {
        return passport_id;
    }

    public void setPassport_id(long passport_id) {
        this.passport_id = passport_id;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public void removeAccount(Account account) {
        this.accounts.remove(account);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Сlient сlient = (Сlient) o;
        return passport_id == сlient.passport_id && Objects.equals(surname, сlient.surname) && Objects.equals(name, сlient.name) && Objects.equals(accounts, сlient.accounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name, passport_id, accounts);
    }

    @Override
    public String toString() {
        return "Сlient{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", passport_id=" + passport_id +
                ", accounts=" + accounts +
                '}';
    }
}
