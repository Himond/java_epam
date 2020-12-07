package by.jonline.progwithclass.simpletaskeight;

/*Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами. Задать критерии выбора данных
и вывести эти данные на консоль. Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале*/

import java.util.*;

public class CustomerLogic {

    public List<Customer> sortBySurname(List<Customer> customers){
        List<Customer> sortcust = new ArrayList<>();
        sortcust.addAll(customers);
        Collections.sort(sortcust);

        return sortcust;
    }


    public List<Customer> rangeCardNumber(long lower_limit, long upper_limit, List<Customer> customers){
        List<Customer> sortcust = new ArrayList<>();
        if(lower_limit >= 0  && lower_limit < upper_limit){
            for (Customer cust: customers) {
                if(cust.getCard_number() >= lower_limit && cust.getCard_number() <= upper_limit){
                    sortcust.add(cust);
                }
            }
        }
        return sortcust;
    }
}
