package by.jonline.progwithclass.simpletaskeight;

/*Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами. Задать критерии выбора данных
и вывести эти данные на консоль. Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале*/

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bank {

    private List<Customer> customers;
    private int number;

    {
        customers = new ArrayList<>();
    }

    public Bank() {
    }

    public Bank(int number) {
        this.number = number;
    }


    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Customer customer) {
        this.customers.add(customer);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return number == bank.number && Objects.equals(customers, bank.customers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customers, number);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "customers=" + customers +
                ", number=" + number +
                '}';
    }
}
