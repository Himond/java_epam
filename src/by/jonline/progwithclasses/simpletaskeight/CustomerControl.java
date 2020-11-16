package by.jonline.progwithclasses.simpletaskeight;

/*Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами. Задать критерии выбора данных
и вывести эти данные на консоль. Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале*/

import java.util.Arrays;
import java.util.Comparator;

public class CustomerControl {

    private Customer[] customers;

    public CustomerControl(Customer[] customers) {
        this.customers = customers;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public Customer[] sortBySurname(){
        Customer[] sortcust = this.customers.clone();
        Arrays.sort(sortcust, new SortBySurname());
        return sortcust;
    }

    private static class SortBySurname implements Comparator<Customer> {
        public int compare(Customer a, Customer b){
            String customerFirst = a.getSurname();
            String customerSecond = b.getSurname();
            return customerFirst.compareTo(customerSecond);
        }
    }

    public Customer[] rangeCardNumber(long lower_limit, long upper_limit){
        if(lower_limit < 0 || upper_limit < lower_limit){
            throw new IllegalArgumentException("Invalid range value set");
        }
        int count = 0;
        for (Customer cust: this.customers) {
            if(lower_limit < cust.getCard_number() && cust.getCard_number() < upper_limit){
                count++;
            }
        }
        Customer[] custs = new Customer[count];
        if(count != 0){
            int i = 0;
            for(Customer cust: this.customers){
                if(lower_limit < cust.getCard_number() && cust.getCard_number() < upper_limit){
                    custs[i] = cust;
                    i++;
                }
            }
        }
        return custs;
    }
}
