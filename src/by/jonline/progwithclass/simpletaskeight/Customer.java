package by.jonline.progwithclass.simpletaskeight;

/*Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами. Задать критерии выбора данных
и вывести эти данные на консоль. Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале*/

import java.util.Objects;

public class Customer implements Comparable<Customer>{
    private int id;
    private String surname;
    private String name;
    private String middlename;
    private String addres;
    private long card_number;
    private long account_number;

    public Customer(int id, String surname, String name, String middlename, String addres, long card_number, long account_number) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.middlename = middlename;
        this.addres = addres;
        this.card_number = card_number;
        this.account_number = account_number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public long getCard_number() {
        return card_number;
    }

    public void setCard_number(long card_number) {
        this.card_number = card_number;
    }

    public long getAccount_number() {
        return account_number;
    }

    public void setAccount_number(long account_number) {
        this.account_number = account_number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id && card_number == customer.card_number && account_number == customer.account_number && Objects.equals(surname, customer.surname) && Objects.equals(name, customer.name) && Objects.equals(middlename, customer.middlename) && Objects.equals(addres, customer.addres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, surname, name, middlename, addres, card_number, account_number);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middlename='" + middlename + '\'' +
                ", addres='" + addres + '\'' +
                ", card_number=" + card_number +
                ", account_number=" + account_number +
                '}';
    }

    @Override
    public int compareTo(Customer o) {
        return this.getSurname().toLowerCase().compareTo(o.getSurname().toLowerCase());
    }
}
