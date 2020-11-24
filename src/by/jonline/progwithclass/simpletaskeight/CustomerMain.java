package by.jonline.progwithclass.simpletaskeight;

/*Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами. Задать критерии выбора данных
и вывести эти данные на консоль. Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале*/

import java.util.Arrays;

public class CustomerMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1, "Petrov", "Petr", "Petrovich", "Kirova 50", 42, 2344);
        Customer customer2 = new Customer(2, "Vasilev", "Vasilii", "Vasilevich", "Lenina 29", 43, 2348);
        Customer customer3 = new Customer(3, "Ivanov", "Ivan", "Ivanovich", "Leonova 12", 38, 2458);
        Customer customer4 = new Customer(4, "Andreev", "Andrei", "Andreevich", "Kirova 20", 52, 23512);
        Customer customer5 = new Customer(5, "Sidorov", "Pavel", "Ivanovich", "Pushkina 5", 41, 23610);
        CustomerControl customers = new CustomerControl(new Customer[]{customer1, customer2, customer3, customer4, customer5});
        System.out.println(Arrays.toString(customers.getCustomers()));
        System.out.println(Arrays.toString(customers.sortBySurname()));
        System.out.println(Arrays.toString(customers.rangeCardNumber(40, 50)));
    }
}
